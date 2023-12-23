package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//내부 클래스 적용 샘플
public class Test35Frameinner extends Frame{
	private MyInner myInner;
	
	public Test35Frameinner() {
		//super("내부 클래스 사용");
		setTitle("내부 클래스 사용");
		//super하게 되면 생성자로 이름을 주는거고 set하면 수정해쥬는 거고
		
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		myInner = new MyInner();
		addWindowListener(myInner);
		addMouseMotionListener(new YourInner());
	}
	
	class MyInner extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		}
	}
	
	class YourInner extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			setBackground(Color.RED);
		}
	}
	
	public static void main(String[] args) {
		 new Test35Frameinner();
	}

}
