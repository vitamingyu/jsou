package pack3;

public class Test19Me extends Test19Father{
	//Test19Me 하위 클래 작성은 불가 final 써줘서
	//수정불가 오버라이딩 불가 상속불가
	public Test19Me() {
		System.out.println("내 생성자");
	}
	
	public void Biking() {
		System.out.println("자전거 타고전국 일주 와우~~");
	}
	
	
	
}
