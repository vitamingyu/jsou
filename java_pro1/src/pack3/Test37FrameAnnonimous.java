package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test37FrameAnnonimous extends Frame{
	public Test37FrameAnnonimous(String title) {
		super(title);
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		

		addWindowListener(new WindowAdapter() //윈도우 어댑터는 추상클래스인데 new가 붙네? 그냥 자바가 정한 예외야
		{ //내부무명클래스
			@Override
			public void windowClosing(WindowEvent e) { //윈도우 어댑터에 있는 윈도우 클로징을 오버라이드해서 써준거야 => 내부 무명클래스
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.BLUE);
			}
		});
		
	}
	public static void main(String[] args) {
		new Test37FrameAnnonimous("내부 무명클래스");
		
	}

}
