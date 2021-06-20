package com.javateam.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

@WebServlet("/update_session_proc.do")
public class MemberUpdateSessionProcAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("인자 전송 확인");
		
		String msg = ""; // 메시지
		
		MemberDao dao = MemberDaoImpl.getInstance();
		// 세션 객체 생성
		HttpSession session = request.getSession();
		
		MemberVo member = null;
		
		if (session.getAttribute("MEMBER_SESSION")==null) {
			
			// 로그인 아이디 세셩 정보 => id
			String SESS_ID 
				= (String)session.getAttribute("ID_SESSION");
			member = dao.getMember(SESS_ID);
			member = (MemberVo)session.getAttribute("MEMBER_SESSION");
			
		} else {
			member = (MemberVo)session.getAttribute("MEMBER_SESSION");
		}
		// String id = request.getParameter("id");
		
		request.getParameterMap()
		       .forEach((k,v)->System.out.println(k+"="+v[0]));
		
		// 변경사항 저장
		// 유의사항) 신규 패쓰워드 공백 => 기존 패쓰워드 유지
		// MemberVo member = dao.getMember(id);
		
		System.out.println("기존 회원정보 : " + member);
		
		System.out.println("실제 변경될 회원정보(패쓰워드) : " 
				+ request.getParameter("pw2"));
		System.out.println("실제 변경될 회원정보(주소) : " 
				+ request.getParameter("address"));
		
		// 변경 정보 반영
		member.setPw(request.getParameter("pw2"));
		member.setAddress(request.getParameter("address"));
		
		// 회원정보 수정
		if (dao.updateMember(member)==true) {
			msg = "회원정보 수정에 성공하였습니다.";
			System.out.println(msg);
		} else {
			msg = "회원정보 수정에 실패하였습니다.";
			System.out.println(msg);
		}
		
		request.setAttribute("msg", msg);
		
		// JSP 페이지(회원정보 조회) 이동
		RequestDispatcher rd 
			= request.getRequestDispatcher("/member/update_session.jsp");
		rd.forward(request, response);
	} //

}
