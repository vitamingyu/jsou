import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetTest3Server { // Echo server 계속 무한루프에 빠뜨려 볼 수 있음(죽지않아)
	ServerSocket ss =null;
	Socket socket;
	PrintWriter out;
	BufferedReader reader;
	
	public NetTest3Server() {
		try {
			ss = new ServerSocket(5000);
			
		} catch (Exception e) {
			System.out.println("NetTest3Server err : "+e);
			return;
		}
		System.out.println("서버 서비스 중 ...");
		
		try {
			socket = ss.accept(); // 여기서 클라이언트 요청을 하염없이 기다림
			out = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"EUC-KR"));
			
		} catch (Exception e) {
			System.out.println("에러 : "+e);
			return; // 사실 써도 되고 안 써도 됨 return은,
		}
	}
	
	public void receiveMsg() { // 클라이언트가 전송한 자료를 수신해서 출력
		try {
			String msg=reader.readLine();
			System.out.println("receive msg : " + msg);
			
			out.println("from server : " + msg + "good"); // 서버가 클라이언트 컴퓨터로 전송
			reader.close();
			out.close();
			socket.close();
			ss.close();
			
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			NetTest3Server server = new NetTest3Server();
			server.receiveMsg();
			
		}
		
		
	}

}





