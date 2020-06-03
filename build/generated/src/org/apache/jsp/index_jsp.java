package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UsuarioDAO;
import dao.LivroDAO;
import org.mypackage.catalogo.Livro;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Página Inicial</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Pesquisar livros</h2>\n");
      out.write("        <form action=\"index.jsp\" method=\"post\">\n");
      out.write("            <label>Título: </label><br/>\n");
      out.write("            <input type=\"text\" name=\"titulo\"/><br/><br/>\n");
      out.write("            <button type=\"submit\">\n");
      out.write("                Pesquisar\n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("            <h2>Lista de livros</h2>\n");
      out.write("            \n");
      out.write("            ");

            try{
                out.print("<table border='1'>");
                out.print("<tr>");
                out.print("<th>Capa</th><th>ID</th><th>Título</th><th>Autor(a)</th><th>Ano</th><th>Preço</th><th>ID da Editora</th>");
                out.print("</tr>");
                LivroDAO prd = new LivroDAO();
                if(request.getParameter("titulo")=="" || request.getParameter("titulo")==null){
                    ArrayList<Livro> lista =  prd.listarTodos();
                    for(int num = 0; num < lista.size();num++){
                        out.print("<tr>");
                        out.print("<td>"+lista.get(num).getFoto()+"</td>");
                        out.print("<td>"+lista.get(num).getId()+"</td>");
                        out.print("<td>"+lista.get(num).getTitulo()+"</td>");
                        out.print("<td>"+lista.get(num).getAutor()+"</td>");
                        out.print("<td>"+lista.get(num).getAno()+"</td>");
                        out.print("<td>"+lista.get(num).getPreco()+"</td>");
                        out.print("<td>"+lista.get(num).getIdEditora()+"</td>");
                        out.print("<tr>");
                    }
                }else{
                    ArrayList<Livro> lista =  prd.listarTodosTitutlo(request.getParameter("titulo"));
                    for(int num = 0; num < lista.size();num++){
                        out.print("<tr>");
                        out.print("<td>"+lista.get(num).getFoto()+"</td>");
                        out.print("<td>"+lista.get(num).getId()+"</td>");
                        out.print("<td>"+lista.get(num).getTitulo()+"</td>");
                        out.print("<td>"+lista.get(num).getAutor()+"</td>");
                        out.print("<td>"+lista.get(num).getAno()+"</td>");
                        out.print("<td>"+lista.get(num).getPreco()+"</td>");
                        out.print("<td>"+lista.get(num).getIdEditora()+"</td>");
                        out.print("<tr>");
                    }
                }
                out.print("</table>");
            }catch(Exception erro){
                throw new RuntimeException("Erro 12: "+erro);
            }
        
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h2>Administrar Catálogo</h2>\n");
      out.write("        <form action=\"verifica_usuario.jsp\" method=\"post\">\n");
      out.write("            <label>Nome:</label><br/>\n");
      out.write("            <input type=\"text\" name=\"nome\" /><br/>\n");
      out.write("            \n");
      out.write("            <label>Senha:</label><br/>\n");
      out.write("            <input type=\"password\" name=\"senha\" /><br/><br/>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">\n");
      out.write("                <b>Entrar</b>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
