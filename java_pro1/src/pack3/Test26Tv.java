package pack3;

public class Test26Tv extends Test26Jepum{
	public Test26Tv() {
		//super(); 가 생략되어있음
		//자식의 생성자에서 부모의 생성자를 부르게 되어있음 
		//그 다음에 자식의 생성자 실행
		System.out.println("Tv 생성자");
	}
	
	@Override
	public void volumeControl() { // 자그마한 삼각형 : 추상메소드를 오버라이딩한거야
		// 부모가 가진 추상메소드를 오버라이딩 강요 당함
		//이걸 써주니 3번째 줄에서 오류가 사라짐 <= 상속받은 추상메서드 쓰라고 오류뜸
		System.out.println("Tv 소리 업 다운");
	}
	@Override
	public void volumeShow() {
		int imsi = volume+0;
		String ss = "소리크기를 보여줘 ";
		System.out.println(ss + volume);
	}
	
}
