package pack2;

public class Test10Main {

	public static void main(String[] args) {
		//응용 프로그램의 시작을 위해 main을 임의의 클래스 안에 적어줌.
		Test10Car car1 = new Test10Car(); //클래스(설계도)를 근거로 기억장소를 확보하고 객체가 만들어짐. instance화 됐다 라고 말합니다
		System.out.println(car1); //=> pack2.Test10Car@6f2b958e
		System.out.println(car1.irum); // => 길동
		System.out.println(car1.wheel); // => 4
		System.out.println();
		car1.abc(); //괄호가 있으면 메소드를 찾는거고 ()가 없으면 맴버를 찾는거임. 여기선 private써도 보임, 왜? 자기거니까
		
		System.out.println();
		Test10Car car2=new Test10Car(); //인스턴스 2개 만들어진거임
		car2.abc();
		System.out.println();
		System.out.println(car1 + " " +  car1.hashCode()); //pack2.Test10Car@6f2b958e 해쉬코드 : 1865127310
		System.out.println(car2 + " " +  car2.hashCode()); //pack2.Test10Car@5e91993f 해쉬코드 : 1586600255 둘이 주소가 다르다.
		System.out.println(car1==car2); //객체 주소 비교 false출력
		System.out.println(car1.getClass()); //class pack2.Test10Car 타입이 나오네, 전문가 들이 이미 만들어 둔 것임
		System.out.println(car1.getClass()==car2.getClass()); //객체 타입 비교 true출력
	}

}
