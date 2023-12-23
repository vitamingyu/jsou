package pack1;

import java.util.Scanner;

public class Test4if {

	public static void main(String[] args) {
		// 제어문 중 조건판단문 : if
		int num=2;
		
		//if(num >= 3)
			//System.out.println("크군요"); //조건이 참일 때만 발현됨. 위 if문에 종속됨
		    // System.out.println("와우!"); //조건이 거짓일 때 수행할게 없음. 단순 if문임
		    //참일때 수행하는걸 2개이상 하고 싶으면 묶어! {}로 블럭화
		
		if(num >= 1) {
				System.out.println("크군요"); //조건이 참일 때만 발현됨. 위 if문에 종속됨
			    System.out.println("와우!");
			    int su=10;
			    System.out.println("블럭 내의 su(지역 변수) : " + su);
		}
	    //System.out.println("블럭 내의 su : " + su); 위의 영억(지역변수)에서만 선언 되어있기 때문에 블럭 밖에선 쓸 수 없음
		
		if(num >=1 ) {
			System.out.println("참일 때");
		} else {
			System.out.println("거짓일 때");
			System.out.println("거짓일 때2");
		}
		
		System.out.println("\n다중 if---");
		//키보드로 자료 입력 받기
		/*Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : "); //ln없다 커서 옆에 있는거야
		String irum=sc.next();
		System.out.println("이름은 " + irum);
		System.out.println("점수 입력 : ");
		int jumsu=sc.nextInt();
		*/
		
		
				
				
		int jumsu=50;
		
		if(jumsu>=70) {
			if(jumsu >= 90) {
				System.out.println("수");
			}else {
				System.out.println("보통");
			}
		}else {
			if(jumsu >=50) {
				System.out.println("저조");
			}else {
				System.out.println("엄청 저조");
			}
		}
		//4가지 경우중에 하나만 실행되겠지?
		
		jumsu = 75;
		String msg="";
		if(jumsu>=90) {
			msg="수";
		}else if(jumsu >= 80) {
			msg="우";
		}else if(jumsu >= 70) {
			msg="미";
		}else if(jumsu >= 60) {
			msg="양";
		}else {
			msg="가";
		}
		
		
		System.out.println("결과는 " + msg);
			
		//8세 이하 65세 이상은 입장료 무료
		//9세 이상 20세 미만은 입장료 3,000원
		//20세 이상 65세 미만은 입장료 5,000원
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age = scan.nextInt();
		
		
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}else if(9<= age && age <20) {
			System.out.println("3,000원");
		}else if(20<=age && age<65) {
			System.out.println("5,000원");
		}
		/* 혹은 아래와 같이 쓸 수 있다. 하지만 아래는 싹 물어보기 때문에 위에 방법이 더 좋은 방법이다.
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}
		if(9<= age && age <20) {
			System.out.println("3,000원");
		}
		if(20<=age && age<65) {
			System.out.println("5,000원");
		}
		*/
		
		int total =0; //최종 금액
		if(9<= age && age < 20) {
			total=3000;
		}else if(20<=age && age<65) {
			total=5000;
		}
		System.out.println("입장료는 "+ total + "원");
		
		//문제
		//키보드로 상품명, 수량, 단가를 입력받아 아래와 같이 출력
		//금액 = 수량 * 단가
		//금액이 5만원 이상이면 금액의 10%를 세금으로 징수
		//금액이 5만원 미만이면 금액의 5%를 세금으로 징수
		//출력 --> 상품명:ooo 금액:ooo 세금:ooo 최종액:ooo
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name=sc.next();

		System.out.print("수량입력 : ");
		int count=sc.nextInt();
	
		System.out.print("단가입력 : ");
		int price=sc.nextInt();
		int mon=count*price;
		
		double tax=0;
		if(mon>=50000) {
			tax = mon * 0.1;
		}else {
			tax = mon * 0.05;
		}
		double fin=mon-tax;
		System.out.println("상품명: " + name + ", 금액: " + mon + ", 세금: " + tax + ", 최종액: " + fin);
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품명 : ");
		String sangpum=scanner.next();
		System.out.print("수량 : ");
		int su=scanner.nextInt();
		System.out.print("단가 : ");
		int dan=scanner.nextInt();
		int keum=su*dan;
		double se=0.0;
		if(keum >= 50000) {
			se = keum * 0.1;
		}else {
			se=keum*0.05;
		}
		System.out.println("상품명:"+sangpum+"금액:"+keum+"세금:"+se+"최종액:"+(keum-se));
		
		
		
		
		System.out.println("프로그램 종료");
		
	}

}
