package pack3;

public class Test26Radio extends Test26Jepum{
	public Test26Radio() {
		//super(); 가 생략되어있음
		//자식의 생성자에서 부모의 생성자를 부르게 되어있음 
		//그 다음에 자식의 생성자 실행
		System.out.println("라디오 생성자");
	}
	
	@Override
	public void volumeControl() { // 자그마한 삼각형 : 추상메소드를 오버라이딩한거야
		// 부모가 가진 추상메소드를 오버라이딩 강요 당함
		//이걸 써주니 3번째 줄에서 오류가 사라짐 <= 상속받은 추상메서드 쓰라고 오류뜸
		System.out.println("라디오 소리 올리고 내리기");
	}
}
