package pack3;

//public interface Test30AdvanceVol {
public interface Test30AdvanceVol extends Test30InterVol{ //인터페이스 간 상속
	void volOff();
	void volOn();
	//인터페이스는 선언만 가능 다른 동작들은 자식 클래스에서 해줘야됨
	// 강제로 이거 해! 라는 느낌. 인터페이스는 선언만 해줌
	
	
}
