package pack3;

public class Test19MyGajokMain {

	public static void main(String[] args) {
		// 클래스의 상속 : 클래스 간 상하위 개념을 도입해 자원의 재활용 : 일반화 관계
		Test19GrandFa grandFa = new Test19GrandFa();
		System.out.println("가보 : " + grandFa.gabo);
		System.out.println("가훈 : " + grandFa.gahun);
		System.out.println(grandFa.say());
		grandFa.eat();
		System.out.println("할아버지 나이 : " + grandFa.getNai());
		
		System.out.println();
		Test19GrandFa grandFa2 = new Test19GrandFa(82);
		System.out.println(grandFa2.say());
		grandFa2.eat();
		System.out.println("할아버지 나이2 : " + grandFa2.getNai());
		
		
		System.out.println("\n아버지 클래스에 대해 ...");
		Test19Father father = new Test19Father();
		
		System.out.println("가보 : " + father.gabo); 
		//father에 가보 없으니 상위로 올라가서 삼강청자 찍어줌
		System.out.println("가훈 : " + father.gahun);
		System.out.println(father.say());
		father.eat();
		System.out.println("아버지 나이 : " + father.getNai());
		System.out.println("집은 : " + father.getHouse());
		//private맴버는 상속에서 제외됨
		//2개의 클래스 값을 받는 다중 상속은 안된다.
		
		System.out.println();
		father.showData();
		
		
		
		System.out.println("\n내 클래스에 대해 ...");
		Test19Me me=new Test19Me();
		System.out.println("가보 : " + me.gabo); 
		//father에 가보 없으니 상위로 올라가서 삼강청자 찍어줌
		System.out.println("가훈 : " + me.gahun);
		//아버지에게 가서 가훈 가져옴
		System.out.println(me.say());
		//할아버지 한테 가야 say있으니 거기까지 올라감
		
		me.eat();
		System.out.println("내 나이 : " + me.getNai());
		System.out.println("집은 : " + me.getHouse());
		//private맴버는 상속에서 제외됨
		//2개의 클래스 값을 받는 다중 상속은 안된다.
		
		System.out.println();
		me.showData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
