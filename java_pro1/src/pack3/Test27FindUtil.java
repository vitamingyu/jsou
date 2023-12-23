package pack3;

public class Test27FindUtil {
	public void find(Test27Animal animal) { //cow와 lion은 animal타입
		animal.print();
		
		if(animal instanceof Test27Cow) { //객체타입 비교연산자. animal이 cow타입이니? 물어보는거
			Test27Animal a = animal;
			System.out.println("이름 : " + a.name());
		} else if(animal instanceof Test27Lion) {
			System.out.println("이름 : " + animal.name());
		}else {
			System.out.println("넌 누구?");
		}
	}
}
