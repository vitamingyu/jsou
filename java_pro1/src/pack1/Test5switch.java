package pack1;

import java.util.Scanner;

public class Test5switch {

	public static void main(String[] args) {
		// 제어문 중 조건판단문 : switch - 조건판단문의 좀 더 정형화된 값에 따라 여러 방향으로 분기하는 경우 사용
		// 길게 늘어진 if문에 비해 코드가 짧고 의미파악이 쉽다.
		int nai =25;
		nai = nai / 10 * 10;
		System.out.println(nai); //=> 실수가 아니라 정수 나누기 이기 때문에 나누기하면 2나오고 곱하기 10하면 출력 값은 20
		switch(nai) {
		case 20:
			System.out.println("이십대");
			System.out.println("청춘");
			break;
//		만약에 
//		case 20:
//		case 30:출력물
//		이런 경우라면 20이 나왔을 때 20대도 30의 출력값이 나옴.
//		즉 20대 또는 30대라는 의도로 만들 수 있지.
		case 30:
			System.out.println("삼십대");
			break;
		case 40:
			System.out.println("사십대");
			break; 
		default:
			System.out.println("기타");
			break; //마지막이라 break안써도 무방하지만 다른 언어에서는 써줘야 하기 때문에 웬만하면 break는 마지막까지 쓰자
		}
		
		
		System.out.println();
		String jik="과장";
		switch(jik) {
			case "대리":
				System.out.println("대리야!");
				break;
			case "과장":
				System.out.println("과장 만세");
				break;
		}
		
		double su1 = 10.0; //키보드로 입력 받아야하는데 그냥 입력해줄게~
		double su2=3.5;
		char op = '/';
		double result=0.0;
		switch(op) {
		case '+':
			result=su1+su2;
			break;
		case '-':
			result=su1-su2;
			break;
		case '*':
			result=su1*su2;
			break;
		case '/':
			if(su2==0.0) {
				System.out.println("0으로 나누면 안돼~~~~");
				return; //method를 탈출하는 명령. main을 탈출함
			}
			result=su1/su2;
			break;
		}
		System.out.println("연산 결과는 "+result);
		
		System.out.printf("%f",result);		//소수 6째자리 까지만 표시해줘
		System.out.println();
		System.out.printf("%.2f\n",result); //소수 2째자리 까지
		System.out.printf("%03d",(int)result); //정수 3자리까지만 표시하라는 서식
		System.out.println();
		
		//키보드로 부터 년과 월을 받아 해당년월 날수 출력
		//출력 예) 2023년 7월 31일은 평년
		//윤년체크 윤년공식 4로 나누어 떨어지는 년도, 4로 나누어 떨어지더라도 100으로 떨어지면 평년 근데 400으로 나누어 떨어지면 윤년
		int year, month, days=28;
		String msg="평년";
		Scanner scanner = new Scanner(System.in);
		System.out.print("년 입력:");
		year = scanner.nextInt();
		System.out.print("월 입력:");
		month = scanner.nextInt();
		if(month <1 || month > 12) {
			System.out.println("월은 1~12 사이만 허용");
			System.exit(0); //프로그램 강제 종료
		}
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			days=29;
			msg="윤년";
		}
		switch(month) {
		case 1:
		case 3:
		case 5:		
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			break;
		}
		System.out.println(year+"년 "+month +"월은 "+days +" "+msg);
		System.out.println();
	}

}
