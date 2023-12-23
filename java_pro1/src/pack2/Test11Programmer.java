package pack2;

public class Test11Programmer {
	//Programmer 타입의 클래스 작성
	//아직 프로그램 실행 되지 않음. main 메소드 있어야됨. 메모리에 로드되지 않음
	public String nickName;
	private int age;
	String spec = "자바 전문 개발자"; //앞에 public같은거 없으니 디폴트임 언제나 참조가능
	//위는 instance소유
	
	public static String motto = "자바 선수가 되자!";
	//위는 class 소유
	public final double PI=3.14; //instance소유 readonly
	//파이널 값은 변수를 쓸 때 대문자로만 쓰자!
	public final static double KOR=99.0;
	//변수값 수정 불가 class소유라 바로 불러올 수 있음
	
	
	//static 붙이는 순간 motto가 기울어짐. 스태틱임을 강조
	//스태틱이 붙어야 옆 자바에서 Test11Programming. 점찍는순간 motto가 보임 스태틱 안 쓰면 안 뜸
	
	
	public Test11Programmer() {
		System.out.println("난 생성자");
		System.out.println("초기화 할 것이 없을 때는 적지 않아도 인정");
		nickName = "자바 귀신";
		age=25;
		//displayData();
		
	}
	public void displayData() {
		String sp=reSpec();
		System.out.println("별명이 " + nickName + "인 그의 나이는" + age + "살");
		System.out.println("reSpec 처리 후 spec은 " + sp);
		//age와 nickname이 지역 안에 없으니까 위로 올라가서 클래스 맴버를 살펴봄
		
	}
	
	private String reSpec() { //파라미터 없는 반환형. 위에서 내려와서 웹 전문가를 반환함. return울 만나면 돌아감
		//return아래로는 실행 안함. 웹 전문가라는 문자를 반환하기 때문에 respec앞에 String타입으로 해주고 얘를 반환받는 32번 String sp = 도 String으로, 타입을 맞춰줘야함
		
		return "웹 전문가";
	}
		//Main의 8째 줄까지가 별명이 자바 귀신인 그의 나이는 0살까지 출력
		/*어쩌구 저쩌구...
		난 생성자
		초기화 할 것이 없을 때는 적지 않아도 인정
		별명이 자바 귀신인 그의 나이는0살
		tom의 별명은 자바 귀신
		tom의 스펙은 자바 전문 개발자
		*/
		//위에서 displaydata를 주석처리 해주고 Main에 12라인을 추가해줌
		/*
	어쩌구 저쩌구...
	난 생성자
	초기화 할 것이 없을 때는 적지 않아도 인정
	tom의 별명은 자바 귀신
	tom의 스펙은 자바 전문 개발자
	별명이 자바 귀신인 그의 나이는25살
		 */
	
	// getter, setter 메소드
	// private 맴버에 대해 클래스 밖에서 참조하기
	public void setAge(int age) { //setter 메소드라 부름
		this.age = age; //클래스 내에서 지역변수와 전역변수를 구분하기 위해 this를 쓴다. 클래스 내에서 자신의 맴버를 지정하기위해
		//지역변수 age를 전역변수 age에 치환
	}
	public int getAge() { //A는 대문자로 써주자. getter메소드라 부름
		return age;
	}
//public static void main(String[] args) { //main메소드가 있기 때문에 프로그램 실행 가능(run as)
//		
//		args를 스트링으로 받았네, 잠시 클래스 접고 예시 아래
//		System.out.println("args : " + args[0]);
//		System.out.println("어쩌구 저쩌구...");
//		
//		Test11Programmer 형 객체 생성
//		Test11Programmer tom = new Test11Programmer();
//		System.out.println("tom의 별명은 " + tom.nickName);
//		System.out.println("tom의 나이는 " + tom.age); 넌 private라 찍을 수 없어~
//		System.out.println("tom의 스펙은 " + tom.spec);
//		tom.displayData();
//		
//		System.out.println("getter/setter");
//		System.out.println(tom.age); private맴버이므로 접근 안됨. 
//		tom.setAge(30);
//		System.out.println("tom의 나이는 " + tom.getAge());
//		11Main 처럼 별도의 클래스를 만들어도 되고 이처럼 main을 클래스 안에 넣어두면 실습할때 편함, 실제 운영할 땐 이렇겐 안함
//		
//		
	
	
	public static void myMethod() {
		System.out.println("클래스의 이름으로 호출 가능한 메소드");
		System.out.println("나의 모토는 " + motto);
		// System.out.println("나의 나이는 " + age); age는 static이 아니라 안 찍힘
		//reSpec(); 85위에서 static 메소드로 불러왔기 때문에 못 부르는거임 static지정된 motto만 불러올 수 있는거
		//객체가 만들어 지지 않는 경우엔 불러올 수 없음 하지만 일반 객체에서 스태틱은 불러올 수 있음
		//스태틱 맴버는 일반 맴버를 불러올 수 없다. 일반 맴버를 불러오려면 인스턴스화 해야한다.
		
	}	

	
}
