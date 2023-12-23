package pack4;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test43Main {
	ArrayList<Test43HaksaengDto> list = new ArrayList<Test43HaksaengDto>();
	
	public void inputData(String[] datas) {
//		//김밥과 100점이 문자로 들어가니까 총점을 못 구해, 문자열 자르기 클래스 사용할거야
//		StringTokenizer tokenizer = new StringTokenizer("kbs,mbc,sbs",",");
//		//위의 문자열을 콤마로 구분해~ 라는 뜻
//		
//		String s1 = tokenizer.nextToken();
//		String s2 = tokenizer.nextToken();
//		System.out.println(s1 + " 이어서 " + s2);
//		//스트링을 의미를 알 수 있는 토큰으로 잘라줄거야
//		System.out.println(datas[0]);
		System.out.println(datas.length);
		for (int i = 0; i < datas.length; i++) {
			StringTokenizer tokenizer = new StringTokenizer(datas[i], ",");
			String irum = tokenizer.nextToken();
			int kor = Integer.parseInt(tokenizer.nextToken()); //스트링을 인트로 못 받아 : 에러뜸=>형변환
			int eng = Integer.parseInt(tokenizer.nextToken());
			int mat = Integer.parseInt(tokenizer.nextToken());
			Test43HaksaengDto dto = new Test43HaksaengDto();
			//덮어쓰기 하면 안되니까 여기에 담아둘게=>collection, 타입이 다르니까 dto로 담을게
			dto.setName(irum);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			list.add(dto);
			
		}
	}
	
	public void calcPrintData() {
//		for(Test43HaksaengDto hak:list) {
//			
//		}
		System.out.println("이름\t총점\t평균");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i)); 잘 출력되는지 확인정도
			Test43HaksaengDto dto = new Test43HaksaengDto();
			dto = list.get(i);
			int tot = dto.getKor() + dto.getEng() + dto.getMat();
			double avg = tot / 3; 
			System.out.println(dto.getName() + "\t" + tot + "\t" + avg);
			count++;
		}
		System.out.println("인원수 : " + count);
		// or syso(인원수 : + list.size());
	}
	
	public static void main(String[] args) {
		//레코드 단위(Dto)의 자료 처리
		String [] datas = new String [3]; //csv 콤마로 분류되어있는 밸류를 칭함
		datas[0]="김밥,100,100,100"; //파일 또는 DB 등을 이용해 입력된 자료라 가정
		datas[1]="공기밥,80,70,87";
		datas[2]="주먹밥,76,77,88";
		
		Test43Main test43Main = new Test43Main();
		test43Main.inputData(datas); //collection(List)에 자료 기억
		test43Main.calcPrintData(); //collection(List)에 자료를 읽어 총점, 평균을 계산 후 출력
		

	}

}
