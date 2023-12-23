package pack3;

public class Test24PolyBus extends Test24PolyCar {
	private int passenger = 10;
	
	public Test24PolyBus() {
		//super(); extends가 있기때문에 super()가 자동생성되었는데 보이진 않음
		//기본생성자는 생략이 가능해서 안써준거임
	}
	public void show() {
		System.out.println("버스");
	}
	
	@Override  // annotation / 어노테이션 or 메타데이터
	public void dispData() {
		System.out.println("버스의 승객은 " + passenger);
		System.out.println("버스의 속도는 " + speed);
		
	}
	
	

}
