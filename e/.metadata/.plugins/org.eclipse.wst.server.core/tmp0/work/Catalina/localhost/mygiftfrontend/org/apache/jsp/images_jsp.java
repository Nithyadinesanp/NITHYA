/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.6
 * Generated at: 2016-12-13 08:56:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class images_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write(" <title>Bootstrap Example</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".loader {\r\n");
      out.write("  border: 16px solid #f3f3f3;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  border-top: 16px solid #B3B6B7;\r\n");
      out.write("  width: 50px;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  -webkit-animation: spin 2s linear infinite;\r\n");
      out.write("  animation: spin 2s linear infinite;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes spin {\r\n");
      out.write("  0% { -webkit-transform: rotate(0deg); }\r\n");
      out.write("  100% { -webkit-transform: rotate(360deg); }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes spin {\r\n");
      out.write("  0% { transform: rotate(0deg); }\r\n");
      out.write("  100% { transform: rotate(360deg); }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".bgimg\r\n");
      out.write("{\r\n");
      out.write("background-image:url(\"resources/images/images.jpg\");\r\n");
      out.write("}\r\n");
      out.write("body\r\n");
      out.write("{ \r\n");
      out.write("    background:url(\"resources/images/back.jpg\");\r\n");
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
      out.write("    .glyphicon { margin-right:5px; }\r\n");
      out.write(".thumbnail\r\n");
      out.write("{\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    padding: 0px;\r\n");
      out.write("    -webkit-border-radius: 0px;\r\n");
      out.write("    -moz-border-radius: 0px;\r\n");
      out.write("    border-radius: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item.list-group-item\r\n");
      out.write("{\r\n");
      out.write("    float: none;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".item.list-group-item:nth-of-type(odd):hover,.item.list-group-item:hover\r\n");
      out.write("{\r\n");
      out.write("    background: #428bca;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item.list-group-item .list-group-image\r\n");
      out.write("{\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write(".item.list-group-item .thumbnail\r\n");
      out.write("{\r\n");
      out.write("    margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".item.list-group-item .caption\r\n");
      out.write("{\r\n");
      out.write("    padding: 9px 9px 0px 9px;\r\n");
      out.write("}\r\n");
      out.write(".item.list-group-item:nth-of-type(odd)\r\n");
      out.write("{\r\n");
      out.write("    background: #eeeeee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item.list-group-item:before, .item.list-group-item:after\r\n");
      out.write("{\r\n");
      out.write("    display: table;\r\n");
      out.write("    content: \" \";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item.list-group-item img\r\n");
      out.write("{\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write(".item.list-group-item:after\r\n");
      out.write("{\r\n");
      out.write("    clear: both;\r\n");
      out.write("}\r\n");
      out.write(".list-group-item-text\r\n");
      out.write("{\r\n");
      out.write("    margin: 0 0 11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"bgimg\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("              \t<i class=\"fa fa-gift\" style=\"font-size:80px;color:orange;\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t<h1 style=\"color:orange\";font-size=\"50\";>GIFTS GALORE</h1>\r\n");
      out.write("\t\t<p><font size=\"5\">THRISSUR</font></p></center>\r\n");
      out.write("\t\t</div><br>\r\n");
      out.write("\t\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"btn-group btn-group-justified\">\r\n");
      out.write("    <a href=\"bootstrap[1].html\" class=\"btn btn-warning\"><i class=\"fa fa-home\" aria-hidden=\"true\"> Home</i></a>\r\n");
      out.write("    <a href=\"images.html\" class=\"btn btn-warning\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"> Image</i></a>\r\n");
      out.write("    <a href=\"prodectlist.html\" class=\"btn btn-warning\"><i class=\"fa fa-product-hunt\" aria-hidden=\"true\"> Prodect</i></a>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-warning\"><span class=\"glyphicon glyphicon-earphone\"> Contact</span></a>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-warning\">About us</a>\r\n");
      out.write("    <a href=\"Log.html\" class=\"btn btn-warning\"><span class=\"glyphicon glyphicon-log-in\"> Login</span></a>\r\n");
      out.write("    <a href=\"Reg.html\" class=\"btn btn-warning\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"> Register</i></a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div></div>\r\n");
      out.write("</div><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("<center>  <table >\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Appealing_Birthday_Photo_Mug_WMBDY003_1_45b31770.jpg\">\r\n");
      out.write("<img src=\"resources/images/Appealing_Birthday_Photo_Mug_WMBDY003_1_45b31770.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/bgb.jpg\">\r\n");
      out.write("<img src=\"resources/images/bgb.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/Birthday_Personalised_Black_Mug_BLACKMUG4_0_6625582d.jpg\">\r\n");
      out.write("<img src=\"resources/images/Birthday_Personalised_Black_Mug_BLACKMUG4_0_6625582d.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Christmas_Tree_For_You_XMN00681_12e7328d.jpg\">\r\n");
      out.write("<img src=\"resources/images/Christmas_Tree_For_You_XMN00681_12e7328d.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/Crowing_Shell_Bracelet_JEWBR1627_1190d7e6.jpg\">\r\n");
      out.write("<img src=\"resources/images/Crowing_Shell_Bracelet_JEWBR1627_1190d7e6.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/Dad_Personalised_Photo_Stone__RSLRGDAD002_47b51f35.jpg\">\r\n");
      out.write("<img src=\"resources/images/Dad_Personalised_Photo_Stone__RSLRGDAD002_47b51f35.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Dolphin__Stars_Twin_Chain_Anklet_JEWANK16_7ed4a753.jpg\">\r\n");
      out.write("<img src=\"resources/images/Dolphin__Stars_Twin_Chain_Anklet_JEWANK16_7ed4a753.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/Golden_Tout_Bangle_set_JEWBNGL08_4b3aa58c.jpg\">\r\n");
      out.write("<img src=\"resources/images/Golden_Tout_Bangle_set_JEWBNGL08_4b3aa58c.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/Love_You_Always_Personalised_Canvas_Cushion_CC16004_0_0b71b550.jpg\">\r\n");
      out.write("<img src=\"resources/images/Love_You_Always_Personalised_Canvas_Cushion_CC16004_0_0b71b550.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Love_You_So_Much_Personalised_Granite_Stone_RSLRGVAL01_3b03588c.jpg\">\r\n");
      out.write("<img src=\"resources/images/Love_You_So_Much_Personalised_Granite_Stone_RSLRGVAL01_3b03588c.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/My_Brother_My_Friend_Personalised_Frame_TF6x6BRO005_0_1861755c.jpg\">\r\n");
      out.write("<img src=\"resources/images/My_Brother_My_Friend_Personalised_Frame_TF6x6BRO005_0_1861755c.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/Personalised_Birthday_Mug_BLACKMUG2_0_e38c1023.jpg\">\r\n");
      out.write("<img src=\"resources/images/Personalised_Birthday_Mug_BLACKMUG2_0_e38c1023.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Personalised_Black_Alphabet_Mug_890708902498401_0_1d867db0.jpg\">\r\n");
      out.write("<img src=\"resources/images/Personalised_Black_Alphabet_Mug_890708902498401_0_1d867db0.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/Smileys_New_Year_Greeting_Card_8907089215009_8641f523.jpg\">\r\n");
      out.write("<img src=\"resources/images/Smileys_New_Year_Greeting_Card_8907089215009_8641f523.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/Stylish_Love_Themed_Personalised_Tile_Frame_890708900024598_1abd6967.jpg\">\r\n");
      out.write("<img src=\"resources/images/Stylish_Love_Themed_Personalised_Tile_Frame_890708900024598_1abd6967.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/The_Girl_I_Love_Personalised_Mug_FLMUG004A_fe0e25e0.jpg\">\r\n");
      out.write("<img src=\"resources/images/The_Girl_I_Love_Personalised_Mug_FLMUG004A_fe0e25e0.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/Trendy_Wallet__Birthday_Card_Hamper_BDY1677_0_bb9eeb9d.jpg\">\r\n");
      out.write("<img src=\"resources/images/Trendy_Wallet__Birthday_Card_Hamper_BDY1677_0_bb9eeb9d.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/We_Belong_Together_Hamper_ANN1622_b995ea68.jpg\">\r\n");
      out.write("<img src=\"resources/images/We_Belong_Together_Hamper_ANN1622_b995ea68.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("      <td height=\"197\" colspan=\"4\">\r\n");
      out.write("<a href=\"resources/images/Wedding_Day_Personalised_Stone_Quotation_SCSTONE004_0_c941b1ea.jpg\">\r\n");
      out.write("<img src=\"resources/images/Wedding_Day_Personalised_Stone_Quotation_SCSTONE004_0_c941b1ea.jpg\" width=\"317\" height=\"187\" /></a>\r\n");
      out.write("<a href=\"resources/images/You_Are_Perfect_Personalised_Canvas_Cushion_CC16003_0_1fa48db8.jpg\">\r\n");
      out.write("<img src=\"resources/images/You_Are_Perfect_Personalised_Canvas_Cushion_CC16003_0_1fa48db8.jpg\" width=\"317\" height=\"187\"  /></a>\r\n");
      out.write("<a href=\"resources/images/You_Are_Special_To_Me_Personalised_Tile_Frame_RSLRG1_39d85b4b.jpg\">\r\n");
      out.write("<img src=\"resources/images/You_Are_Special_To_Me_Personalised_Tile_Frame_RSLRG1_39d85b4b.jpg\" width=\"317\" height=\"187\" /></a> \r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"197\" colspan=\"4\">\r\n");
      out.write("<center><a href=\"error\"><div class=\"loader\"></div></a></center>\r\n");
      out.write("<td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>  </table>\r\n");
      out.write("</form>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
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
