import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetTest2Server {
	public static void main(String[] args) {
		// socket 통신 : 컴퓨터 간 TCP/IP 프로토콜 기반 통신용 클래스
		ServerSocket ss =null;
		
		/*
		for (int i=0; i <= 65535; i++) {
			try {
				ss=new ServerSocket(i);
				ss.close();
			} catch (Exception e) {
				System.out.println(i + "번 port 번호는 사용중~");
			}
			
		}
		System.out.println("내 컴퓨터가 사용하고있는 port 확인 종료");
		// port는 0 ~ 65535까지 사용가능
		 */
		
		// 두 대의 컴퓨터 접속 확인 : client / server 구조
		Socket socket = null; // 컴퓨터 간의 실질적인 통신을 위한 클래스
		try {
			ss= new ServerSocket(7777);  // 포트번호를 넣어줌. 포트번호는 1024번 이후의 비사용중인 숫자를 사용(주로 시스템이 쓰기 때문)
			System.out.println("서버 서비스 중...");
			socket = ss.accept(); // 실행하면 클라이언트의 요청이 올 때 까지 여기서 멈춰있음
			//들어오면 스레드를 만들고 소켓을
			
			System.out.println("접속자 정보 : " + socket.toString());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = reader.readLine();
			System.out.println("수신 자료 : "+data);
			
			reader.close();
			socket.close();
			ss.close();
			
		} catch (Exception e) {
			System.out.println("서버 에러 " + e);
		}
		
	}

}





