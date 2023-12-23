package pack3;

public abstract class Employee {
	public abstract double pay();
	public abstract void print();
	
	private String irum;
	private int nai;

	public Employee(String irum, int nai) {
		this.irum=irum;
		this.nai=nai;
	}
	
	
	public void display() {
		System.out.println("이름:"+irum +"나이:"+ nai);
	}
	
}
