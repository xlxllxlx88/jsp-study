/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-05 07:00:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class methodTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>methodTest</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("/* $(document).ready -> 문서가준비 되었을 때, 창이 열렸을 때 */\r\n");
      out.write(" $(document).ready(function() {\r\n");
      out.write("	 \r\n");
      out.write("	/*  $('#get').click(function() { -> get버튼 클릭 */\r\n");
      out.write("	\r\n");
      out.write("	 $('#get').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'get',\r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val(),\r\n");
      out.write("				 price : $('#price').val(),\r\n");
      out.write("				 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data {키 : 값}\r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				console.log(\"data : \", data) //\r\n");
      out.write("				var json = JSON.parse(data);\r\n");
      out.write("				console.log(\"result : \",json.result);\r\n");
      out.write("				console.log(\"msg : \",json.msg);\r\n");
      out.write("				\r\n");
      out.write("				// 필드 출력\r\n");
      out.write("				 $(\"#output\").val(json.result);\r\n");
      out.write("				 $(\"#output2\").val(json.msg);\r\n");
      out.write("		 	 }, // success\r\n");
      out.write("		 	 error : function(xhr, status, error) {\r\n");
      out.write("		 			console.log(\"status : \", status);\r\n");
      out.write("		 	 }\r\n");
      out.write("		 	\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // get\r\n");
      out.write("	 \r\n");
      out.write("	 $('#post').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'post', \r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val(),\r\n");
      out.write("				 price : $('#price').val(),\r\n");
      out.write("				 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data \r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				 //\r\n");
      out.write("		 	} // success\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // post\r\n");
      out.write("	 \r\n");
      out.write("	 $('#put').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'put',\r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val(),\r\n");
      out.write("				 price : $('#price').val(),\r\n");
      out.write("				 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data \r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				 //\r\n");
      out.write("		 	} // success\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // put\r\n");
      out.write("	 \r\n");
      out.write("	 $('#delete').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'delete',\r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val() //,\r\n");
      out.write("			//	 price : $('#price').val(),\r\n");
      out.write("			//	 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data \r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				 //\r\n");
      out.write("		 	} // success\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // delete\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	 $('#head').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'head',\r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val(),\r\n");
      out.write("				 price : $('#price').val(),\r\n");
      out.write("				 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data \r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				 //\r\n");
      out.write("		 	} // success\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // head\r\n");
      out.write("	 \r\n");
      out.write("	 $('#options').click(function() {\r\n");
      out.write("		 $.ajax({\r\n");
      out.write("			 url : 'http://localhost:8181/submitSample/RestServlet',\r\n");
      out.write("			 type : 'options',\r\n");
      out.write("			 dataType:'text',\r\n");
      out.write("			 data : {\r\n");
      out.write("				 id : $('#id').val(),\r\n");
      out.write("				 account : $('#account').val(),\r\n");
      out.write("				 price : $('#price').val(),\r\n");
      out.write("				 bigo : $('#bigo').val()\r\n");
      out.write("			 }, // data \r\n");
      out.write("			 success : function(data) {\r\n");
      out.write("				 //\r\n");
      out.write("		 	} // success\r\n");
      out.write("		 }) // ajax\r\n");
      out.write("	 }) // options\r\n");
      out.write("	 \r\n");
      out.write(" }) //\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("출력 : <input type=\"text\" id=\"output\" /><br>\r\n");
      out.write("출력2 : <input type=\"text\" id=\"output2\" /><br>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("id : <input type=\"text\" id=\"id\"><br>\r\n");
      out.write("account : <input type=\"text\" id=\"account\"><br>\r\n");
      out.write("price : <input type=\"text\" id=\"price\"><br>\r\n");
      out.write("bigo : <input type=\"text\" id=\"bigo\"><br><br>\r\n");
      out.write("\r\n");
      out.write("<button id=\"get\">GET</button>&nbsp;\r\n");
      out.write("<button id=\"put\">PUT</button>&nbsp;\r\n");
      out.write("<button id=\"post\">POST</button>&nbsp;\r\n");
      out.write("<button id=\"delete\">DELETE</button>&nbsp;\r\n");
      out.write("<button id=\"head\">HEAD</button>&nbsp;\r\n");
      out.write("<button id=\"options\">Options</button>&nbsp;\r\n");
      out.write("<!-- <button id=\"trace\">Trace</button>\r\n");
      out.write(" -->\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
