package pack3;

//어댑터에 대해 알아보자, 인터페이스의 추상메소드를 일반 메소드로 오버라이딩 하고 자신은 스스로 추상 클래스가 됨
//자식 클래스가 인터페이스의 추상 메소드를 모두 일반 메소드로 만들기 불편하므로 어댑터 클래스를 사용하도록 함
abstract public class Test33FlyerAdapter implements Test32Flyer{
	//추상클래스라고 꼭 추상 메소드를 가질 필요는 없다.
	//추상클래스만 갖는 이유 : 나 스스로 new하지 않을거야(나 스스로는 객체를 만들지 않을거야), 부모클래스로만 자격을 유지할거야. 자식만 ???
	@Override
	public void fly() {}
	
	@Override
	public boolean isAnimal() {
		return false;
	}

}
