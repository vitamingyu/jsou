package pack2;

public class Test11Main { 

	public static void main(String[] args) { //main메소드가 있기 때문에 프로그램 실행 가능(run as)
		//main 앞글자 대문자로 쓰면 run as 안됨
		//args를 스트링으로 받았네, 잠시 클래스 접고 예시 아래
		//System.out.println("args : " + args[0]);
		
		// Test11Programmer 형 객체 생성
		Test11Programmer tom = new Test11Programmer();
		//new하면 비로소 힙에 들어와 객체변수가 되는건데
		//왼쪽은 static 때문에 static으로 들어가서 안 죽고 살아있기 때문에 클래스로 바로 부를 수 있음. 객체변수 지정해서 부를 필요없음
		//static은 공간이 작아서 꼭 필요한 녀석들만 static으로 만들어줌(메소드도 스태틱 써줄 수 있음)
		//접근 지정자와는 별개
		//프로그래머.class 불러오는거임
		//static으로 가게 됨. 정적이고 응용프로그램 끝날 때 까지 살아있음(=main끝나기 전까지)
		//tom은 stack에 만들어져
		//heap에 인스턴스가 되는거임. 인스턴스엔 맴버들이 있겠지
		//주소를 참조하고 있으니 참조형 변수다. 기본형 아님
		//힙의 주소는 스택에 있음
		
		System.out.println("tom의 별명은 " + tom.nickName);
		//System.out.println("tom의 나이는 " + tom.age); 넌 private라 찍을 수 없어~
		System.out.println("tom의 스펙은 " + tom.spec);
		//톰은 참조형 변수 쩜 객체
		tom.displayData(); //메소드를 부르는거
		
		System.out.println("getter/setter");
		//System.out.println(tom.age); private맴버이므로 접근 안됨. 아래+ programmer 34번째 부터 기술 사용
		tom.setAge(30);
		//set뒤에 변수 첫 글자 대문자로
		System.out.println("tom의 나이는 " + tom.getAge());
		System.out.println();
		System.out.println("모토 : " + tom.motto);
		System.out.println("모토 : " + Test11Programmer.motto);
		//스태틱은 객체변수로 부르지 않아도 됨 클래스 이름으로 직접 부를 수 있음
		
		//tom.pi =123; //final값은 수정 불가
		System.out.println("파이값은 " + tom.PI);
		
		System.out.println("------------");
		Test11Programmer james;
		//System.out.println("james의 스펙은 " + james.spec);
		//위는 객체가 안 만들어졌기 때문에 불가능
		Test11Programmer.myMethod(); //이건 class이름으로 부르는거라 언제든 가능
		//객체 변수로 부르려면 new를 해줘야됨
		
		
		
		
		
		
	}
	//main을 위한 별도의 클래스를 만들고 이를 응용프로그램에 적용하기 위한 메소드일 뿐.
}
