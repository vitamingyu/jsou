package pack3;

public class Test24PolyCar { //자동차 원형클래스= 자동차 슈퍼 클래스
	protected int speed = 50; //test24polycar는 슈퍼클래스구나, 부모구나 = protected를 통해 알 수 있음
	
	public Test24PolyCar() {
		System.out.println("나는 자동차야~~");
	}

	public void dispData() {
		System.out.println("속도 : " + speed);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
}
