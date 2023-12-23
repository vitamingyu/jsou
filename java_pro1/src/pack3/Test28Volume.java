package pack3;

public interface Test28Volume { 
	void volumeUp(int level);
	void volumeDown(int level);
}
// 인터페이스 구현은 다중 상속의 장점을 갖는다.
// 눈에 안보이지만 인터페이스는 public abstract가 자동 부여된다.
// 인터페이스는 추상메소드만 있는 곳입니다
// - 일반메소드는 인터페이스 맴버가 될 수 없어요
// 예를들어, public void print(){
// system.out.println("일반 메소드")
// } 따위의 일반메소드는 만들지 못합니다.
// + 그러므로 인터페이스를 상속받은 인터페이스는 오버로딩을 할 필요가 없음