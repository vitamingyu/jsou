package pack3;

import java.util.Iterator;

public class Test24PolyMain {

	public static void main(String[] args) {
		// 다형성(폴리모피즘)
		// 다형성이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미
		Test24PolyCar car1=new Test24PolyCar();
		Test24PolyBus bus1=new Test24PolyBus();
		Test24PolyTaxi taxi1=new Test24PolyTaxi();
		//왜 자동차 3번이 찍히지??????
		
		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		System.out.println();
		bus1.dispData();
		bus1.show();
		System.out.println(bus1.getSpeed());
		
		System.out.println();
		taxi1.dispData();
		taxi1.show();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("-------");
		Test24PolyCar car2 = new Test24PolyBus();
		//car2는 폴리카 타입. 거기에 폴리 버스의 객체를 줌
		// 왼쪽은 부모객체 변수 오른쪽은 자식 객체 변수. 프로모션으로 주소 줌
		car2.dispData(); //오버라이딩된 메소드는 호출 가능. 
		//car2.show();
		//err : 오버라이딩이 안되었기 때문에 에러가 난다. 자식 고유의 메소드는 호출 불가(불간섭의 원칙)
		//car2의 타입은 부모객체인데 폴리버스의 값을 출력(dispData)
		System.out.println(car2.getSpeed());
		
		System.out.println();
		Test24PolyCar car3 = taxi1;
		car3.dispData();
		System.out.println(car3.getSpeed());
		
		System.out.println("부모, 주소 캐스팅");
		//Test24PolyBus bus2 = new Test24Polycar();
		//err : 자식의 객체 주소에 부모 객체의 인스턴스를 넘기려니 안됨
		//되는 방법도 없음
		//Test24PolyBus bus2 = car1; 위와 같은 이유로 안됨
		
		//Test24PolyBus bus2 = car2;
		//car2가 폴리버스 값을 갖고있지만 타입미스매치
		Test24PolyBus bus2 = (Test24PolyBus)car2;
		//캐스트 연산으로 해줌. 부모타입이지만 자식 객체의 주소를 가지므로 캐스팅이 가능
		bus2.dispData();
		System.out.println(bus2.getSpeed());
		bus2.show(); //32번째줄 불간섭의 원칙을 여기서는 가능하게 됨
		
		System.out.println();
		//Test24PolyTaxi taxi2=new Test24PolyCar();
		//Test24PolyTaxi taxi2=new Test24PolyBus();
		//주소 캐스팅 안되는 예들, 위 2개
		Test24PolyTaxi taxi2 = (Test24PolyTaxi)car3;
		taxi2.dispData();
		
		System.out.println();
		//Test24PolyTaxi taxi3 = (Test24PolyTaxi)car1;
		//sintax에러는 아님. 문법적으론 이상없으나 안됨
		//ClassCastException 캐스팅을 이렇게 주면 런타임 에러야. car1은 폴리카인데 어케 택시로 캐스팅을 해
		
		System.out.println();
		Test24PolyCar polyCar = null;
		Test24PolyBus polyBus = new Test24PolyBus();
		Test24PolyTaxi polyTaxi = new Test24PolyTaxi();
		
		System.out.println("\n폴리(다형성) 예시");
		polyCar = polyBus; //프로모션
		polyCar.dispData();  //1
		// => 버스의 승객은 10
		// => 버스의 속도는 50
		System.out.println();
		polyCar = polyTaxi; //프로모션
		polyCar.dispData();  //2
		// => 택시의 승객은 2
		
		System.out.println();
		Test24PolyCar p[] = new Test24PolyCar[3];
		p[0] = car1; //속도 : 50
		p[1] = polyBus;
		p[2] = polyTaxi;
		//p는 polyCar 타입. 부모니까 폴리버스, 폴리택시 올 수 있음
		for (int i = 0; i < p.length; i++) {
			p[i].dispData();
			
		}
		System.out.println();
		for(Test24PolyCar c:p) {
			c.dispData();
		} //배열은 기본 for 말고 인네스트(?) for 사용할 수 있음
		//p는 폴리카 타입 p로부터 하나씩 빠져나와. 87 88 89 한줄씩 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
