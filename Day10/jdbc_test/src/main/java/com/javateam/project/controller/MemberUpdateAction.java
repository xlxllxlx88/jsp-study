package com.javateam.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

@WebServlet("/update.do")
public class MemberUpdateAction extends HttpServlet {

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
			
			MemberVo member = dao.getMember(id);
			
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
			= request.getRequestDispatcher("/member/update.jsp");
		rd.forward(request, response);
	} //

}
