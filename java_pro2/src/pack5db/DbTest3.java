package pack5db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest3 {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public DbTest3(){
		dbLoading();
		accessDb();
	}
	
	private void dbLoading() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(Exception e) {
			System.out.println("로딩 실패:"+e);
			System.exit(0);
		}
	}
	private void accessDb() {
		// 관리고객이 있는 직원 출력
		// 사번 이름 직급 고객명 고객전화
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
			
			stmt=conn.createStatement();
			rs = stmt.executeQuery("select jikwon_no, jikwon_name, jikwon_jik, gogek_name, gogek_tel "
					+ "from jikwon inner join gogek on jikwon_no=gogek_damsano order by jikwon_name");
			// rs를 안 쓰면 ram에서만 있고 그걸 보기 위해 result로 보는거?
			int su=0; // 건수 출력용
			while(rs.next()) {
				System.out.println(rs.getString("jikwon_no") + " " 
								+ rs.getString("jikwon_name") + " "
								+ rs.getString("jikwon_jik") + " " 
								+rs.getString("gogek_name") + " " 
								+rs.getString("gogek_tel") );
				su = su+1;
			}
			System.out.println("건수 : "+su);
			
		} catch (Exception e) {
			System.out.println("accessDb err : "+ e);
		} finally {
			try {
				if(rs != null) rs.close(); //GC(가비지컬렉터)가 수거해감
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception  e2) {
			
			}
		}
	}
	public static void main(String[] args) {
		new DbTest3();
	}

}
