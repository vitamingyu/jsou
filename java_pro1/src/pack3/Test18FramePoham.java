package pack3;

import java.awt.Frame;

public class Test18FramePoham {
	Frame frame;
	
	public Test18FramePoham() {
		frame = new Frame("클래스의 포함"); //생성하면서 줌
		//frame.setTitle(); 생성 후 나중에 바꾸는 거
	}
	public void display() {
		//frame.setTitle("클래스의 포함"); 이렇게 제목을 줄 수도 있음
		frame.setSize(500, 300); //단위는 픽셀임
		frame.setLocation(200,  200);  //0,0은 왼쪽 위에임. 보통 왼쪽 아래로 생각하잖아
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test18FramePoham framePoham = new Test18FramePoham(); //프레임 인스턴스 되었으니 맴버쓸 수 있다.
		framePoham.display();
		
	}

}
