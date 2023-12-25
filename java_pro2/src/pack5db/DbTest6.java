package pack5db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest6 {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DbTest6() {
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
			
			conn.setAutoCommit(false); // transaction 처리가 수동
			// 자료추가 - Transaction 시작 -------------------------------------
			String inSql = "insert into sangdata values(?,?,?,?)";
			pstmt = conn.prepareStatement(inSql);
			pstmt.setString(1, "5");
			pstmt.setString(2, "새상품");
			pstmt.setInt(3, 3);
			pstmt.setInt(4, 3000);
			pstmt.executeUpdate();
			// 추가 후 뭔가를 로컬에서 하다가..
			// 자료 수정
			String upSql = "update sangdata set sang=?,su=? where code=?";
			pstmt = conn.prepareStatement(upSql);
			pstmt.setString(1, "신상");
			pstmt.setString(2, "50");
			pstmt.setString(3, "5");
			pstmt.executeUpdate(); // update 완료 - 아직 local상태 커밋 안됨
			
			//conn.rollback(); // 업데이트까지 했지만 취소가 됨
			conn.commit(); // transaction 끝남 ---------------------------------
			
			String sql = "select * from sangdata";
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			while(rs.next()) {
				System.out.println(
						rs.getString("code")+" "+ 
						rs.getString("sang")+" " +
						rs.getString("su")+" "+
						rs.getString("dan")
						);
			}

		} catch (Exception e) {
			try {conn.rollback(); } // 에러 났을 때 롤백, 오류가 났다면 여기서 transaction끝남
			catch (Exception e2) {}
			System.out.println("accessDb err : "+ e);
		} finally {
			try {
				if(rs != null) rs.close(); //GC(가비지컬렉터)가 수거해감
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				conn.setAutoCommit(true); // 얘는 try던 catch던 무조건 시행이니 커밋을 수동-> 자동으로 다시 돌려줌
			} catch(Exception  e2) {
				
			}
		}
	}
	public static void main(String[] args) {
		new DbTest6();
		
	}

}
