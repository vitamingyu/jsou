import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NetTest1 {

	public static void main(String[] args) {
		// Network의 개념
		// URL : 네트워크 상에서 자원이 있는 곳을 알려주기 위한 규약이다.
		
		try {
			URL url = new URL("https://www.korea.com");
			// url 객체생성. 절대 경로로 생성
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			//위 2줄이 URL클래스를 이용한 읽기의 한 틀이다
			
			//System.out.println(br.readLine());
			
			// korea.com 웹서버에서 읽은 자료를 파일로 저장
			PrintWriter pw = new PrintWriter(System.out,true);
			PrintWriter fw = new PrintWriter(new FileOutputStream("c:/work/kor.html"));
			
			
			String line = "";
			while((line=br.readLine()) !=null){ // 한 행씩 읽기 틀
				System.out.println(line); // 표준출력장치(콘솔)로 출력
				// 파일로 저장
				pw.println(line);
				fw.println(line);
				fw.flush();
			}
			br.close(); is.close(); pw.close(); fw.close();
			
		} catch (Exception e) {
			System.out.println("err : "+e);
		}

	}

}

// url의 구조 : www.sql.com/index.html:8080 과 같은 형식이라면 www.sql.com은 호스트 이름. index.html은 파일이름. :8080은 포트 번호이다
// inputstream openstream() url주소와 연결한 뒤 이 연결로부터 입력받을 수 있는 inputstream 객체 리턴
// 










