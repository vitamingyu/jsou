package pack3;

public class Test19Father extends Test19GrandFa{ //클래스 상속(is a 관계)
	private int nai=55;
	private int house=1;
	final public String gabo = "물병";
	//자식에게서 가보가 있으면 굳이 부모에서 찾지 않음. 은닉화
	public Test19Father() {
		// 부모자식간에 부모한테 먼저 감. 안 써도 super()는 실행됨
		//super()생략되어있으면 9번으로 감
		//super(); //this는 자기자신 super는 부모. 생략가능
		System.out.println("아버지 생성자 만세");
	}
	public Test19Father(int n) {
		super(n); // 엔을 주면 13이 아닌 9로 감
		//생성자가 부모생성자에게 넘겨줄때 수퍼써서 주면 됨
	}
	public String say() { //부모와 같은 메소드를 써주면 옆에 삼각형 마크가 뜸
		//그리고 부모의 값은 은닉됨. 매쏘드 오버라이딩이라고 함
		///얘의 자식은 오버라이딩 불가 me는 father의 say까지만 받을 수 있음
		String abc ="아버지 말씀 : 상속을 이해하자";

		return abc;
	}
	public int getNai() { //위에 똑같은거 있어!:매쏘드 오버라이딩
		//아래 내용은 다를지라도 위에 줄(매쏘드)은 똑같이 써줘야됨
		return nai;
	}
	
	final public int getHouse() { //Father 고유 맴버
		return house;
		//getHounse = "korea" 쓰면 final을 수정하려 했기때문에 수정 불가
		//오버라이딩도 안돼!
	}
	
	public void showData() {
		System.out.println("showData 실행결과");
		String gabo = "항아리";
		System.out.println(gabo); //지역변수 부터 뒤짐.father에서 찾고 그 담에 grandfa까지 감 그래도 없으면 오류남
		System.out.println(this.gabo); //father클래스에 gabo가 없으면 상위클래스도 뒤짐. 지역변수는 안봄
		System.out.println(super.gabo); //바로 상위클래스로 가서 찾음, 못 찾으면 오류
		
		System.out.println(getNai());
		System.out.println(this.getNai());
		System.out.println(super.getNai());
	}
	
	
	
	
	
	
	
	
	
}
