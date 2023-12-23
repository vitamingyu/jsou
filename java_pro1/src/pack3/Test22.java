package pack3;

public class Test22 { 
	//클래스 메서드 생성하고 호출
	//인스턴스 메서드 생성하고 호출
	
	int a,b;
	int d() {
		return a+b;
	} //인스턴스 생성. 전역변수까지 포함. d는 매서드이자 객체
	
	static int c(int a, int b) {
		return a+b;
	} //클래스 메서드 생성
	//static 지역변수 사용시 씀. 객체생성없이 호출가능. 전역변수 필요없음
	
	
	
	public static void main(String[] args) {
	System.out.println(Test22.c(1, 2));
	//클래스메서드 호출
	
	Test22 test = new Test22(); //인스턴스 생성
	test.a=200;
	test.b=100;
	System.out.println(test.d()); //인스턴스 호출
	
	
	}
}