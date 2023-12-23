package pack1;

import java.math.BigDecimal;

public class Test2 { 

	public static void main(String[] args) {
		// <연산자>
		//치환 연산자
		int a=5; //이때 이퀄 '='은 치환 연산자 입니다
		
		// 산술
		int b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나눈 몫만 취함, 나머지는 버림
		System.out.println(a%b); //나눈 나머지
		System.out.println(a/ (double)b); //b를 실수로 바꿨으니 a도 실수로 바뀌지? 큰 값으로 자동 바뀐댔지? / 실수 나누기
		
		//이 아래론 참고. System.out.println(a/0); 0으로 나눌 수 없으니 불능
		System.out.println(a/0.0); //무한대. 0.0은 완벽한 0이 아니기 때문에 0이 안나옴
		System.out.println(0/0.0); //에러는 아니지만 not a number. NaN 값이 뜸
		System.out.println(3+4*5);
		System.out.println((3+4)*5);
		// 연산자 우선순위
		// () > 산술(*, / > + , -) > 비교(관계)연산 > 논리연산 > 치환연산. 왼쪽부터 우선순위. 치환연산이 꼴찌
		
		// 문자열 더하기
		String ss1="대한"; // String은 기본형이 아니고 참조형. 그런데 마치 기본형 처럼 선언하고 사용. 문자들을 더하면 문자열
		String ss2="민국";
		String ss3=ss1+ss2; // 문자열 더하기 연산자
		System.out.println("ss3 : " + ss3);
		System.out.println("ss3 : " + ss3+" "+20+23);
		// String ss4=5+6; 11은 숫자형이기 때문에 문자형에 저장 못함
		String ss4="5"+6;
		System.out.println(ss4); //=>56 output
		
		//int imsi="5"+6; => 문자열 5와 6이 만들어지겠지 그래서 오류남
		int imsi=Integer.parseInt("5")+6; //=>5라는 문자를 숫자로 변형해줄래? -> parseInt
		System.out.println(imsi); //=>11 output
		String ss5=Integer.toString(5)+6; //=>숫자였으나 5라는 숫자가 문자열로 바뀜. 형변화를 명시적으로 함
		System.out.println(ss5);
		
		// 누적
		int no=1;
		no=no+1;
		no +=1; // 다 같은 +1을 해주는건데 아래처럼 컴터가 더 이해하기 쉽게 써주면 속도가 조금 더 빨라짐. 속도 싸움 이잖아?
		no++; // ++변수,--변수, 변수++, 변수-- 이렇게 쓰는 것도 가능. 이걸 증감연산자라 한다. 후의증감연산자
		++no; // 전의증감연산자
		System.out.println("no : "+no);
		
		//증감연산자는 가급적 다른 연산자와 함께 기술하지 않는다.
		int su=5;
		int result = ++su +1; //전의기 때문에 su에 1을 먼저 더하고 나중에 1을 더한다.
		System.out.println("su : " + su);
		System.out.println("result : " +result);
		
		int su2=5;
		int result2 = su2++ +1; //후의기 때문에 뒤에 1을 먼저 더하고 result2에 입력. 그리고 ++로 1을 더함. 다른연산자와 연산을 끝내고 들가
		System.out.println("su2 : " + su2);
		System.out.println("result2 : " +result2);
		
		// 부호에 대해
		System.out.println();
		int number=3;
		System.out.println("number : "+ number);
		System.out.println("number : " + -number);
		System.out.println("number : " + number*-1);
		System.out.println();
		
		// 관계/논리 연산자
		int aa=5;
		System.out.println(aa>3); //== 같다, != 같지않다
		System.out.println(aa !=3);
		System.out.println();
		
		int bb=10;
		System.out.println(aa>3 && bb<=10); //=>&& 논리곱에 해당됨, and의 의미를 갖고 있음, ||은 or의 값을 갖고있음(쉬프트 백스페이스
		System.out.println(aa>6 || bb <20); //bb <20 연산자 우선순위에 의해 bb<2*10으로 써줘도 됨
		System.out.println();
		
		//shift연산자. 잘 만나지는 못함
		int ii=8, ij; //=>4byte(32bit) 기억장소 2개 선언
		//System.out.println(ii+" " + ij); // ij에 아무 값도 선언 안 했기 때문에 에러뜸. 지역변수는 초기화가 필요하다. 로칼과 글로벌, 지역변수와 전역변수가 있다. 
		System.out.println("ii : " + ii+" "+Integer.toBinaryString(ii)); //2진수
		//System.out.println("ii : " + ii+" "+Integer.toHexString(ii)); //8진수
		//System.out.println("ii : " + ii+" "+Integer.toOctalString(ii)); //16진수
		ij=ii << 1; //좌측으로 1bit이동. 남는 우측은 부호와 같은 값(0)으로 채움
		System.out.println("ij : " + ij+ " " + Integer.toBinaryString(ij));
		
		ij=ii >> 2; //우측으로 2bit이동. 남는 좌측은 부호와 같은 값으로 채움. 양수면 0 음수부호면 1임
		System.out.println("ij : " + ij+ " " + Integer.toBinaryString(ij));
		
		ij=ii >>> 2; //우측으로 2bit이동. 남는 좌측은 0으로 채움
		System.out.println("ij : " + ij+ " " + Integer.toBinaryString(ij));
		
		System.out.println();
		
		
		//삼항 연산자
		int kbs=9;
		int mbc = (kbs <= 5)?100:200 + 100; //(조건)?뒤 참일때 수행 :뒤의 값, 조건일때 수행
		System.out.println("mbc : " + mbc);
		
		
		//컴퓨터가 실수 연산시 오류를 발생시킬 때 처리
		double aaa=2.0;
		double bbb=1.1;
		System.out.println(aaa+bbb);
		System.out.println(aaa-bbb);
		BigDecimal d1=new BigDecimal("2.0");
		BigDecimal d2=new BigDecimal("1.1");
		System.out.println(d1.subtract(d2));
		//빅데시마는 정확한 정수 계산을 위해 클래스를 써줌. 자바의 문제는 아니고 컴퓨터 자체의 문제임
		
		
		
		 
		

	}

}
