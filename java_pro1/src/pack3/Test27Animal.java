package pack3;

public abstract class Test27Animal {//추상클래스 -> new 안됨
	abstract public String name(); //->추상메소드
	abstract public String eat();
	abstract public String action();
	
	public void print() {
		System.out.println("동물 추상 클래스 내에 일반 메소드 print");
		
	}
}
