package pack3;

public class Test24PolyTaxi extends Test24PolyCar {
	private int passenger = 2;
	
	public void show() {
		System.out.println("난 택시라고 해~");
	}
	
	@Override  // annotation / 어노테이션 or 메타데이터
	public void dispData() {
		System.out.println("택시의 승객은 " + passenger);
		
	}
	
	

}
