package pack3;

public class Test32FlyerMain {

	public static void main(String[] args) {
		System.out.println(Test32Flyer.FAST);
		
		Test32Bird bird = new Test32Bird();
		bird.fly();
		
		Test32Airplane airplane = new Test32Airplane();
		airplane.fly();

		System.out.println();
		Test32FlyerUtil.showData(bird);
		System.out.println();
		Test32FlyerUtil.showData(airplane);
		
	}

}
