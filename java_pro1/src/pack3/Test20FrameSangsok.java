package pack3;

import java.awt.Frame;

public class Test20FrameSangsok extends Frame{ //상속관계
	public Test20FrameSangsok() {
		super("클래스의 상속");
		
	}
	
	public void display(){
		//setTitle("클래스의 상속");
		//this.setTitle("클래스의 상속");
		//super.setTitle("클래스의 상속"); 여기선 위에 3개 중 어떤걸로 써도 똑같음
		setSize(500, 300);
		//this.setSize(500, 300);
		//super.setSize(500, 300);
		setLocation(200, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Test20FrameSangsok frameSangsok=new Test20FrameSangsok();
		frameSangsok.display();
		//18에서는 포함으로 불렀고 20에서는 상속으로 불렀다.
		//new Test20FrameSangsok().display(); 이렇게 객체 변수 안 쓰고 만들 수 도 있음 위에랑 똑같은 말
		
	}

}
