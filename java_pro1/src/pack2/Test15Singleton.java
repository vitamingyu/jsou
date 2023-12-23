package pack2;

public class Test15Singleton {
	int kor = 10;
	//접근지정자 써줘야하는데 수업땐 귀찮으니 패스. 혼자할 땐 꼭 써줘라
	
	//싱글톤 패턴을 적용한 코드
	//장점 : 메모리를 절약해, 데이터 공유가 편리하다
	//단점 : 테스트 불편, 유연성이 떨어진다
	private static Test15Singleton singleton = new Test15Singleton();
	public static Test15Singleton getInstance() { //싱글톤 옆에 겟 인스턴스 객체이름은 아무거나 해도 됨
		//getInstance의 반환형은 Test15Singlton
		return singleton;
		//스태틱으로 부르면 new 안하고 클래스 이름으로 바로 부를 수 있음
		//반환타입은 객체고 Test15Singleton 타입을 반환해 7번째 줄에 singleton이 스태틱이니까 다음줄도 스태틱으로 맞춰줌
	}


}
