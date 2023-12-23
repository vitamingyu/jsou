package pack3;

public class Test17PohamCar {
	//여러 개의 부품 클래스로 완성차 클래스를 제작
	//프로젝트가 달라지면 jar해줘야됨
	//포함은 클래스를 재사용할 수 있는 방법으로, 클래스의 맴버로 다른 클래스 자료형의 참조 변수를 선언하는 것
	int speed = 0;
	String ownerName, turnShow; //맴버필드 만드는 중
	Test17PohamHandle handle;  //클래스의 포함 관계(has a 관계). car안에 handle이 포함되어있음
	//혹은 Test17PohamHandle handle = new Test17PohamHandle(); 이렇게 써도 됨
	
	public Test17PohamCar() {
		//8번으로 쓸거면 9번의 new해줘야됨 여기선 아래서 해줬으니 ㄱㅊ
	}
	public Test17PohamCar(String name) {
		ownerName=name;
		handle = new Test17PohamHandle();
		
	}
	void turnHandle(int q) {
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);
		if(q == 0) turnShow = handle.straight(q);
		
	}
}
