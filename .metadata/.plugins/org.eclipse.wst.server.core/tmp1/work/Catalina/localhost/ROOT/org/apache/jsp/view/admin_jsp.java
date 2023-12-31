/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-18 05:28:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>상품 등록</title>\r\n");
      out.write("    <style>\r\n");
      out.write("    	h1{\r\n");
      out.write("    		text-align: center;\r\n");
      out.write("    	}\r\n");
      out.write("        table {\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("        th, td {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("        tfoot {\r\n");
      out.write("			text-align: center;\r\n");
      out.write("		}\r\n");
      out.write("		#input_file_S, #input_file_L{\r\n");
      out.write("			visibility: hidden;\r\n");
      out.write("		}\r\n");
      out.write("		.label_S, .label_L{\r\n");
      out.write("			  border-radius: 4px;\r\n");
      out.write("			  color: black;\r\n");
      out.write("			  cursor: pointer;\r\n");
      out.write("		}\r\n");
      out.write("		.file_text{\r\n");
      out.write("			width:50%;\r\n");
      out.write("		}\r\n");
      out.write("		span{\r\n");
      out.write("			display:inline-block;\r\n");
      out.write("			background-color:lightgray;\r\n");
      out.write("			margin-left:5px;\r\n");
      out.write("			padding:8px;\r\n");
      out.write("			color:white;\r\n");
      out.write("			border:1px solid black;\r\n");
      out.write("		}\r\n");
      out.write("		span:hover{\r\n");
      out.write("			background-color: white;\r\n");
      out.write("			color:black;\r\n");
      out.write("			font-weight: bold;\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form action=\"상품_등록_처리.jsp\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <table>\r\n");
      out.write("        <thead>\r\n");
      out.write("        	<h1>상품 등록</h1>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>분류</th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"radio\" name=\"category\" value=\"컴퓨터\"> 컴퓨터\r\n");
      out.write("                    <input type=\"radio\" name=\"category\" value=\"가전제품\"> 가전제품\r\n");
      out.write("                    <input type=\"radio\" name=\"category\" value=\"스포츠\"> 스포츠\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>제품번호</th>\r\n");
      out.write("                <td><input type=\"text\" name=\"productNumber\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>제품명</th>\r\n");
      out.write("                <td><input type=\"text\" name=\"productName\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>판매사</th>\r\n");
      out.write("                <td><input type=\"text\" name=\"seller\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>상품가격</th>\r\n");
      out.write("                <td><input type=\"text\" name=\"price\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>할인가</th>\r\n");
      out.write("                <td><input type=\"text\" name=\"discountPrice\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>상품이미지 S</th>\r\n");
      out.write("                <td><label class=\"label_S\" for=\"input_file_S\"><input type=\"text\" class=\"file_text\" id=\"file_text_S\"><span>찾아볼까?</span></label>\r\n");
      out.write("                <input id=\"input_file_S\" type=\"file\" name=\"imageS\" onchange=\"fifS()\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>상품이미지 L</th>\r\n");
      out.write("                <td><label class=\"label_L\" for=\"input_file_L\"><input type=\"text\" class=\"file_text\"><span>찾아볼까?</span></label>\r\n");
      out.write("                <input id=\"input_file_L\" type=\"file\" name=\"imageL\" onchange=\"fifL()\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>상품내용</th>\r\n");
      out.write("                <td><textarea name=\"productContent\" rows=\"10\" style=\"width: 100%;\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("	        <tfoot>\r\n");
      out.write("	        	<tr>\r\n");
      out.write("					<td colspan=\"2\">\r\n");
      out.write("			        	<input type=\"submit\" value=\"상품 등록\" />\r\n");
      out.write("			        </td>\r\n");
      out.write("	        	</tr>\r\n");
      out.write("	        </tfoot>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </form>\r\n");
      out.write("    	<script type=\"text/javascript\">\r\n");
      out.write("		let ifS = document.getElementById(\"input_file_S\");\r\n");
      out.write("		let ifL = document.getElementById(\"input_file_L\");\r\n");
      out.write("		\r\n");
      out.write("		function fifS(){\r\n");
      out.write("				document.getElementById(\"file_text_S\").value = ifS.value;\r\n");
      out.write("		}\r\n");
      out.write("		function fifL(){\r\n");
      out.write("				document.getElementById(\"file_text_L\").value = ifL.value;\r\n");
      out.write("		}\r\n");
      out.write("	</script> \r\n");
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
