/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-25 00:38:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;

public final class HW0720_005fLHJ_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.time.LocalDateTime");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	background-color: lightyellow;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#movie {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#movie2 {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	left: 530px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#close {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#close2 {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	text-align: right;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	alert(document.cookie); //모든 쿠키를 볼 수 있음\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		var ban_popup2 = $.cookie('ban_popup2');\r\n");
      out.write("		if (ban_popup2 != null && ban_popup2 == 'true') {\r\n");
      out.write("			$(\"#movie2\").css(\"display\", \"none\");\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		$(\"#close\").on(\"click\", function() {\r\n");
      out.write("			$(\"#movie\").css(\"display\", \"none\");\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#close2\").on(\"click\", function() {\r\n");
      out.write("			$(\"#movie2\").css(\"display\", \"none\");\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#closeday\").on(\"click\", function() {\r\n");
      out.write("			//https://dullyshin.github.io/2019/09/10/WEB-CookiesMakeDel/\r\n");
      out.write("			$.cookie('ban_popup2', 'true', {\r\n");
      out.write("				expires : 1\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#movie2\").css(\"display\", \"none\");\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"movie\">\r\n");
      out.write("		<img alt=\"\" src=\"../images/pic_bulbon.gif\"\r\n");
      out.write("			style=\"background-color: skyblue; width: 500px; height: 300px;\">\r\n");
      out.write("		<div id=\"close\" style=\"background-color: skyblue;\">닫기</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"movie2\">\r\n");
      out.write("		<img alt=\"\" src=\"../images/pic_bulbon.gif\"\r\n");
      out.write("			style=\"background-color: skyblue; width: 500px; height: 300px;\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<span id=\"close2\" style=\"background-color: skyblue;\">닫기</span> <span\r\n");
      out.write("				id=\"closeday\" style=\"background-color: skyblue;\">오늘 그만 보기</span>>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<h2>ICT 사진관</h2>\r\n");
      out.write("		<div>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("			<p>사진관 오시는 길</p>\r\n");
      out.write("			<p>2호선 신촌역</p>\r\n");
      out.write("		</div>\r\n");
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
