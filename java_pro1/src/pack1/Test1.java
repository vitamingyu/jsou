package pack1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("성공");
		//한줄 주석
		/*
		 * 여러줄 주석
		 *
		 */
		System.out.println("단축키를 추천");
		System.out.print("자바");
		System.out.print("만세\n");
		System.out.println("자바 만세");
		System.out.println();
		
		//기본형 변수( 데이터(=값,리터럴)를 기억하고자 기억장소를 확보하고 기억장소에 이름을 부여)
		//자바는 정수의 경우 int type(4byte)이 기본
		//자바는 실수의 경우 double type(8byte)이 기본

		byte var1; //형식 : 참조형(type) 변수명. 1byte 기억장소(1바이트=8비트) -128~127까지 정수 기억		
		var1=5;
		var1=8;
		var1=-128;
		System.out.println("var1 : " + var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println();
		
		short var2 = 23;	//2byte 기억장소 -32768 ~ 32767까지 정수 기억
		var2 = -32768;
		System.out.println("var2 : " + var2);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println();
		
		int var3; //변수는 주로 소문자를 쓰고 ( * 숫자 등은 에러, 한글로 시작도 가능. 변수명은 영문소문자,_,한글(비권장)로 시작
		//4byte 기억장소 -2147483648 ~ 2147483647까지 정수 기억
		//웹에서는 그냥 int쓰고 실수는 더블 써주면 됨 쇼트니 롱이니 잘 안씀. 다시한번 자바는 기본형이 인티저!
		var3=5;
		System.out.println("var3 : " + var3);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println();
		
		long var4=23; //8바이트 기억장소, 알트키 누르고 화살표 하면 이동, 드래그로 범위잡고 이동도 가능. 자바는 int 밖에 입력이 안되니까 뒤에
		//L을 붙여줘야 됨
		//var4 = 2147483648 입력하면 오류
		var4 = 2147483648L; /*정수 L을 하면 long type의 데이터(값, 리터럴). 처럼 뒤에 L붙여줘야됨
		var4는 long이라 숫자를 받을 수 있는데 자바는 못 받기 때문에 L을 붙여줌
		*/
		
		System.out.println("var4 : " + var4);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		
		double var5 = 2.3; //8byte 실수 기억장소. 소숫점 18번째 자리에서 반올림
		System.out.println("var5 : " + var5);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println();
		
		//float var6 = 2.3; //4byte 실수기억장소. integer 와 double만 알면 됨, 외울필요 없고 느낌만
		//8바이트 자리를 4바이트에 넣으려니 오류. 위에선 해줬는데? 그때만 자바가 배려해준거
		float var6=2.5F;
		System.out.println("var6 : " + var6);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println();
		
		System.out.println("형변환 : 자동(promotion), 강제(casting)"); //이건 중요하니 기억
		byte b1 = 12; //자동형변환이 벌어지고 있다, promotion
		b1 = 127;
		//128넣으면 오류나는데 강제적으로 변환해서 넣음. 하지만 결과값은 그대로 나오지 않아.
		b1=(byte)277; // casting 해준거
		b1=123;
		byte b2=b1;
		
		
		System.out.println("b1 : "+b1 + " " + b2);
		
		short s1 = 123;
		s1=(short)56789;
		System.out.println(s1);
		
		int aa = (int)123.7; //소수 이하 버림
		System.out.println("aa : " + aa);
		
		double bb=123; //정수기억장치를 실수에 넣으면 promotion됨
		System.out.println("bb : " + bb);
		//float cc = bb; 더블인데 플롯에 안가지
		float cc = (float)bb;
		
		System.out.println();
		double result = 4.5*10; //더블과 인티저 연산시 더블로 됨=>연산 시 큰 타입으로 자동 형변환
		System.out.println("result : " + result);
		
		// int result2 = 4.5*10; 얘는 더블로 되는데 int result2에 넣으려니 오류가 남=>type mismatch
		int result2=(int)4.5*10; //4.5를 정수로 바꾼 4*10으로 함. 40나옴
		int result3=(int)(4.5*10); // 45.0을 int로 바꾼 45가 나옴
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println();
		
		boolean bu1=true;
		bu1=false;
		System.out.println("bu1 : " + bu1); //부울은 트루 펄스만, 논리형(참 or 거짓 결과를 기억)
		// System.out.println("bu1 : " + (int)bu1); //부울을 인티저 변환 못시킴
		
		
		System.out.println();
		char c1='a'; //'문자'
		//큰따옴표쓰면 에러임.type mismatch
		//c1="a"; 이건 '문자열', "문자열"을 char type에 저장 불가
		//c1='abc'; 이것도 안돼! 왜? '문자' 한 개만 허용
		System.out.println("c1 : " + c1);
		System.out.println("c1 : " + (int)c1); //캐릭터는 숫자로 바꿀 수 있구나, 아스키 코드로 변환해서 숫자로 바꿈
		System.out.println("c1 : " + (char)97); //10진수를 아스키 코드를 통해 문자로 바꿔라
		
		System.out.println();
		
		//상수
		int kor = 90;
		kor = 80; //이건 변수, 왜? 90을 기억하고 있다가 80을 주면 덮어씀
		final int ENG = 100;
		// eng = 90; 하면 오류남. final은 상수라서 다른걸로 못 덮음
		//상수는 이름을 줄 때 대문자로 주기로 약속하자~~~~
		final double PI=3.1415927;
		
		
	} 
	
}
