package pack3;

public class Test23Dog {
	private String name = "개";
	
	public Test23Dog() {
		
	}
	public Test23Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String callName() {
		return "종류 : " + name;
	}
	//여기있는 애들은 공유자원
	public void print() {
		System.out.println(name+"는(은) 사람 곁에 산다");
	}
	
	
}
