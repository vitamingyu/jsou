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
			
			// 자료추가 -- auto commit이 기본. 한번만 실행. 한번 더 실행하면 5번이 primary key라 중복오류남
			//String isql = "insert into sangdata values(5,'새우깡',5,1500)";
			//stmt.executeUpdate(isql); // insert문장이 실행. select를 제외한 sql문을 적을 수 있따.
			
			//String isql = "insert into sangdata values(6,'콘칩',15,2500)"; 
			//int result = stmt.executeUpdate(isql); // insert 추가 행 수 결과 반환 => 0(실패) 또는 1(성공). insert는 동시에 2개를 할 수 없기때문에 0또는1만 뜬다
			//System.out.println("result : "+result);
			
			// 자료 수정 얘는 반복 실행해도 오류 안 뜸. iud는 항상 반환값이 있음(익스큐트쓰면 보임)
			//String usql = "update sangdata set sang='감자깡',su=33 where code = 5";
			//stmt.executeUpdate(usql);
			/*
			String usql = "update sangdata set sang='감자깡',su=33 where code = 5"; // 업데이트는 조건에 따라 한번에 여러개도 가능
			int upresult = stmt.executeUpdate(usql); // 수정 행 수 결과 반환. 수정 몇개 했는지 궁금해? int로 반환받아봐. 강제는 아님
			if(upresult > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			*/
			
			// 자료삭제
			/*
			String dsql = "delete from sangdata where code>=5";
			int delresult = stmt.executeUpdate(dsql); // 삭제 행 수 결과 반환. 삭제 몇개 했는지 궁금해? int로 반환받아봐. 강제는 아님
			System.out.println("delresult : "+delresult);
			if(delresult > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			*/
			
			// 모든 자료 읽기
			String sql = "select * from sangdata";
			rs = stmt.executeQuery(sql); // 위 두 줄을 아래 한줄로도 가능
			//rs = stmt.executeQuery("select * from sangdata");
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
