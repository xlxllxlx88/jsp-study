package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DenmoServlet
 */
@WebServlet(
		description = "데모 서블릿", 
		urlPatterns = { 
				"/DenmoServlet", 
				"/demo.sj", 
				"/demo.do"
		}, 
		initParams = { 
				@WebInitParam(name = "java", value = "16", description = "자바의 버전"), 
				@WebInitParam(name = "jsp", value = "2.3", description = "JSP의 버전")
		})
public class DenmoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DenmoServlet() {
        super();
        // TODO Auto-generated constructor stub
        // 생성자는 만들어도 되고, 안만들어도 됩니다.
    }

	/**
	 * 서블릿 초기화 : 초기 인차 처리
	 * @see Servlet#init(ServletConfig)
	 */
    @Override
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
    	System.out.println("init");
		System.out.println("java : " + config.getInitParameter("java"));
		System.out.println("서블릿 이름 :" + config.getServletName());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	/**
	 * 서비스가 doGet, doPost 호출을 막고 있어서 잘 사용안함, get방식사용할 때는 doGet바로 호출, post방식으로 사용할 때는 doPost 바로 호출
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("request : 인자를 받을 때");
//		System.out.println("response : 인자를 요청할 때");
//		System.out.println("---------------- service ----------------");
//		
//		// doGet호출
//		doGet(request, response);
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		// getContextPath() : 프로젝트가 시작되는 기점 폴더(path)
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// JSP의 out 기본(내장) 객체(JspWriter)에 해당
		// 기본 content encoding : ISO-8859-1(서유럽어)
		// content type 구성: MIME; charset
		// ex) "text/html; charset=UTF-8"
		// <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("out : " + "서블릿 get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		doGet(request, response);
	}

}
