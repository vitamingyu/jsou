package pack3;

// 이 클래스 예제는 Test32~ 와 연관이 있습니다.
public class Test33Ball extends Test33FlyerAdapter{
	@Override
	public void fly() {
		System.out.println("공이 관중석으로 날아감");
	}// 이는 선택적으로 오버라이드 함 -> 어댑터 추상 클래스의 메소드 중 선택적인 오버라이딩

	public static void main(String[] args) {
		new Test33Ball().fly();
		// 점 뭐 점 뭐 할 필요 없이 하나만 쓸거면 이렇게 써도 됨
	}
}
