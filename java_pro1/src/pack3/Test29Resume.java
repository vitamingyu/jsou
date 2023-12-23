package pack3;

public interface Test29Resume {
	//표준 이력서 양식
	String SIZE = "A4"; //인터페이스라 public final static이 생략됨
	//int aa = 0; //int aa 같은 변수 못 써줌. final이라 무조건 값 지정
	//static은 클래스로 부를 수 있음
	
	void setIrum(String irum); //추상메소드 public abstract임
	void setJunhwa(String junhwa);
	void print();
	
	
	// 아래는 참고사항. 잘 안쓰는데 되기때문에 써줌
	static void changeData() {
		System.out.println("스태틱 메소드는 인터페이스 맴버로 쓸 수 있음");	
	}
	
	default void palyJava() {
		System.out.println("java 8버전 이후에는 default를 선행한 일반 메소드 사용 가능");
	}
	
}
