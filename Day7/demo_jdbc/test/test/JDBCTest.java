package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DbUtil;

public class JDBCTest {

	public void getTable() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM test"; // SQL

		try {
			con = DbUtil.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(con, pstmt, rs);
		}

	}

	public static void main(String[] args) {

		new JDBCTest().getTable();
	}

}
