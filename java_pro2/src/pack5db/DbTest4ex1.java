package pack5db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DbTest4ex1 {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	
	public DbTest4ex1() {
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
		Scanner sc = new Scanner(System.in);
		
		String sql="select * from jikwon inner join buser on jikwon.buser_num=buser.buser_no "
				+ "where buser_name=?"; 
		pstmt=conn.prepareStatement(sql);
		int m=0, w=0;
		
		System.out.print("부서이름을 입력하세요 : ");
		String buser = sc.next();
		
		pstmt.setString(1,buser);
		
		rs=pstmt.executeQuery();
		
		if(!rs.next()) { // if하는 순간 하나가 넘어가기 때문에 1인 홍길동이 카운트가 안된다.
			System.out.println("등록된 부서명이 아닙니다");
			System.exit(0);
		}
			
		
		
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,buser);
		rs=pstmt.executeQuery();
		
		
		while(rs.next()) {
			System.out.println(
					rs.getString("jikwon_no")+" "+ 
					rs.getString("jikwon_name")+" "+
					rs.getString("jikwon_jik")+" "+
					rs.getString("buser_name")+" "+
					rs.getString("jikwon_gen")
					);
		if( rs.getString("jikwon_gen").equals("남"))	{
				m++;
		}else {
			w++;
		}
			
		}
		System.out.println("남 : "+m+"여 : "+w);
		
		}catch (Exception e) {
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
	new DbTest4ex1();

	}

}
