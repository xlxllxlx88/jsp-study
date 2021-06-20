package com.javateam.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

/**
 * Servlet implementation class MemberListAction
 */
@WebServlet("/list.do")
public class MemberListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDao dao = MemberDaoImpl.getInstance();
		
		int limit = 5; // 페이지당 출력 인원수
		int page = request.getParameter("page")==null ? 1 :
			       Integer.parseInt(request.getParameter("page"));
		
		List<MemberVo> members = dao.getMembersByPage(page, limit);
		
		// 전체 회원 수
		int maxNum = dao.getAllCount();
		
		// 총 페이지 수
		int totPage = maxNum / limit + 1;
		
		request.setAttribute("page", page);
		request.setAttribute("totPage", totPage);
		request.setAttribute("members", members);
		
		// JSP 페이지(회원정보 조회) 이동
		RequestDispatcher rd 
			= request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	} //
	
}
