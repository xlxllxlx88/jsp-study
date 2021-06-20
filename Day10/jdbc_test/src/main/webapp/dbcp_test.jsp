<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
                     pageEncoding="UTF-8"%>
<%
        String result = "";

		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
					Context initContext = new InitialContext();
					DataSource ds = (DataSource)initContext.lookup("java:/comp/env/jdbc/h2");
					
					con=ds.getConnection();
					
					String sql ="SELECT count(*) FROM member_tbl";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					if (rs.next()) {						
						result = "총 회원수 : " +rs.getInt(1);						
					}
					
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			rs.close();
			pstmt.close();
			con.close();
		}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DBCP testing</title>
</head>
<body>
<%=result %>
</body>
</html>