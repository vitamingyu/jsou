package pack2;

import java.time.LocalDate;

public class Test15SingletonMain {
	public static void main(String[] args) {
		//싱글톤에 대한 이야기를 할 것임. 특정 클래스에 객체인스턴스가 하나만 만들어지도록 해주는 패턴. 
		//싱글턴 패턴을 사용하면 전역변수를 사용할 때와 마찬가지로 객체 인스턴스를 어디서든지
		//액세스 할 수 있게 만들 수 있다. 클래스 인스턴스를 하나만 만들고 그 인스턴스로의 전역접근을 제공.
		
		Test15Singleton s1 = new Test15Singleton();
		Test15Singleton s2 = new Test15Singleton();
		System.out.println(s1 + " " + s2);		
		//=>pack2.Test15Singleton@6f2b958e pack2.Test15Singleton@1eb44e46
//		두개의 주소가 다름
		System.out.println(s1.kor + " " + s2.kor);
		//두 개의 객체는 주소가 다름
		//매번 객체를 저렇게 만들지 않고 하나의 객체를 공유. 그게 싱글턴패턴. 이제 써볼게
		
		System.out.println("\n");
		Test15Singleton ss1 = Test15Singleton.getInstance();
		Test15Singleton ss2 = Test15Singleton.getInstance();
		System.out.println(ss1 + " " + ss2); //=>pack2.Test15Singleton@1c4af82c pack2.Test15Singleton@1c4af82c
		//두 개의 주소가 같음
		System.out.println(ss1.kor + " " + ss2.kor);
		//인스턴스를 따로 잡아야하는 경우가 대부분. 싱글턴은 특별한 경우
		System.out.println();
		
		LocalDate now = LocalDate.now();  //싱글톤을 쓰고 있구나 -> 반환형이 LocalDate. now가 기울어져 있으니 static 싱글톤은 스태틱 써줌
		System.out.println(now.hashCode());
		LocalDate now2 = LocalDate.now(); 
		System.out.println(now2.hashCode());
		// => 둘이 주소가 똑같네!
		System.out.println(now.getYear());
		//여러개를 써도 인스턴스는 하나
		
	}
}
