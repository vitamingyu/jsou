import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class NetTest3Client {
	Socket socket;
	PrintWriter out;
	BufferedReader reader;
	
	public NetTest3Client() {
		try {
			socket = new Socket("192.168.0.18",5000);
			out = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"EUC-KR"));
		} catch (Exception e) {
			System.out.println("NetTest3Client err : " + e);
		}
	}
	
	public void sendMsg() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("메세지 입력:");
			String data = scanner.nextLine();
			out.println(data); // server로 자료가 전송
			
			String re_data = reader.readLine(); // server로부터 자료 수신
			System.out.println("수신자료는 "+ re_data);
			
		} catch (Exception e) {
			System.out.println("sendMsg err : "+e);
		} finally {
			try {
				reader.close();
				out.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		NetTest3Client client = new NetTest3Client();
		client.sendMsg();
		
	}

}



