package pack3;

public abstract class Test26Jepum { 
	//추상클래스. 추상클래스는 인스턴스, new 할 수 없음. 부모의 역할만 가능
	//추상클래스는 추상메소드를 가지는게 일반적이고 일반메서드도 가질 수 있다.
	//자식의 생성자에서 부모의 생성자를 부를 수 있기 때문에 생성자 생성도 가능하다
	public int volume = 0;
	
	public Test26Jepum() {
		System.out.println("추상 클래스 생성자");
	}
	
	public abstract void volumeControl(); 
	//부모클래스에서 바디를 없애버림
	//바디가 없는 매소드를 추상메소드라 한다.
	//자식은 이걸 반드시 오버라이딩 해야됨
	
	public void volumeShow() {
		System.out.println("소리 크기 : "+ volume);
	} //얘는 해도되고 안해도 되고
	
	
}
