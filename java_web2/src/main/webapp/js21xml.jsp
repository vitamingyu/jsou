<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<sangpums>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	Class.forName("org.mariadb.jdbc.Driver");
	// 파리미터로 클래스의 풀 이름을 입력으로 받아서 클래스를 찾으면 그 클래스의 Class객체를 리턴하고 못 찾으면 예외를 발생시키는 메소드
} catch (Exception e) {
	System.out.println("로딩 실패:"+e);
	return;
}

try {
	conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
	pstmt = conn.prepareStatement("select * from sangdata");
	rs =  pstmt.executeQuery();
	while(rs.next()){
%>
	<sangpum>
		<code><%=rs.getString("code") %></code>
		<sang><%=rs.getString("sang") %></sang>
		<su><%=rs.getString("su") %></su>
		<dan><%=rs.getString("dan") %></dan>
	</sangpum>
<%
	}
	rs.close();
	pstmt.close();
	conn.close();
} catch (Exception e) {
	System.out.println("처리 실패 : "+e);
}

%>
</sangpums>