package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adicionarlivro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Adicionar Livro</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Adicionar Livro</h1>\r\n");
      out.write("        <form action=\"executaadicionarlivro.jsp\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            \r\n");
      out.write("            <label>Título:</label><br/>\r\n");
      out.write("            <input type=\"text\" name=\"titulo\" /><br/>\r\n");
      out.write("\r\n");
      out.write("            <label>Autor(a):</label><br/>\r\n");
      out.write("            <input type=\"text\" name=\"autor\" /><br/>\r\n");
      out.write("\r\n");
      out.write("            <label>Ano:</label><br/>\r\n");
      out.write("            <input type=\"number\" name=\"ano\" /><br/>\r\n");
      out.write("\r\n");
      out.write("            <label>Preço:</label><br/>\r\n");
      out.write("            <input type=\"number\" name=\"preco\" /><br/>\r\n");
      out.write("            \r\n");
      out.write("            <label>ID da Editora:</label><br/>\r\n");
      out.write("            <input type=\"number\" name=\"idEditora\" /><br/>\r\n");
      out.write("\r\n");
      out.write("            <label>Foto da Capa:</label><br/>\r\n");
      out.write("            <input type=\"file\" name=\"foto\" /><br/><br/>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\">\r\n");
      out.write("                <b>Confirmar</b>\r\n");
      out.write("            </button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
