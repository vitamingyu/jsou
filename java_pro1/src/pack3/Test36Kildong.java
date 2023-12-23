package pack3;

public class Test36Kildong {
	public Test36Saram getSaram() { //리턴타입은 Test36Saram
		//return new Test36Saram();
		return new Test36Saram()
		{   // 내부무명클래스, 생성자를 진행하는데 클래스를 밑에 처럼 적어줄 수 있음
			
			@Override
			public String getIr() {
				// Test36Saram 클래스의 메소드를 오버라이딩
				//return super.getIr(); 오버라이드 하고 자동 생성된 부분
				return "홍길동";
			}
			
		}; ///////// 세미콜론 7~15는 클래스, 클래스는 클래스인데 이름 없는 클래스
		
	}
}
