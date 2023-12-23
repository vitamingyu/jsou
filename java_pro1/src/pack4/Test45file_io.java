package pack4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test45file_io {
	// public static void main(String[] args) throws Exception{
	public static void main(String[] args) {
		
		// File 입출력 (파일단위의 입출력만 있는건 아님) - 표준 장치 또는 File단위의 입출력
		// 자바에서는 Stream을 파일 단위의 자료 입출력을 효과적으로 진행할 수 있도록 도와준다.
		
		/*System.out.println("시스템을 이용한 표준 입출력 ---");
		//InputStreamReader 개체를 이용한 표준 입력장치를 사용하는 방법이 있으나 최근에는 스캐너 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름은");
		String ir = scanner.nextLine();
		System.out.println("나이는");
		int nai = scanner.nextInt();
		System.out.println("몸무게는");
		double mugae = scanner.nextDouble();
		System.out.println(ir+"님의 나이는" + nai + ", 몸무게는" + mugae);
		*/
		System.out.println("파일단위의 읽기 ---");
		try {
			File f = new File("c:/work/iotest.txt");
			FileReader fr = new FileReader(f); // file을 읽기위해 내부적으로 장치를 열어줌 *
			BufferedReader br1 = new BufferedReader(fr);
			//System.out.println(br1.readLine());
			while(true) { // 파일의 끝을 모르기 때문에 무한 루프(끝을 만날 때 까지)
				String str = br1.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			br1.close(); // 작업이 끝난 후 장치를 닫음. 안해도 에러는 안 떨어짐, 명시적으로 해줘야 사용한 메모리를 조금 더 빨리 떼어줌 *
			fr.close(); // 뒤늦게 열은 br1부터 닫아주는 관례(사실 순서는 상관 없음) f는 파일, 파일은 안 닫아도 됨
		} catch (Exception e) {
			System.out.println("파일 처리 오류 : " + e.getMessage());
		}
		
		// 버퍼 : 완충기억장치 데이터를 임시로 담아두는 장치
		//주기억 장치와 보조기억 장치 사이에 속도차이를 맞추기 위함
		
		System.out.println("----------");
		System.out.println("data.go.kr 사이트의 csv다운 후 파일단위의 읽기 ---");
		try {
			File f = new File("c:/work/전국도서관.csv");
			FileReader filereader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(filereader);
			int count =0;
			String ss = bufferedReader.readLine(); //첫 줄이니 제목을 읽고
			while(true) {
				count++;
				ss = bufferedReader.readLine(); //여기서부터 데이터값을 읽는다
				if(ss == null || count>=20) break;
				StringTokenizer tok = new StringTokenizer(ss, ",");
				String s1 = tok.nextToken();
				String s2 = tok.nextToken();
				String s3 = tok.nextToken();
				System.out.println(s1 + "\t" + s2 + "\t" + s3);
				
			}
			bufferedReader.close();
			filereader.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
