package pack2; // package명(directory)

//자동차 설계도(=클래스)
public class Test10Car { // [접근지정자][기타제한자] class 클래스명. 여기 나와 있는 변수들은 전역변수. 초기치 안 줘도 에러 안남. 자동으로 0 혹은 0.0 부여
	int wheel; // 멤버변수(멤버퍼필드, 전역변수, 속성-attribute)
	private int airBag=1; //[접근지정자][기타제한자] type(형) 변수명
	//접근지정자 : private,  default, public, protected
	private int speed; //접근지정자가 private인 경우 캡슐화, 프라이빗 안에 가둔다?
	
	public String irum="길동";
	// int인 경우 0으로 초기화,  double인 경우 0.0으로 초기화
	
// 클래스는 맴버로 구성됨
	
	public Test10Car() { // constructor(생성자)
		// 객체 생성시 가장 먼저 수행 : 초기화 담당
		// 클래스와 이름이 같고 반환형이 없는 메소드
		wheel=4;
		speed = 10;
		
		
	}
	
	public void abc() {	//멤버 메소드(method). 괄호있네? 행위를 갖고 있어. public이 아니라 private하면 10Main에서 점 찍어도 안 보임
		System.out.println("abc 메소드 수행");
		System.out.println("에어백 수는 " + airBag);
		System.out.println("바퀴 수는 " + wheel);
		
		def(); //method 호출 def는 못 부르니 abc를 부르고 def를 부른다?
		int result = korea(50); // 매개변수가 있는 method 호출. 이때는 Argument(인수, 인자)를 줌(매개변수를 인수에 전달해 값을 기억)
		System.out.println("result : " + result);
		System.out.println("abc 메소드 수행 완료~~~~");
	}
	private void def() { // 나를 호출할 땐 ()빈 손으로 와
		// 파라미터가 없고 반환값도 없음 (void)
		System.out.println("def 메소드 처리");
	}
	
	private int korea(int jumsu) { //메소드명(parameter)  나를 호출할 땐  int 값을 들고와야돼    
		// 가져갈땐 return. 반환할 때는 1개만 가능 score의 타입이 int기 때문에 void를 int로 바꿈
		//파라미터(매개변수)가 있고(int jumsu가 파라미터임) 반환값 없음
		//parameter는 메서드 정의에서 나열되는 변수명.
		//argument(인수, 인자)는 메서드를 호출할 때, 전달 혹은 입력되는 실제 값.
		System.out.println("kor 메소드 처리");
		System.out.println("jumsu : " + jumsu);
		int score = jumsu + 20;    // score는 지역변수
		return score; //메소드를 호출한 원래 지점으로 반환값을 전달
	}
	
}












