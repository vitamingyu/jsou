package pack4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test44JikwonMain {

	ArrayList<Test44Jikwon> list = new ArrayList<Test44Jikwon>();
	
	public void inputData(String args[]) {
		for (int i = 0; i < args.length; i++) {
			Test44Jikwon jikwon = new Test44Jikwon();
			StringTokenizer tokenizer = new StringTokenizer(args[i], ",");
			jikwon.setSabun(tokenizer.nextToken());
			jikwon.setIrum(tokenizer.nextToken());
			jikwon.setGibon(Integer.parseInt(tokenizer.nextToken()));
			//타입 미스 매치라서 인티저
			jikwon.setIbsa(tokenizer.nextToken());
			list.add(jikwon); 
		}
	}
	
	public void printData() {
		//System.out.println(list.size()); 잘 입력되었나 확인용도
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		
		for(Test44Jikwon jik:list) {
			// 근무년수 계산
			LocalDate now = LocalDate.now(); //now는 static이니까 클래스로 바로 부름 스태틱이 아닌 13번은 매번 저렇게 객체를 만들어줘야됨
			int year = now.getYear();
			//System.out.println(year);
			int geunmu = year - Integer.parseInt(jik.getIbsa());
			
			// 근속수당
			int geunsok=0;
			if(geunmu >= 0 && geunmu <=3) {
				geunsok = 150000;
			} else if(geunmu >= 4 && geunmu <= 8) {
				geunsok = 450000;
			} else {
				geunsok = 1000000;
			}
			
			// 공제액
			int gongje;
			if(jik.getGibon()>=3000000) {
				gongje = (int)((jik.getGibon() + geunsok) * 0.005);
			}else if (jik.getGibon() >= 2000000) {
				gongje = (int)((jik.getGibon() + geunsok) * 0.003);
			}else {
				gongje = (int)((jik.getGibon() + geunsok) * 0.0015);
			}
			
			//수령액
			int suryeong = (jik.getGibon() + geunsok) - gongje;
			System.out.println(
				jik.getSabun() + "\t" +
				jik.getIrum() + "\t" +
				jik.getGibon() + "\t" +
				geunmu + "\t" +
				geunsok + "\t" +
				gongje + "\t" +
				suryeong							
				);
		}
		
	}
	
	public static void main(String[] args) {
		// 프로그램 실행시 외부로 부터 직원자료 얻기
		if(args.length == 0) {
			System.out.println("입력 자료가 없어요");
			System.exit(0);
		}
		
	Test44JikwonMain main = new Test44JikwonMain();
	main.inputData(args);
	main.printData();
		

	}

}
