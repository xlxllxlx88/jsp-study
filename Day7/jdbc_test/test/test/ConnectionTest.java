package test;

import java.sql.Connection;

import util.DbUtil;

public class ConnectionTest {
	
	public static void main(String[] args) {
		
		Connection con = DbUtil.connect();
		System.out.println("con : "+con);

	} //

}