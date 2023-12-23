package pack3;

public class Test21 extends Object{ //모든 클래스는 오브젝을 상속받는다, 메이커가 기본으로 상속주는거, import java.lang도 생략가능
//public class Test21{ 사실은 위에처럼 써줘야 정석에 맞음
	public Test21() {
		System.out.println("생성자");
	}
	@Override //annotation - 설명, 약속. 메이커측에서 만들어둔 메써드. 지워도 됨. 오버라이딩 하도록 감시함
	public String toString() {
		// object 클래스의 toString 메소드를 override
		return "와우 오묘하군";
		//앞으로는 아래처럼 객체의 주소를 찍으면 위와같은게 뜸. 오버라이드
	}
	
	public static void main(String[] args) {
		Test21 test21 = new Test21();
		System.out.println(test21);
		
		System.out.println(test21.toString());
		
		
		
	}

}
