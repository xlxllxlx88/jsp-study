package test;

import java.sql.Connection;

import util.DbUtil;

public class ConnectionTest {
	
	private static void main(String[] args) {
		
		Connection con = DbUtil.connect();
		System.out.println("con : " + con);
	}

}
