package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class ConnectionTest {
	
	public static void main(String[] args) {
		
		Connection con = DbUtil.connect();
		System.out.println("con : "+con);

		// Test 테이블에서 name 컬럼(필드) "hi"라는 값 추출/비교 테스트
		// select(DQL:data Query Language) 검색/조회
		
		int id = 1;
		// SQL 구문
		//String sql = "SELECT name FROM test WHERE id=1";
		//String sql = "SELECT name FROM test WHERE id=?";
		String sql = "SELECT name FROM test WHERE id=" + id;
		
		try {
			// SQL 구문 해석/처리
			Statement stmt = con.createStatement();
			
			// 결과 처리
			ResultSet rs = stmt.executeQuery(sql);
			
			
			String result = "";
			
			// SQL의 결과(행:row)가 존재한다면 
			if(rs.next()) {
				result = rs.getString(1);
				System.out.println("결과 테스트 : " + result.equals("Hi"));		// true
				System.out.println("결과 테스트 : " + result.equals("안녕"));	// false
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 결과 처리
		
	} //

}