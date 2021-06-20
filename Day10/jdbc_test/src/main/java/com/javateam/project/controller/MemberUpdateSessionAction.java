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

@WebServlet("/update_session.do")
public class MemberUpdateSessionAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {

		String msg = "";
		MemberDao dao = MemberDaoImpl.getInstance();
		
		if (request.getParameter("id")==null) {
			
			System.out.println("id 미전송");
			msg = "조회할 회원 아이디를 입력하십시오.";
			
		} else {
			
			String id = request.getParameter("id").trim();
			System.out.println("아이디 : " + id);
			
			
			// 기존 정보 => 세션화(MEMBER_SESSION)
			// DB 사용량 절감 효과
			MemberVo member = null;
			HttpSession session = request.getSession(); // 세션 생성 
			
			if (session.getAttribute("MEMBER_SESSION")==null) {
				// 미생성시
			
				member = dao.getMember(id);
				session.setAttribute("MEMBER_SESSION", member);
				
			} else { // 기(旣)생성시
				
				member = (MemberVo)session.getAttribute("MEMBER_SESSION");
			} //
			
			if (member==null) {
				
				System.out.println("회원정보 없음");
				msg = "해당되는 회원정보를 조회할 수 없습니다.";
				
			} else {
				
				// JSP로 전송할 회원정보 인자 생성
				request.setAttribute("member", member);
			} //
			
		} //
		
		request.setAttribute("msg", msg);
		
		// JSP 페이지(회원정보 조회) 이동
		RequestDispatcher rd 
			= request.getRequestDispatcher("/member/update_session.jsp");
		rd.forward(request, response);
	} //

}
