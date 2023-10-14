/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-03 02:31:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jspexam;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.domain.MeetingDTO;
import java.util.ArrayList;

public final class meetingView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("model.domain.MeetingDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poor+Story:400\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("    * {\r\n");
      out.write("    	font-family: \"Poor Story\"   \r\n");
      out.write("    }\r\n");
      out.write("	td{\r\n");
      out.write("		border-bottom : 2px dotted green;\r\n");
      out.write("		padding-left : 20px;\r\n");
      out.write("	}\r\n");
      out.write("	tr:hover{ \r\n");
      out.write("		background-color : pink;	\r\n");
      out.write("		font-weight : bold;\r\n");
      out.write("	}\r\n");
      out.write("	td:nth-child(2){\r\n");
      out.write("		width : 300px;\r\n");
      out.write("	}\r\n");
      out.write("	input, textarea {\r\n");
      out.write("		padding-bottom : 8px;\r\n");
      out.write("		border-radius : 5px;\r\n");
      out.write("	}\r\n");
      out.write("	div {\r\n");
      out.write("		margin-top : 20px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	ArrayList<MeetingDTO> list = (ArrayList<MeetingDTO>)request.getAttribute("list");
	if(list != null){

      out.write("\r\n");
      out.write("	<h2>미팅 스케쥴</h2><hr>\r\n");
      out.write("	<table>\r\n");

		for(MeetingDTO vo : list){

      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("			<td class='");
      out.print( vo.getId() );
      out.write('\'');
      out.write('>');
      out.print( vo.getName() );
      out.write("</td>\r\n");
      out.write("			<td class='");
      out.print( vo.getId() );
      out.write("' onclick=\"displayReply(");
      out.print( vo.getId());
      out.write(")\" >");
      out.print( vo.getTitle() );
      out.write("</td>\r\n");
      out.write("			<td class='");
      out.print( vo.getId() );
      out.write('\'');
      out.write('>');
      out.print( vo.getMeetingDate() );
      out.write("</td>\r\n");
      out.write("			<td><a href ='/mvc/meeting?action=delete&id=");
      out.print( vo.getId() );
      out.write("'>\r\n");
      out.write("			<img src = \"/mvc/images/delete.png\" width ='20'></a></td>\r\n");
      out.write("			<td><img onclick=\"displayUpdateForm('");
      out.print( vo.getId() );
      out.write("')\" \r\n");
      out.write("			       src=\"/mvc/images/edit.png\" width ='20'></td>\r\n");
      out.write("			<td><img onclick=\"insertReply('");
      out.print( vo.getId() );
      out.write("')\" \r\n");
      out.write("			       src=\"/mvc/images/comment.png\" width ='25'></td>\r\n");
      out.write("			</tr>\r\n");

		}

      out.write("\r\n");
      out.write("	</table>\r\n");

	}
	if (request.getAttribute("msg") != null) {

      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");

	}

      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<button onclick=\"displayDiv(1);\">미팅 정보 작성</button>\r\n");
      out.write("<button onclick=\"displayDiv(2);\">미팅 정보 검색</button>\r\n");
      out.write("<script>\r\n");
      out.write("function displayDiv(type) {\r\n");
      out.write("	if(type == 1) {\r\n");
      out.write("		document.getElementById(\"search\").style.display='none';\r\n");
      out.write("		document.getElementById(\"write\").style.display='block';\r\n");
      out.write("		document.getElementById(\"divT\").textContent=\"미팅정보 작성\";\r\n");
      out.write("		document.querySelector(\"#write [type=submit]\").value=\"등록\";\r\n");
      out.write("		document.querySelector(\"#write [type=hidden]\").value=\"insert\";\r\n");
      out.write("	} else if(type == 2) {\r\n");
      out.write("		document.getElementById(\"write\").style.display='none';\r\n");
      out.write("		document.getElementById(\"search\").style.display='block';\r\n");
      out.write("	}	\r\n");
      out.write("}\r\n");
      out.write("function displayUpdateForm(cv) {\r\n");
      out.write("    var doms = document.getElementsByClassName(cv);\r\n");
      out.write("    document.getElementById(\"search\").style.display='none';\r\n");
      out.write("	document.getElementById(\"write\").style.display='block';	\r\n");
      out.write("	document.getElementById(\"m_name\").value = \r\n");
      out.write("		                                  doms[0].textContent;\r\n");
      out.write("	document.getElementById(\"m_title\").value = \r\n");
      out.write("		                                  doms[1].textContent;\r\n");
      out.write("	var str = doms[2].textContent;\r\n");
      out.write("	var ary = str.split(/\\D+/g)\r\n");
      out.write("	var meeting_dt = ary[0]+\"-\"+ary[1]+\"-\"+ary[2]+\r\n");
      out.write("	                          \"T\"+ary[3]+\":\"+ary[4];\r\n");
      out.write("	document.getElementById(\"m_dt\").value = meeting_dt;\r\n");
      out.write("	document.getElementById(\"divT\").textContent=\"미팅정보 수정\";\r\n");
      out.write("	document.querySelector(\"#write [type=submit]\").value=\"수정\";\r\n");
      out.write("	document.querySelector(\"#write [type=hidden]\").value=cv;\r\n");
      out.write("}\r\n");
      out.write("function displayReply(id) {\r\n");
      out.write("	var xhr = new XMLHttpRequest();\r\n");
      out.write("	xhr.onload = function () {\r\n");
      out.write("		if(xhr.status == 200) {				\r\n");
      out.write("			let jsondoms = JSON.parse(xhr.responseText);\r\n");
      out.write("			let replyContent = \"\";			\r\n");
      out.write("			for(let i in jsondoms) {	\r\n");
      out.write("				i = Number(i);\r\n");
      out.write("				replyContent += \"[댓글\"+(i+1)+\"] 작성자명 : \"+jsondoms[i].name+\", 내용 : \"+jsondoms[i].content+\"\\n\"; \r\n");
      out.write("			}\r\n");
      out.write("			if (!replyContent)\r\n");
      out.write("				replyContent = \"아직 작성된 댓글이 없네요...😂\";\r\n");
      out.write("			window.alert(replyContent);\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	xhr.open(\"GET\", \"/mvc/meeting?action=lreply&id=\"+id, true);\r\n");
      out.write("	xhr.send();		\r\n");
      out.write("}\r\n");
      out.write("function insertReply(id) {\r\n");
      out.write("	let name = window.prompt(\"댓글 작성자의 성명을 입력하세요..\");\r\n");
      out.write("	let content = window.prompt(\"댓글 내용을 입력하세요..\");\r\n");
      out.write("	let query = \"action=ireply&name=\"+name+\"&content=\"+content+\"&refid=\"+id;	\r\n");
      out.write("	var xhr = new XMLHttpRequest();\r\n");
      out.write("	xhr.onload = function () {\r\n");
      out.write("		if(xhr.status == 200) {				\r\n");
      out.write("			let jsondom = JSON.parse(xhr.responseText);\r\n");
      out.write("			if (jsondom.result == true)\r\n");
      out.write("				window.alert(\"댓글 작성이 완료되었습니다.\");\r\n");
      out.write("			else\r\n");
      out.write("				window.alert(\"댓글 작성에 실패했습니다.\");\r\n");
      out.write("		}\r\n");
      out.write("	};\r\n");
      out.write("	xhr.open(\"GET\", \"/mvc/meeting?\"+query, true);\r\n");
      out.write("	xhr.send();		\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"write\"  style=\"display:none\">\r\n");
      out.write(" <hr><h2 id=\"divT\">미팅정보 작성</h2>\r\n");
      out.write(" <form method = \"post\" action = \"/mvc/meeting\">\r\n");
      out.write(" <input type=\"hidden\" name=\"action\" value=\"insert\">\r\n");
      out.write(" 미팅 대상 이름 : <input id=\"m_name\" type=\"text\"  name=\"name\">\r\n");
      out.write(" <br>\r\n");
      out.write(" 미팅 목적 : <br>\r\n");
      out.write(" <textarea id=\"m_title\"  rows=\"3\" cols=\"60\" name = \"title\" ></textarea>\r\n");
      out.write(" <br>\r\n");
      out.write(" 날짜와 시간 :  <input id=\"m_dt\" type=\"datetime-local\" name=\"meetingDate\">\r\n");
      out.write(" <br><br>\r\n");
      out.write(" <input type = \"submit\" value = \"등록\">\r\n");
      out.write(" <button onclick=\"document.getElementById('write').style.display='none';return false\">취소</button>\r\n");
      out.write(" </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"search\" style=\"display:none\">\r\n");
      out.write(" <hr>\r\n");
      out.write(" <form method = \"get\" action =\"/mvc/meeting\">\r\n");
      out.write(" 미팅 대상 이름 : <input type = \"search\" name = \"keyword\" >\r\n");
      out.write(" <input type = \"submit\" value = \"검색\">\r\n");
      out.write(" </form>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<div>\r\n");
      out.write(" <button type=\"button\" onclick=\"location.href='/mvc/meeting' \">전체 미팅 스케쥴 보기</button>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
