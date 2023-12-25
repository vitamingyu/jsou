package pack5db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbTest4 {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DbTest4() {
		// preparedStatement : 선처리 방식
		// SQL 문장이 미리 컴파일되고, 실행 시간 동안 인수 값을 위한 공간을 확보할 수 있다는 점에서 Statement 객체와 다르다.
		// ? 연산자를 사용할 수 있다.
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
			
			// 자료 추가
//			String isql="insert into sangdata values(?,?,?,?)";
//			pstmt = conn.prepareStatement(isql);
//			pstmt.setString(1, "10"); // 사실 값은 외부에서 받아옴
//			pstmt.setString(2, "신상품");
//			pstmt.setInt(3, 11);
//			pstmt.setString(4, "5000");
//			pstmt.executeUpdate();
			
			// 자료수정
			String usql = "update sangdata set sang=?,su=?,dan=? where code=? "; // primary key는 수정대상에서 제외
			pstmt = conn.prepareStatement(usql);
			pstmt.setString(1, "볼펜"); // 1번째 값=sang을 바꿈
			pstmt.setString(2, "5");
			pstmt.setInt(3, 1100);
			pstmt.setString(4, "10");
			pstmt.executeQuery();
			
			//자료삭제
			String dsql = "delete from sangdata where code=?";
			pstmt=conn.prepareStatement(dsql);
			pstmt.setInt(1, 10);
			int result = pstmt.executeUpdate();
			if(result>0) 
				System.out.println("삭제 성공");
			else
				System.out.println("삭제 실패");
		
			
			// 전체자료 읽기
			String sql = "select * from sangdata";
			pstmt = conn.prepareStatement(sql); // statement와는 다른 선처리 방식
			rs=pstmt.executeQuery();
			
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
			
			System.out.println();
			// 부분자료 읽기
			String bun="1"; // 외부 입력장치로 받았다 가정
			//sql = "select * from sangdata where code=" + bun; // secure coding guideline 위배(틀린건 아님)
			//pstmt = conn.prepareStatement(sql);
			
			sql = "select * from sangdata where code=?"; // ?연산자를 사용. preparedstatement만 ?연산이 있음
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,bun); // 1번째 ?에 bun 넣어줌
			
			// 위에 pstmt는 이미 끝났기 때문에 다시 써줄 수 있다.
			rs=pstmt.executeQuery();
			if(rs.next()) {    // 가져올 자료가 1개이기에 if. 위에처럼 2개 이상이면 while(rs.next());
				System.out.println(
						rs.getString("code")+" "+ 
						rs.getString("sang")+" " +
						rs.getString("su")+" "+
						rs.getString("dan")
						);
			}else {
				System.out.println("그런 자료는 없어요");
			}
			
		} catch (Exception e) {
			System.out.println("accessDb err : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
				} catch (Exception e2) {
				
				}
			}
	
		}
	
	public static void main(String[] args) {
		new DbTest4();

	}

}
