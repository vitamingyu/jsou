package pack3;

public class Test19GrandFa { //할아버지 클래스 슈퍼클래스로 쓸거야
	private int nai=80;
	public String gabo = "상감청자";
	protected String gahun = "바르게 살자"; //프로텍티드는 이 클래스가 자식클래스를 갖고있을거라는 사전의미
	// 같은 패키지에서 퍼블릭이야. 다른패키지에서 자식클래스에서만 public
	
	public Test19GrandFa() {
		//this(정수); 16번 먼저 수행하고 11번 수행 정수엔 숫자 써줌
		System.out.println("할아버지 생성자");
	}
	
	public Test19GrandFa(int nai) {
		this(); //9번째줄로감 9번 수행하고 17번부터 이어서 감
		//생성자를 호출(생성자를 통해서만 부를 수 있음). 다른 스테이트먼트보다 먼저 써줘야됨. 가장 첫줄
		System.out.println("할아버지 !!!");
		this.nai = nai;
	}
	
	public String say() {
		return "할아버지 말씀 : 열씨미 일허자";
	}
	
	public void eat() {
		System.out.println("밥은 맛있게 ...");
	}
	public int getNai() {
		return nai;
	}
	
	//클래스에 final 걸어주면 상속이 안돼
}
