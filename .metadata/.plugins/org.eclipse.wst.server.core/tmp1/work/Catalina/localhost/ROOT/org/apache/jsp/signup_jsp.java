/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-11-16 01:13:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1667367080000L));
    _jspx_dependants.put("jar:file:/Users/jinhwankim/Desktop/SpaceMusic/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SpaceMusic/WEB-INF/lib/standard.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/Users/jinhwankim/Desktop/SpaceMusic/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SpaceMusic/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>SpaceMusic_Join</title>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.1.js\" integrity=\"sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/signup.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write(' ');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"background\">\n");
      out.write("      <div class=\"signup-container\">\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/signup.sm\" method=\"post\" name=\"myform\" class=\"form-signup\" id=\"myform\" enctype=\"multipart/form-data\">\n");
      out.write("           <div class=\"user_picture_background\">\n");
      out.write("            <div id=\"user_picture_thumbnail\" class=\"user_picture_thumbnail\">\n");
      out.write("               <!-- 여기에 자바스크립트에서 짠 img태그 추가 됨 -->\n");
      out.write("            </div>\n");
      out.write("            <div id=\"user_picture_text\" class=\"user_picture_text\">\n");
      out.write("               <!-- 여기에 자바스크립트에서 짠 textContent 추가 됨 -->\n");
      out.write("            </div>\n");
      out.write("              <label for=\"user_picture\" class=\"user_picture_label\" id=\"user_picture_label\">프로필 사진을 선택하세요</label>\n");
      out.write("              <input type=\"file\" name=\"user_picture\" id=\"user_picture\" accept=\"image/*\" onchange=\"loadFile(this)\"/>\n");
      out.write("         </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("          <label for=\"user_id\" class=\"signup__label\"> Userid </label>\n");
      out.write("          <input id=\"user_id\" name=\"user_id\" class=\"signup__input\" type=\"text\" autocomplete=\"off\" value=\"아이디를 입력하세요\" />\n");
      out.write("          <button class=\"id_check_button\" type=\"button\" onclick=\"fn_ConfirmIdSend()\">아이디 중복검사</button>\n");
      out.write("          <input id=\"authenticationId\" type=\"hidden\"/>\n");
      out.write("\n");
      out.write("          <label for=\"user_pw\" class=\"signup__label\"> Password </label>\n");
      out.write("          <input id=\"user_pw\" name=\"user_pw\" class=\"signup__input\" type=\"password\" value=\"비밀번호를 입력하세요\" />\n");
      out.write("\n");
      out.write("          <label for=\"signup-input-passwordchk\" name=\"signup-input-passwordchk\" class=\"signup__label\"> Password check </label>\n");
      out.write("          <input id=\"signup-input-passwordchk\"  name=\"signup-input-passwordchk\" class=\"signup__input\" type=\"password\" value=\"비밀번호를 입력하세요\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <label for=\"user_name\" class=\"signup__label\"> Username </label>\n");
      out.write("          <input id=\"user_name\" name=\"user_name\" class=\"signup__input\" type=\"text\" autocomplete=\"off\" value=\"이름을 입력하세요\" />\n");
      out.write("\n");
      out.write("          <label for=\"user_email\" class=\"email__label\"> Email </label>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <input id=\"user_email\" name=\"user_email\" class=\"email_check_input\" type=\"text\" autocomplete=\"off\" value=\"이메일을 입력하세요\" />\n");
      out.write("          <button class=\"email_check_button\" type=\"button\" onclick=\"fn_ConfirmEmailSend()\">인증메일 보내기</button>\n");
      out.write("          \n");
      out.write("          <label for=\"user_email_chk\" class=\"email__label\"> 인증번호 </label>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <input id=\"user_email_chk\" name=\"user_email_chk\" class=\"email_check_input\" type=\"text\" autocomplete=\"off\" value=\"인증번호를 입력하세요\" />\n");
      out.write("          <button class=\"email_check_button\" type=\"button\" onclick=\"fn_EmailConfirm()\">이메일 인증하기</button>\n");
      out.write("          <input id=\"authenticationEmail\" type=\"hidden\"/>\n");
      out.write("          <input id=\"authenticationNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authenticationNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"hidden\"/>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <label for=\"user_phone\" class=\"signup__label\"> Phone </label>\n");
      out.write("          <input id=\"user_phone\" name=\"user_phone\" class=\"signup__input\" type=\"text\" autocomplete=\"off\" value=\"핸드폰 번호를 입력하세요\" />\n");
      out.write("			\n");
      out.write("			<input id=\"user_comment\" name=\"user_comment\" type=\"hidden\"/>		<!-- 유저 소개글 히든 인풋박스 -->\n");
      out.write("			\n");
      out.write("          <hr />\n");
      out.write("          <button class=\"signup__submit\" type=\"button\" onclick=\"fn_validation(this.form)\">회원가입</button>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("  <script src=\"./assets/js/signup.js\"></script>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /signup.jsp(20,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("picture");
      // /signup.jsp(20,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.picture }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /signup.jsp(21,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("authenticationNum");
      // /signup.jsp(21,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.authenticationNum }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }
}