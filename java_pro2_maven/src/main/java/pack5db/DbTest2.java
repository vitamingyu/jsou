package pack5db;

import java.sql.Connection; // DB연결객체
import java.sql.DriverManager;
import java.sql.ResultSet; // select 결과 접근 객체(DB에서 select로 내 컴퓨터 ram으로 불러옴
import java.sql.Statement; // SQL실행객체. 자바도 오토커밋임

public class DbTest2 {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public DbTest2() {
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
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
			stmt=conn.createStatement();
			
			// 모든 자료 읽기
			rs = stmt.executeQuery("select * from sangdata");
			int cou=0;
			while(rs.next()) {
				System.out.println(
						rs.getString("code")+" "+ 
						rs.getString("sang")+" " +
						rs.getString("su")+" "+
						rs.getString("dan")
						);
				cou++;
			}
			System.out.println("전체 건수 : " + cou);
			
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
		new DbTest2();
	}

}
