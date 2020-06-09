package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.LivroDAO;
import org.mypackage.catalogo.Livro;
import java.util.ArrayList;

public final class listalivrosedicao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Editar Livros</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form class=\"tabelaPesquisa\" action=\"listalivrosedicao.jsp\" method=\"post\">\r\n");
      out.write("            <label>Título: </label><br/>\r\n");
      out.write("            <input type=\"text\" name=\"titulo\"/>\r\n");
      out.write("            <button class=\"button\" type=\"submit\">\r\n");
      out.write("                Pesquisar\r\n");
      out.write("            </button>\r\n");
      out.write("            <br/><br/>");

                try {
                    out.print("<table class='tabela' border='1'>");
                    out.print("<tr>");
                    out.print("<th>Capa</th><th>ID</th><th>Título</th><th>Autor(a)</th><th>Ano</th><th>Preço</th><th>ID da Editora</th><th>Editar</th>");
                    out.print("</tr>");
                    LivroDAO prd = new LivroDAO();
                    if (request.getParameter("titulo") == "" || request.getParameter("titulo") == null) {
                        ArrayList<Livro> lista = prd.listarTodos();
                        for (int num = 0; num < lista.size(); num++) {
                            out.print("<tr style=\"text-align: center\">");
                            out.print("<td style=\"text-align: center\"><img src='fotos/"+lista.get(num).getFoto()+"'width='80px' height='120px'/> </td>");
                            out.print("<td style=\"text-align: center\">" + lista.get(num).getId() + "</td>");
                            out.print("<td style=\"text-align: center\">" + lista.get(num).getTitulo() + "</td>");
                            out.print("<td style=\"text-align: center\">" + lista.get(num).getAutor() + "</td>");
                            out.print("<td style=\"text-align: center\">" + lista.get(num).getAno() + "</td>");
                            out.print("<td style=\"text-align: center\">" + "R$ " + lista.get(num).getPreco() + "</td>");
                            out.print("<td style=\"text-align: center\">" + lista.get(num).getIdEditora() + "</td>");
                            out.print("<td style=\"text-align: center\"><a href='editarlivro.jsp?titulo=" + lista.get(num).getTitulo() + "&autor=" + lista.get(num).getAutor() + "&ano=" + lista.get(num).getAno() + "&preco=" + lista.get(num).getPreco() + "&foto=" + lista.get(num).getFoto() + "&idEditora=" + lista.get(num).getIdEditora() + "&id=" + lista.get(num).getId()+" '> Editar</a></td>");
                            out.print("<tr>");
                        }
                    } else {
                        ArrayList<Livro> lista = prd.listarTodosTitutlo(request.getParameter("titulo"));
                        for (int num = 0; num < lista.size(); num++) {
                            out.print("<tr>");
                            out.print("<td>" + lista.get(num).getFoto() + "</td>");
                            out.print("<td>" + lista.get(num).getId() + "</td>");
                            out.print("<td>" + lista.get(num).getTitulo() + "</td>");
                            out.print("<td>" + lista.get(num).getAutor() + "</td>");
                            out.print("<td>" + lista.get(num).getAno() + "</td>");
                            out.print("<td>" + "R$ " + lista.get(num).getPreco() + "</td>");
                            out.print("<td>" + lista.get(num).getIdEditora() + "</td>");
                            out.print("<td><a href='editarlivro.jsp?titulo=" + lista.get(num).getTitulo() + "&autor=" + lista.get(num).getAutor() + "&ano=" + lista.get(num).getAno() + "&preco=" + lista.get(num).getPreco() + "&foto=" + lista.get(num).getFoto() + "&idEditora=" + lista.get(num).getIdEditora() + "&id=" + lista.get(num).getId()+" '> Editar</a></td>");
                            out.print("<tr>");
                        }
                    }
                    out.print("</table>");
                } catch (Exception erro) {
                    throw new RuntimeException("Erro 12: " + erro);
                }
            
      out.write("\r\n");
      out.write("            <br/>\r\n");
      out.write("            <b><a href=\"gerenciamento.jsp\">Voltar para a página de Gerenciamento</a></b>\r\n");
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
