package pack2;

public class Test14BankMain { //메인을 쓰기 위해 만든 클래스일 뿐
	//Test14Bank와 Test14BankMain은 같은 package에 존재
	public static void main(String[] args) {
		// Bank 객체를 생성 - 인스턴스화
		Test14Bank tom = new Test14Bank();
		//클래스 객체변수 키워드 생성자 순서
		tom.dePosit(5000);
		tom.withDraw(3000);
		System.out.println("tom의 예금액 : " + tom.getMoney());
		
		System.out.println();
		Test14Bank oscar = new Test14Bank(2000);
		oscar.dePosit(1000);
		oscar.withDraw(7000); //수행안됨
		oscar.withDraw(2000); //수행됨. 해서 총 2천원 잔고 남음
		System.out.println("oscar의 예금액 : " + oscar.getMoney());
		
		System.out.println("\n객체의 주소 관련 작업");
		System.out.println("tom의 주소 : " + tom + " " + tom.hashCode());
		System.out.println("oscar의 주소 : " + oscar + " " + oscar.hashCode()); //둘이 타입만 같아, Bank로. 기억장소는 별개
		System.out.println();
		Test14Bank james = null;
		System.out.println("james의 주소 : " + james);
		//제임스를 스택에 올림, 인스턴스화 안 해서 참조하고있는 변수(인스턴스)없음. 
		System.out.println("oscar의 예금액 : " + oscar.getMoney());
		//System.out.println("james의 예금액 : " + james.getMoney()); // 에러!NullPointerException: 제임스는 참조하고 있는 변수가 없기 때문에.
		//제임스라는 객체가 인스턴스 주소를 안 갖고 있구나
		james = oscar;// 주소 치환
		System.out.println("james의 주소 : " + james);
		System.out.println("oscar의 주소 : " + oscar);
		//제임스는 주소가 없는데 위에서 오스카의 주소를 제임스에게 줌. 치환은 값을 치환하거나 주소를 치환함
		System.out.println("james의 예금액 : " + james.getMoney()); //오스카 것이랑 똑같네
		//james=null; 객체 참조 해제
		if(james == oscar) //주소 비교
			System.out.println("둘은 같은 인스턴스의 주소를 참조");
		else
			System.out.println("둘은 주소가 달라요");
		if(james instanceof Test14Bank) // instanceof : 클래스 타입 비교 연산자
			System.out.println("클래스 타입이 Test14Bank이군요");
		else
			System.out.println("클래스 타입이 Test14Bank가 아니네요");
		
		System.out.println("\nString(스트링) 타입의 값 비교 --- ");
		//객체변수는 반드시 new를 통해 만들어서 인스턴스 구조를 참조하는데 string은 특별함
		String ss1 = "kor"; //String 클래스는 기본형 처럼 값을 치환 할 수 있다.
		String ss2 = new String();
		ss2 = "kor";
		String ss3=new String("kor");
		System.out.println(ss1 + " " + ss2 + " " + ss3); //
		

		if(ss1==ss2) // String 클래스 타입의 객체의 주소를 비교
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(ss1==ss3)
			System.out.println("같구나");
		else
			System.out.println("다르구나");
		
		System.out.println(ss1.hashCode()+ " " + ss2.hashCode() + " " + ss3.hashCode()); //주소는 다 같음
		
		if (ss1.equals(ss2)) // String 클래스 타입의 객체가 참조하고 있는 값을 비교
			System.out.println("값이 같다");
		else 
			System.out.println("값이 다르다");

		if (ss1.equals(ss3))
			System.out.println("값이 같다2");
		else 
			System.out.println("값이 다르다2");
		
		
		//일반 객체의 주소, 기본형 변수의 값 비교시 : ==을 써준다
		//String 객체인 경우 값을 비교시 : equals() - 대소문자 구분o, equalsIgnoreCase() - 대소문자 구분x
		//문자열 비교는 equals 비교로 하자
		
		System.out.println("\n배열 관련 ---");
		//int ar1 [] = new int[3];
		//ar1[0]=1;ar[1]=2; ar1[2]=3;
		int ar1[] = {1,2,3}; //위에 두 줄을 하나로 합침 1차원 배열
		System.out.println(ar1); //배열의 대표명은 객체의 시작 주소를 기억
		System.out.println(ar1[0]); //배열의 요소값 기억
		System.out.println();
		int[] [] ar2 = {{1,2,3},{4,5,6,7}}; //2차원 배열 
		System.out.println(ar2);
		System.out.println(ar2[0] + " " + ar2[1]);
		System.out.println(ar2[0][0]);
		
	}

}
