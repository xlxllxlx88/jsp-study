
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RestServlet
 */
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RestServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		String id = request.getParameter("id");
		String account = request.getParameter("account");
		System.out.println(id + " ," + account);
		
		response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/plain charset=UTF-8");
		response.setContentType("application/json charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("{\"result\":\""+ Math.random() +"\", \"msg\":\"성공\"}");
		//out.println("result success, ");
		//out.println("결과 성공");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		String id = request.getParameter("id");
		String account = request.getParameter("account");
		System.out.println(id + " ," + account);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String data = null;
		String data2 = "";
		System.out.println("doPut");

		// put 방식, delete 방식은 servlet에서 request.getParameter 사용불가
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

		while ((data = br.readLine()) != null) {
			data2 += data;
		}

		System.out.println(data2);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String data = null;
		String data2 = "";
		System.out.println("doDelete");

		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

		while ((data = br.readLine()) != null) {
			data2 += data;
		}

		System.out.println(data2);
	}
	
	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doHead");
	}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doOptions");
		/*
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.setHeader("Access-Control-Max-Age", "86400");
		response.setHeader("Allow", "GET, HEAD, POST, TRACE, OPTIONS");
		*/
	}

	/**
	 * @see HttpServlet#doTrace(HttpServletRequest, HttpServletResponse)
	 */
	protected void doTrace(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doTrace");	
	
	}
}
