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

@WebServlet("/update_proc.do")
public class MemberUpdateProcAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("인자 전송 확인");
		
		String msg = ""; // 메시지
		
		MemberDao dao = MemberDaoImpl.getInstance();
		String id = request.getParameter("id");
		
		request.getParameterMap()
		       .forEach((k,v)->System.out.println(k+"="+v[0]));
		
		// 변경사항 저장
		// 유의사항) 신규 패쓰워드 공백 => 기존 패쓰워드 유지
		// MemberVo member = dao.getMember(id);
		
		MemberVo member = new MemberVo();
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setAddress(request.getParameter("address"));
		
		if (request.getParameter("pw2").equals("")) {
			// 패쓰워드 변경의사 없음 => 기존 패쓰워드 저장
			member.setPw(request.getParameter("pw"));
		} else {
			// 패쓰워드 변경 => 신규 패쓰워드 저장
			member.setPw(request.getParameter("pw2"));
		}
		
		System.out.println("변경된 회원정보 : " + member);
		
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
			= request.getRequestDispatcher("/member/update.jsp");
		rd.forward(request, response);
		
	} //

}
