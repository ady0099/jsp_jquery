/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-26 06:02:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01_005fjquery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex28_005fbanner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	*{\r\n");
      out.write("		margin: 0px;\r\n");
      out.write("		padding: 0px;\r\n");
      out.write("	}\r\n");
      out.write("	img{\r\n");
      out.write("		border: none;\r\n");
      out.write("		vertical-align: top;\r\n");
      out.write("	}\r\n");
      out.write("	li img{width:200px}\r\n");
      out.write("	ul li{\r\n");
      out.write("		list-style: none;\r\n");
      out.write("		float: left;\r\n");
      out.write("		width: 200px; 		\r\n");
      out.write("	}\r\n");
      out.write("	h2{text-align: center;}\r\n");
      out.write("	#banner_wrap{\r\n");
      out.write("		width: 600px;\r\n");
      out.write("		padding: 20px;\r\n");
      out.write("		margin: 0 auto;\r\n");
      out.write("		border: 1px solid #aaa;\r\n");
      out.write("		}\r\n");
      out.write("	#frame{\r\n");
      out.write("		width: 600px;\r\n");
      out.write("		overflow: hidden;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		margin: 10px auto; 	\r\n");
      out.write("	}\r\n");
      out.write("	#banner{width: 50000px;}\r\n");
      out.write("	#img{text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	var list = $(\"#banner\");\r\n");
      out.write("	var show_num = 3; 			// 화면에 노출되는 그림 수\r\n");
      out.write("	var num = 0;				// 이전,다음버튼 클릭하면 증감되는 변수\r\n");
      out.write("	var total = $(\"li\").length; // li의 갯수\r\n");
      out.write("	var li_width = $(\"li:first\").width(); // 200\r\n");
      out.write("	\r\n");
      out.write("	// li태그중 인덱스 값이 3보다 작아지면 li태그 복사하여 붙여넣기\r\n");
      out.write("	// gt, eq, li\r\n");
      out.write("	var copyObj = $(\"li:lt(\"+show_num+\")\").clone();\r\n");
      out.write("	list.append(copyObj);\r\n");
      out.write("	\r\n");
      out.write("	$(\".next\").on(\"click\", function() {\r\n");
      out.write("		if(num == total){\r\n");
      out.write("			num = 0;\r\n");
      out.write("			list.css(\"margin-left\", num)		\r\n");
      out.write("		}\r\n");
      out.write("		num ++;\r\n");
      out.write("		list.stop().animate({marginLeft : -li_width * num + \"px\"}, 800);\r\n");
      out.write("		return false;\r\n");
      out.write("	});\r\n");
      out.write("	$(\".prev\").on(\"click\", function() {\r\n");
      out.write("		if(num == 0){\r\n");
      out.write("			num = total;\r\n");
      out.write("			list.css(\"margin-left\", num);			\r\n");
      out.write("		}\r\n");
      out.write("		num --;\r\n");
      out.write("		list.stop().animate({marginLeft : -li_width * num + \"px\"}, 800);\r\n");
      out.write("		return false;\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>롤링 슬라이드 배너 만들기</h1>\r\n");
      out.write("	<br><br><br><br><br>\r\n");
      out.write("	<div id=\"banner_wrap\">\r\n");
      out.write("		<div id=\"frame\">\r\n");
      out.write("			<ul id=\"banner\">\r\n");
      out.write("				<li><a href=\"#\"><img src=\"../images/catup.ico\"></a></li>\r\n");
      out.write("				<li><a href=\"#\"><img src=\"../images/apple.gif\"></a></li>\r\n");
      out.write("				<li><a href=\"#\"><img src=\"../images/catdown.ico\"></a></li>\r\n");
      out.write("				<li><a href=\"#\"><img src=\"../images/apple.gif\"></a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<p id=\"img\">\r\n");
      out.write("			<a href=\"#\" class=\"prev\"><img src=\"../images/prev_btn.png\"></a>\r\n");
      out.write("			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("			<a href=\"#\" class=\"next\"><img src=\"../images/next_btn.png\"></a>\r\n");
      out.write("		</p>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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
