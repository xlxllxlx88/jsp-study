package com.javateam.project.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.util.DbUtil;

public final class MemberDaoImpl implements MemberDao {
	
	// singleton pattern : DAO 보안
	// usage) MemberDao dao = MemberDaoImpl.getInstance();
	// usage) MemberDaoImpl dao = MemberDaoImpl.getInstance();
	// usage) MemberDaoImpl dao = new MemberDaoImpl(); // (X)
	
	// Spring container => 자동으로 싱글턴 객체를 생성
	// @Autowired MemberDao dao;  
	
	private static MemberDaoImpl instance = null;
	
	private MemberDaoImpl() {}
	
	public static MemberDaoImpl getInstance() {
		
		instance = new MemberDaoImpl();
		
		return instance;
		// return new MemberDaoImpl();
	}

	@Override
	public boolean insertMember(MemberVo member) {
		
		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 저장 성공 여부 플래그
		boolean result = false;

		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		// ex) MyBatis => @, XML mapper로 독립
		String sql 
			// = "INSERT INTO member_tbl VALUES (?,?,?,?,?)";
			= "INSERT INTO member_tbl VALUES (?,?,?,?,now())";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			
			pstmt = con.prepareStatement(sql);
			// 인자 처리
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getAddress());
			// pstmt.setDate(5,  member.getJoindate()); // (X)
			// Date date = (Date)member.getJoindate(); // (X)
			// pstmt.setDate(5, new Date(member.getJoindate().getTime()));
						
			// SQL 실행 : 메시징
			if (pstmt.executeUpdate() == 1) {
				System.out.println("회원정보 저장 성공");
				result = true;
			} else {
				System.err.println("회원정보 저장 실패");
				result = false;
			} //
			
			con.commit(); // 커밋(승인:commit)
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 회원정보 저장 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}
		
		return result;
	}

	@Override
	public boolean updateMember(MemberVo member) {

		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 저장 성공 여부 플래그
		boolean result = false;

		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "UPDATE member_tbl SET "
				   + "pw=?,"
				   + "address=? "
				   + "WHERE id=?";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			
			pstmt = con.prepareStatement(sql);
			// 인자 처리
			
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getAddress());
			pstmt.setString(3, member.getId());
						
			// SQL 실행 : 메시징
			if (pstmt.executeUpdate() == 1) {
				System.out.println("회원정보 수정 성공");
				result = true;
			} else {
				System.err.println("회원정보 수정 실패");
				result = false;
			} //
			
			con.commit(); // 커밋(승인:commit)
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 회원정보 수정 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}
		
		return result;
	}

	@Override
	public boolean deleteMember(String id) {

		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 저장 성공 여부 플래그
		boolean result = false;

		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "DELETE FROM member_tbl WHERE id=?";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			
			pstmt = con.prepareStatement(sql);
			// 인자 처리
			
			pstmt.setString(1, id);
						
			// SQL 실행 : 메시징
			if (pstmt.executeUpdate() == 1) {
				System.out.println("회원정보 삭제 성공");
				result = true;
			} else {
				System.err.println("회원정보 삭제 실패");
				result = false;
			} //
			
			con.commit(); // 커밋(승인:commit)
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 회원정보 삭제 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}
		
		return result;
	}

	@Override
	public List<MemberVo> getAllMembers() {

		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 결과값 처리
		List<MemberVo> members = new ArrayList<>();
		
		MemberVo member = null;
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "SELECT * FROM member_tbl";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체
		ResultSet rs = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				member = new MemberVo();
				
				// rs.getString(1)
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setJoindate(new java.util.Date(rs.getDate("joindate").getTime()));
				
				members.add(member);
			} //
			
			con.commit();
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 전체 회원정보 조회 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);
		}
		
		return members;
	}

	@Override
	public List<MemberVo> getMembersByPage(int page, int limit) {

		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 결과값 처리
		List<MemberVo> members = new ArrayList<>();
		
		MemberVo member = null;
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "SELECT * FROM member_tbl LIMIT ?, ?";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체
		ResultSet rs = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			pstmt = con.prepareStatement(sql);
			
			// 페이징(paging) 인자
			// ex) 페이지당 5명 출력
			// 1 페이지 : SELECT * FROM member_tbl LIMIT (1-1)*5, 5;
			// 2 페이지 : SELECT * FROM member_tbl LIMIT (2-1)*5, 5;
			// 3 페이지 : SELECT * FROM member_tbl LIMIT (3-1)*5, 5;
			
			pstmt.setInt(1, (page-1)*limit);
			pstmt.setInt(2, limit);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				member = new MemberVo();
				
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setJoindate(new java.util.Date(rs.getDate("joindate").getTime()));
				
				members.add(member);
			} //
			
			con.commit();
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 전체 회원정보 조회 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);
		}
		
		return members;
	}

	@Override
	public MemberVo getMember(String id) {
		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 결과값 처리
		MemberVo member = null;
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "SELECT * FROM member_tbl WHERE id=?";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체
		ResultSet rs = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				member = new MemberVo();
				
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setJoindate(rs.getDate("joindate"));
			} //
			
			con.commit();
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 개별 회원정보 조회 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);
		}
		
		return member;
	}

	@Override
	public int getAllCount() {
		
		// 현재 메서드명
		String methodName 
			= new Exception().getStackTrace()[0].getMethodName();
		
		// 결과값 처리
		int result = 0;
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 구문
		String sql = "SELECT count(*) FROM member_tbl";
		
		// SQL 처리 객체 : "?" 인자 사용 가능
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체
		ResultSet rs = null;
		
		// 예외 처리
		// SQL 처리 : 인자
		try {
			// 트랜잭션(transaction)
			con.setAutoCommit(false); // 수동 커밋(commit) 모드로 전환
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				result = rs.getInt(1);
			}
			
			con.commit();
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} // 트랜잭션 취소(rollback)
			
			System.err.println(methodName + " : 전체 회원정보수 조회 실패");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);
		}
		
		return result;
	}

}