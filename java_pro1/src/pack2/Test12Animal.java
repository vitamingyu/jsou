package pack2;

public class Test12Animal {
	// method overload : 하나의 클래스 내에 동명 메소드 여러 개를 선언
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;
	
	public Test12Animal() {
		// 생성자는 내용이 없을 경우 생략 가능
		
		//나만의 클래스를 만든거임 맴버는 위와 같고 메서드는 아래와 같음
	}
	public Test12Animal(int leg) { //생성자 오버로딩
		this.leg=leg;		
	}
	
	public Test12Animal(int leg, String name) { //생성자 오버로딩
		this.leg=leg;
		this.name=name;		
	}
	//생성자 오버로딩 가능하니 메서드 오버로딩도 가능함. 방식은 둘이 같음
	//---------------------------------------
	public void display() {
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
	} //여기 age는 저 위에 private age와 같다. 전역변수다
	
	public void display(int age) { //method overloading이다(재명명) 
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
	} //여기 age는 저 위에 private age와 다르다. 위에 줄 int age의 지역변수다
	
	public void display(String name) { //method overloading이다(재명명) 
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
	} //파라미터의 성립 조건 1. 매소드 파리미터의 개수, 순서, 타입이 다르면 된다. 셋 중 하나
	
	public void display(int age, String name) { //method overloading이다(재명명) 
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
		this.age = age;
		this.name=name;
	}
	
	public void display(String name, int age) { //method overloading이다(재명명) 
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
		System.out.println(MOUTH); //static이라 일반 매서드에서도 불러올 수 있음
	}
	
	//오버로딩 오류 모음
//	public void display(int leg) {
//		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
//	} int이기 때문에 leg인지 age인지 구분이 안 감. 그냥 int하나 짜리로 인식해서 중복으로 인식함
//	public void display(int leg, int age) { //int int는 오버로드 성립
//		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
//		return 10; 
	// 앞에 public과 private로 구분주면 같은 파라미터 되는거 아니야? 응 아니야. 이름이랑 파라미터만으로만 구분해
	
//	}
	
	public void showData() {
		System.out.println("leg:" + leg + ", age : " + age + ", name: " + name);
	}	
	
	
}
