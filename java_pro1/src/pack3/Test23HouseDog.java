package pack3;

public class Test23HouseDog extends Test23Dog{
	private String where = "집";
	
	
	public Test23HouseDog(String name) {
		super(name);
	}
		public void show() {
			System.out.println("사는 곳 : "+ where + "안");
		} 
		
	@Override
	public void print() { // 오버라이드로 메서드만 가져오고 부모가 하는 print와 다른 프린트를 할거야.
		System.out.println(getName()+ "는(은)" + where +"에 산다");
		System.out.println("HouseDog의 print");
	}
	
	
	
}
