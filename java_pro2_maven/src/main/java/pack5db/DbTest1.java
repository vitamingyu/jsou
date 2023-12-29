package pack5db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest1 { 
	private Connection conn= null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public DbTest1() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("로딩 실패:"+e);
			System.exit(0);
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
		} catch (Exception e) {
			System.out.println("연결 실패 : "+e);
			System.exit(0);
		}
		
		try {
			stmt=conn.createStatement(); //클래스 만드는데 new안해줌. connect클래스가알아서 함. create객체생성
			
			//rs=stmt.executeQuery("select * from sangdata");
			//rs=stmt.executeQuery("select sang,code,su,dan from sangdata");
			rs=stmt.executeQuery("select code as 코드,sang,su,dan from sangdata"); // 여기서 코드로 쓰면 밑에 while에서 code 대신 코드라 써야됨
			//                             1번째      2번째 3번 4번째
			//System.out.println(rs.next());   // record pointer 이동 자료가 있으면 트루 없으면 폴스 반환
			// 포인터는 단 한개. select로 5개의 레코드를 가져왔다하면 포인터는 5개 중에 한개씩만 가르킬 수 있음. 다음 레코드로 가게 하는게 next
			
			while(rs.next()) {
				String code = rs.getString("코드");
				
				//String sang = rs.getString("sang");
				String sang = rs.getString(2); // 칼럼의 이름으로 불러도 되고 이렇게 순서로 불러도 됨 34번 참고
				
				//String su = rs.getString("su");
				int su = rs.getInt("su"); // int로 받을 수도 있음(su는 숫자자료)
				int danga = rs.getInt("dan"); // 앞에 danga는 변수명 뒤에 dan은 컬럼명이라 정확히 써줘야됨
				int keum = su * danga;
				
				//String dan = rs.getString("dan");
				System.out.println(code + " " + sang + " " + su + " " + danga);
			}
			
			String sql = "select count(*) from sangdata";
			rs=stmt.executeQuery(sql);
			rs.next();
			System.out.println("건수 : "+ rs.getInt(1));
			
		} catch (Exception e) {
			System.out.print("SQL 처리 실패 :"+e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) rs.close();
				if(conn != null) rs.close();
			} catch (Exception e2) {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("자바 메이븐 빌드 도구를 사용");
		new DbTest1();
	}
	

}
