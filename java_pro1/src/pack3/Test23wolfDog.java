package pack3;

public class Test23wolfDog extends Test23Dog{
	private String where = "산";
	
	public Test23wolfDog(String name)	{
		super(name);
	}
	
	public void show() {
		System.out.println("사는 곳 : " + where + "안");
	}
	
	@Override
	public void print() { //부모와는 다른 print
		System.out.println(getName() + " : " + where + "에 사는 것으로 알려짐");
	}

	public void wolfDisplay() {
		print(); // 늑대 : 산에 사는 것으로 알려짐. 아래와 같은 말인데 굳이 super와 구분하고 싶으면 this로 해주는 거임
		this.print(); //늑대 : 산에 사는 것으로 알려짐 해당 클래스의 print출력
		super.print(); // 늑대는(은) 사람 곁에 산다. 부모의 class에서 print출력
		
	}
	
}
