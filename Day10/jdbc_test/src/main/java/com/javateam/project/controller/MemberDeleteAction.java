package com.javateam.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

@WebServlet("/delete.do")
public class MemberDeleteAction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

		String msg = "";
		MemberDao dao = MemberDaoImpl.getInstance();
		
		if (request.getParameter("id")==null) {
			
			msg = "삭제할 아이디를 입력하세요";
			System.out.println(msg);
			
		} else {
			
			// HttpSession session = request.getSession();
			// String id = (String)session.getAttribute("ID_SESSION");
			
			if (dao.deleteMember(request.getParameter("id").trim())==true) {
			
			// if (dao.deleteMember(id)==true) {
				msg = "회원정보를 성공적으로 삭제하였습니다.";
			} else {
				msg = "회원정보 삭제에 실패하였습니다.";
			} //
			
		} //
		
		request.setAttribute("msg", msg);
		
		// JSP 페이지(회원정보 조회) 이동
		RequestDispatcher rd 
			= request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	} //

}
