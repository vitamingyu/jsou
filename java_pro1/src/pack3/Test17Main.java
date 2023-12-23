package pack3;

public class Test17Main {

	public static void main(String[] args) {
		// 완성차 운전 
		//Test17PohamCar james = new Test17PohamCar();
		//james.turnHandle(0); err:java.lang.NullPointerException: 
		Test17PohamCar tom = new Test17PohamCar("미스터 톰");
		tom.turnHandle(25);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		//퀀티티는 핸들거고 핸들은 카에 있으니까 점을 찍어서 경로를 찍어줘야 됨. 클래스의 포함관계라는 뜻임(상속엔 이런거 안나옴)
		//tom 객체야 handle 객체야 포함카가 핸들을 갖고있고 핸들이 퀀티티를 갖고 있음
		
		tom.turnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);

		Test17PohamCar oscar = new Test17PohamCar("오스카");
		oscar.turnHandle(-10);
		System.out.println(oscar.ownerName + "의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
		//오스카와 톰은 같은 설계도를 가진 차를 갖고 있지만 차는 두 대다.
		
	}

}
