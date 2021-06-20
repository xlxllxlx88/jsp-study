package com.javateam.project.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Map;

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
 * Servlet implementation class MemberJoinProcAction
 */
@WebServlet("/join_proc.do")
public class MemberJoinProcAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoinProcAction() {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDao dao = MemberDaoImpl.getInstance(); // DAO
		String msg = ""; // 저장 성공 메시지
		
		System.out.println("인자 전송 확인");
		
		Map<String, String[]> map = request.getParameterMap();
		
		map.forEach((k,v)->System.out.println(k+"="+v[0]));
		
		// 회원정보 저장
		System.out.println("회원정보 저장");
		MemberVo member = new MemberVo();
		member.setId(map.get("id")[0]);
		member.setPw(map.get("pw")[0]);
		member.setName(map.get("name")[0]);
		member.setAddress(map.get("address")[0]);
		
		System.out.println("member : " + member);
		
		// 회원정보 저자 성공 여부/메시징
		if (dao.insertMember(member)==true) {
			msg = "회원정보 저장에 성공하였습니다.";
		} else {
			msg = "회원정보 저장에 실패하였습니다.";
		}
		
		// 메시지 전송
		request.setAttribute("msg", msg);
		
		// JSP 페이지 이동
		RequestDispatcher rd 
			= request.getRequestDispatcher("/member/join.jsp");
		rd.forward(request, response);
	} //

}
