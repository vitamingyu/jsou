package pack3;

public class Test23Main {

	public static void main(String[] args) {
		// 상속 관련 작업 계속 진행중
		Test23Dog dog = new Test23Dog();
		dog.print();
		System.out.println(dog.callName());
		//사실 부모클래스는 추상화된 개념만 갖고 있음. 객체는 잘 안 만들어줌
	
		System.out.println("\nHouseDog----------");
		Test23HouseDog hd = new Test23HouseDog("집개");
		hd.print();
		hd.show();
		System.out.println(hd.callName());
		
		System.out.println("\nwolfDog----------");
		Test23wolfDog wolfDog=new Test23wolfDog("늑대");
		wolfDog.print();
		wolfDog.show();
		System.out.println(wolfDog.callName());
		wolfDog.wolfDisplay();
		System.out.println("-----");
		
		Test23wolfDog bushdog = wolfDog;
		bushdog.wolfDisplay(); //23번 울프디스플레이와 같은 뜻
		//같은 주소 종류
		
		//wolfDog = null;
		//wolfDog.wolfDisplay(); 이러면 이제 wolfdog는 오류뜨고 bush는 주소가 살아있으니 값이 나옴
		//gc에 의해 Test23WolfDog 인스턴스가 점유한 메모리가 해제
		
		
		
	}
}
