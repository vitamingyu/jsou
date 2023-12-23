package pack4;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.time.LocalDate;
import java.time.LocalTime;

// 스레드를 사용하여 디지털 시계 작성
public class Test50Clock extends Frame implements ActionListener, Runnable{
	Label lblMessage; //접근지정자 생략
	Boolean b = false;
	Thread thread;
	
	public Test50Clock() {
		lblMessage = new Label("show time", Label.CENTER);
		add("Center",lblMessage);
		
		Button btnClick = new Button("click");
		add("South", btnClick);
		btnClick.addActionListener(this);
		
		
		setTitle("스레드 시계");
		setBounds(500, 200, 300, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				b = true;
				System.exit(0);
			};
		});
		
		thread = new Thread(this); //17번 연결됨 스레드객체가 만들어지면서 this 썼기때문에 아래 run오버라이드 쓰임(?)
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Button을 클릭하면 수행되는 메소드
		//System.out.println("와우");
		//displaydate(); 잘되나 실행해봄
		// 여기선 스레드를 출발만 시키면 됨
		
		if(thread.isAlive()) return; //thread가 살아있으면 밑으로 가면 안돼, 스타트가 계속되면 안되거든
		thread.start(); //스타트는 런을 부름
	}
	
	@Override
	public void run() { //runnable 인터페이스의 추상메소드를 오버라이드(재정의)
		while(true) {
			if(b == true) break;
			displaydate();
			try {
				thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	private void displaydate() {
		LocalDate date = LocalDate.now();
		int y = date.getYear();
		int m = date.getMonthValue();
		int d = date.getDayOfMonth();
		
		LocalTime time = LocalTime.now();
		int h= time.getHour();
		int mi= time.getMinute();
		int s= time.getSecond();
		
		lblMessage.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		lblMessage.setFont(new Font("돋움", Font.BOLD, 20));
	}
	
	public static void main(String[] args) {
		new Test50Clock();

	}

}
