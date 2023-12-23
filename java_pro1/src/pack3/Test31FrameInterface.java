package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Test31FrameInterface extends Frame implements WindowListener, MouseListener{  //implements '구현'이라 부름 상속이라고 부르진 않음(기능은 상속 맞아)
	//public Test31FrameInterface("이벤트 처리") {
	public Test31FrameInterface() {
		setTitle("이벤트 처리"); //엄밀히 말하면 앞에 super.이 붙어
		//this와 구분하기 위해 super써주는데 굳이 그게 아니면 쓸 필요가 없다
		
		//생성자가 장황하게 기능을 넣지않는다. 초기화만 해준다
		//선언만 주로 해준다. 생성자의 성격상
		//frameShow();  // 이 프레임은 처음 한번만 빡 생기면 돼 그러면 생성자에서 해줄 수도 있지
	}
	
	public void frameShow() {
		setSize(500,300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(this);    // 7줄 frame에 장착. 현재 클래스(Frame)에 WindowListener를 장착.
		//비로소 일반사용자의 윈도우 이벤트를 수신. 이제 창닫고 뭐시기 이벤트를 주면 반응을 보임
		addMouseListener(this); //마우스 리스너는 현재 클래스에 갖고 있으니까 this 써 줌
	}
	
	@Override
	public void windowActivated(WindowEvent e) {} //추상메소드들
	
	@Override
	public void windowClosed(WindowEvent e) {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료하고 싶니?");
		System.exit(0); 
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("헉 돌아오다니");
		
	}
	 @Override
	public void windowIconified(WindowEvent e) {
		// 아이콘화 발생했을 때의 이벤트
		System.out.println("와우 작아졌네");
	}
	 
	@Override
	public void windowOpened(WindowEvent e) {}
	
	
	//---------마우스
	@Override
	public void mouseClicked(MouseEvent e) {
		// System.out.println("클릭");
		//setBackground(Color.BLUE);
		//setBackground(new Color(0,0,255)); => 똑같은 파랑인데 숫자로 표현
		//System.out.println((int)(Math.random()*255));		
		int r=(int)(Math.random()*255);
		int g=(int)(Math.random()*255);
		int b=(int)(Math.random()*255);
		setBackground(new Color(r,g,b));
		setTitle("r:"+r+",g"+g+"b:"+b);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Test31FrameInterface frameInterface = new Test31FrameInterface();
		//new Test31FrameInterface(); //생성자만 불러 7번으로 가. 그리고 16번 실행해
		frameInterface.frameShow();
		
	}

}
//public class Test31FrameInterface extends Frame{
//public Test31FrameInterface("이벤트 처리") {
//public Test31FrameInterface() {
//	setTitle("이벤트 처리");
//	
//	public void frameShow() {
//		setSize(500,300);
//		setLocation(200, 200);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		Test31FrameInterface frameInterface = new Test31FrameInterface();
//		frameInterface.frameShow();
//		
//	}
