/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.6
 * Generated at: 2016-12-22 06:14:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Bootstrap Example</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".bgimg\r\n");
      out.write("{\r\n");
      out.write("background-image:url(\"resources/images/images.jpg\");\r\n");
      out.write("}\r\n");
      out.write("body\r\n");
      out.write("{ \r\n");
      out.write("    background:url(\"resources/images/white-background-wallpaper-004.jpg\");\r\n");
      out.write("}\r\n");
      out.write("#footer {\r\n");
      out.write("    border-top: 5px solid #CDB380;background-image:url(\"resources/images/bgb.jpg\");\r\n");
      out.write("    \r\n");
      out.write("    padding-top: 30px;\r\n");
      out.write("    margin-top: 60px;\r\n");
      out.write("    clear: both;\r\n");
      out.write("    color: #AAA;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer .widgettitle {\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    padding: 0px 0px 15px;\r\n");
      out.write("    border-bottom: medium none;\r\n");
      out.write("}\r\n");
      out.write("#footer h4 {\r\n");
      out.write("    color: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer ul {\r\n");
      out.write("    list-style: outside none none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer li {\r\n");
      out.write("    padding: 7px 0px;\r\n");
      out.write("    border-bottom: 1px dotted rgba(255, 255, 255, 0.2);\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer li a {\r\n");
      out.write("    color:blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sub-floor {\r\n");
      out.write("    color: #AAA;\r\n");
      out.write("    background: #031634 none repeat scroll 0% 0%;\r\n");
      out.write("    padding: 10px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bgimg\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("              \t<i class=\"fa fa-gift\" style=\"font-size:60px;color:orange;\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t<h1><font size=\"40\"; color=\"orange\">GIFTS GALORE</font></h1>\r\n");
      out.write("\t\t<p><font size=\"5\">THRISSUR</font></p></center >\r\n");
      out.write("\t\t</div><br>\r\n");
      out.write("\t\r\n");
      out.write("<br>\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-inverse\" role=\"navigation\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\" \">Home</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"images\">Images</a></li>\r\n");
      out.write("        <li><a href=\"aboutus\">About us</a></li>\r\n");
      out.write("<li><a href=\"contact\">Contact</a></li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Product <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("            <li><a href=\"prodect\">About us</a></li>\r\n");
      out.write("            <li><a href=\"prodect\">Contact action</a></li>\r\n");
      out.write("            <li><a href=\"prodect\">Address</a></li>\r\n");
      out.write("            <li class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#\"></a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"register\">Register</a></li>\r\n");
      out.write("<li><a href=\"login\">Login</a></li>\r\n");
      out.write("          </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div class=\"container text-center\" id=\"wrap\">\r\n");
      out.write("\t  <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\r\n");
      out.write("            <form action=\"\" method=\"post\" accept-charset=\"utf-8\" class=\"form\" role=\"form\">   <legend>Sign Up</legend>\r\n");
      out.write("                    \r\n");
      out.write("\t\t<div class=\"imgcontainer\">\r\n");
      out.write("    \t\t\t<img src=\"resources/images/login.png\" alt=\"Log\" width=\"180\" height=\"180\">\r\n");
      out.write(" \t\t </div><br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"firstname\" value=\"\" class=\"form-control input-lg\" placeholder=\"First Name\"/></div>\r\n");
      out.write("                       <div class=\"col-xs-6 col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"lastname\" value=\"\" class=\"form-control input-lg\" placeholder=\"Last Name\"/></div>\r\n");
      out.write("                    </div><br>\r\n");
      out.write("                    <input type=\"text\" name=\"email\" value=\"\" class=\"form-control input-lg\" placeholder=\"Your Email\" /><br><br>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" value=\"\" class=\"form-control input-lg\" placeholder=\"Password\"  /><br><br>\r\n");
      out.write("                     <input type=\"password\" name=\"confirm_password\" value=\"\" class=\"form-control input-lg\" placeholder=\"Confirm Password\"/><br><br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("                        <!--<div class=\"col-xs-4 col-md-4\">-->\r\n");
      out.write("                           <label>Birth Date :</label><select>\r\n");
      out.write("<option value=\"01\">Jan</option>\r\n");
      out.write("<option value=\"02\">Feb</option>\r\n");
      out.write("<option value=\"03\">Mar</option>\r\n");
      out.write("<option value=\"04\">Apr</option>\r\n");
      out.write("<option value=\"05\">May</option>\r\n");
      out.write("<option value=\"06\">Jun</option>\r\n");
      out.write("<option value=\"07\">Jul</option>\r\n");
      out.write("<option value=\"08\">Aug</option>\r\n");
      out.write("<option value=\"09\">Sep</option>\r\n");
      out.write("<option value=\"10\">Oct</option>\r\n");
      out.write("<option value=\"11\">Nov</option>\r\n");
      out.write("<option value=\"12\">Dec</option>\r\n");
      out.write("</select>                        \r\n");
      out.write("                            <select>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("<option value=\"4\">4</option>\r\n");
      out.write("<option value=\"5\">5</option>\r\n");
      out.write("<option value=\"6\">6</option>\r\n");
      out.write("<option value=\"7\">7</option>\r\n");
      out.write("<option value=\"8\">8</option>\r\n");
      out.write("<option value=\"9\">9</option>\r\n");
      out.write("<option value=\"10\">10</option>\r\n");
      out.write("<option value=\"11\">11</option>\r\n");
      out.write("<option value=\"12\">12</option>\r\n");
      out.write("<option value=\"13\">13</option>\r\n");
      out.write("<option value=\"14\">14</option>\r\n");
      out.write("<option value=\"15\">15</option>\r\n");
      out.write("<option value=\"16\">16</option>\r\n");
      out.write("<option value=\"17\">17</option>\r\n");
      out.write("<option value=\"18\">18</option>\r\n");
      out.write("<option value=\"19\">19</option>\r\n");
      out.write("<option value=\"20\">20</option>\r\n");
      out.write("<option value=\"21\">21</option>\r\n");
      out.write("<option value=\"22\">22</option>\r\n");
      out.write("<option value=\"23\">23</option>\r\n");
      out.write("<option value=\"24\">24</option>\r\n");
      out.write("<option value=\"25\">25</option>\r\n");
      out.write("<option value=\"26\">26</option>\r\n");
      out.write("<option value=\"27\">27</option>\r\n");
      out.write("<option value=\"28\">28</option>\r\n");
      out.write("<option value=\"29\">29</option>\r\n");
      out.write("<option value=\"30\">30</option>\r\n");
      out.write("<option value=\"31\">31</option>\r\n");
      out.write("</select>\r\n");
      out.write("                \r\n");
      out.write("                            <select>\r\n");
      out.write("<option value=\"1935\">1935</option>\r\n");
      out.write("<option value=\"1936\">1936</option>\r\n");
      out.write("<option value=\"1937\">1937</option>\r\n");
      out.write("<option value=\"1938\">1938</option>\r\n");
      out.write("<option value=\"1939\">1939</option>\r\n");
      out.write("<option value=\"1940\">1940</option>\r\n");
      out.write("<option value=\"1941\">1941</option>\r\n");
      out.write("<option value=\"1942\">1942</option>\r\n");
      out.write("<option value=\"1943\">1943</option>\r\n");
      out.write("<option value=\"1944\">1944</option>\r\n");
      out.write("<option value=\"1945\">1945</option>\r\n");
      out.write("<option value=\"1946\">1946</option>\r\n");
      out.write("<option value=\"1947\">1947</option>\r\n");
      out.write("<option value=\"1948\">1948</option>\r\n");
      out.write("<option value=\"1949\">1949</option>\r\n");
      out.write("<option value=\"1950\">1950</option>\r\n");
      out.write("<option value=\"1951\">1951</option>\r\n");
      out.write("<option value=\"1952\">1952</option>\r\n");
      out.write("<option value=\"1953\">1953</option>\r\n");
      out.write("<option value=\"1954\">1954</option>\r\n");
      out.write("<option value=\"1955\">1955</option>\r\n");
      out.write("<option value=\"1956\">1956</option>\r\n");
      out.write("<option value=\"1957\">1957</option>\r\n");
      out.write("<option value=\"1958\">1958</option>\r\n");
      out.write("<option value=\"1959\">1959</option>\r\n");
      out.write("<option value=\"1960\">1960</option>\r\n");
      out.write("<option value=\"1961\">1961</option>\r\n");
      out.write("<option value=\"1962\">1962</option>\r\n");
      out.write("<option value=\"1963\">1963</option>\r\n");
      out.write("<option value=\"1964\">1964</option>\r\n");
      out.write("<option value=\"1965\">1965</option>\r\n");
      out.write("<option value=\"1966\">1966</option>\r\n");
      out.write("<option value=\"1967\">1967</option>\r\n");
      out.write("<option value=\"1968\">1968</option>\r\n");
      out.write("<option value=\"1969\">1969</option>\r\n");
      out.write("<option value=\"1970\">1970</option>\r\n");
      out.write("<option value=\"1971\">1971</option>\r\n");
      out.write("<option value=\"1972\">1972</option>\r\n");
      out.write("<option value=\"1973\">1973</option>\r\n");
      out.write("<option value=\"1974\">1974</option>\r\n");
      out.write("<option value=\"1975\">1975</option>\r\n");
      out.write("<option value=\"1976\">1976</option>\r\n");
      out.write("<option value=\"1977\">1977</option>\r\n");
      out.write("<option value=\"1978\">1978</option>\r\n");
      out.write("<option value=\"1979\">1979</option>\r\n");
      out.write("<option value=\"1980\">1980</option>\r\n");
      out.write("<option value=\"1981\">1981</option>\r\n");
      out.write("<option value=\"1982\">1982</option>\r\n");
      out.write("<option value=\"1983\">1983</option>\r\n");
      out.write("<option value=\"1984\">1984</option>\r\n");
      out.write("<option value=\"1985\">1985</option>\r\n");
      out.write("<option value=\"1986\">1986</option>\r\n");
      out.write("<option value=\"1987\">1987</option>\r\n");
      out.write("<option value=\"1988\">1988</option>\r\n");
      out.write("<option value=\"1989\">1989</option>\r\n");
      out.write("<option value=\"1990\">1990</option>\r\n");
      out.write("<option value=\"1991\">1991</option>\r\n");
      out.write("<option value=\"1992\">1992</option>\r\n");
      out.write("<option value=\"1993\">1993</option>\r\n");
      out.write("<option value=\"1994\">1994</option>\r\n");
      out.write("<option value=\"1995\">1995</option>\r\n");
      out.write("<option value=\"1996\">1996</option>\r\n");
      out.write("<option value=\"1997\">1997</option>\r\n");
      out.write("<option value=\"1998\">1998</option>\r\n");
      out.write("<option value=\"1999\">1999</option>\r\n");
      out.write("<option value=\"2000\">2000</option>\r\n");
      out.write("<option value=\"2001\">2001</option>\r\n");
      out.write("<option value=\"2002\">2002</option>\r\n");
      out.write("<option value=\"2003\">2003</option>\r\n");
      out.write("<option value=\"2004\">2004</option>\r\n");
      out.write("<option value=\"2005\">2005</option>\r\n");
      out.write("<option value=\"2006\">2006</option>\r\n");
      out.write("<option value=\"2007\">2007</option>\r\n");
      out.write("<option value=\"2008\">2008</option>\r\n");
      out.write("<option value=\"2009\">2009</option>\r\n");
      out.write("<option value=\"2010\">2010</option>\r\n");
      out.write("<option value=\"2011\">2011</option>\r\n");
      out.write("<option value=\"2012\">2012</option>\r\n");
      out.write("<option value=\"2013\">2013</option>\r\n");
      out.write("</select>\r\n");
      out.write("                    </div><br>\r\n");
      out.write("                     <label>Gender : </label><label class=\"radio-inline\">\r\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"M\" id=male />Male\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"radio-inline\">\r\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"F\" id=female />Female\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("              <span class=\"help-block\">By clicking Create my account,you agree to our Terms and <br>that you have read our Data Use Policy, including our Cookie Use.</span>\r\n");
      out.write("                   <br> <br><button class=\"btn btn-lg btn-primary btn-block signup-btn\" type=\"submit\">\r\n");
      out.write("                        Create my account</button>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer id=\"footer\" class=\"clearfix\">\r\n");
      out.write("      <div id=\"footer-widgets\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer-wrapper\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("              <div id=\"meta-3\" class=\"widget widgetFooter widget_meta\">\r\n");
      out.write("              <h4 class=\"widgettitle\">Importent Page :</h4>\r\n");
      out.write("              <ul>\r\n");
      out.write("    \t\t  <li><a href=\"#\"><i class=\"fa fa-home fa-fw\"></i> Home</a></li>\r\n");
      out.write("\t\t\t  <li><a href=\"privacypolicy.php\"><i class=\"fa fa-link\"></i>&nbsp;&nbsp; Privacy Policy</a></li>\r\n");
      out.write("\t\t\t  <li><a href=\"#\"><i class=\"fa fa-envelope fa-fw\"></i> Contact Us</a></li>\r\n");
      out.write("             </ul>\r\n");
      out.write("</div>      </div> <!-- end widget1 -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-6 col-md-2\">\r\n");
      out.write("              \t\t<div id=\"recent-posts-3\" class=\"widget widgetFooter widget_recent_entries\">\r\n");
      out.write("                    <h4 class=\"widgettitle\">Our social media :</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t     <a href=\"https://www.facebook.com/mr.dauod\" target=\"_blank\"><i class=\"fa fa-facebook\"></i> Facebook</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t      <a href=\"https://www.twitter.com/ayatquranCom\" target=\"_blank\"><i class=\"fa fa-twitter\"></i> Twitter</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t      <a href=\"http://www.youtube.com/user/sonsofye\" target=\"_blank\"><i class=\"fa fa-youtube\"></i> Youtube</a>\r\n");
      out.write("\t\t\t\t   </li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t</div>            </div> <!-- end widget1 -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("              <div id=\"meta-4\" class=\"widget widgetFooter widget_meta\">\r\n");
      out.write("              <h4 class=\"widgettitle\">Subscribe :</h4>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <span class=\"input-group-addon\">E-mail :</span>\r\n");
      out.write("                  <input class=\"form-control\" placeholder=\"Write your email ..\" type=\"text\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <span class=\"input-group-addon\">Phone  :</span>\r\n");
      out.write("                  <input class=\"form-control\" placeholder=\"+96777000000\" type=\"text\">\r\n");
      out.write("                   <span class=\"input-group-btn\">\r\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"button\">Subscribe !</button>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("             </div> <!-- end widget1 -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("              <div id=\"search-3\" class=\"widget widgetFooter widget_search\"><h4 class=\"widgettitle\">Search in Faploo :</h4>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">Write what you want to search for it  :</label>\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                  <span class=\"input-group-addon\">Keyword :</span>\r\n");
      out.write("                                  <input class=\"form-control\" placeholder=\"Keyword for search ...\" type=\"text\">\r\n");
      out.write("                                   <span class=\"input-group-btn\">\r\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">Search !</button>\r\n");
      out.write("                                  </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("\r\n");
      out.write("                </div>            </div> <!-- end widget1 -->\r\n");
      out.write("\r\n");
      out.write("          </div> <!-- end .row -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end #footer-wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end .container -->\r\n");
      out.write("      </div> <!-- end #footer-widgets -->\r\n");
      out.write("\r\n");
      out.write("      <div id=\"sub-floor\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 copyright\">\r\n");
      out.write("             Copy right for Faploo © 2015\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4 attribution\">\r\n");
      out.write("             Developer by  <a target=\"_blank\" href=\"#\">Faploo team</a> .\r\n");
      out.write("            </div>\r\n");
      out.write("          </div> <!-- end .row -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
