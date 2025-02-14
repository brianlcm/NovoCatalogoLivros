<%@page import="dao.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.LivroDAO"%>
<%@page import="org.mypackage.catalogo.Livro"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <h2>Pesquisar livros</h2>
        <form action="resultadoPesquisa.jsp" method="post">
            <label>Título: </label><br/>
            <input type="text" name="titulo"/>
            <button type="submit">
                Pesquisar
            </button>
        </form>
        
            <h2>Lista de livros</h2>
            <%
            try{
                out.print("<table border='1'>");
                out.print("<tr>");
                out.print("<th>Capa</th><th>ID</th><th>Título</th><th>Autor(a)</th><th>Ano</th><th>Preço</th><th>ID da Editora</th>");
                out.print("</tr>");
                LivroDAO prd = new LivroDAO();
                ArrayList<Livro> lista =  prd.listarTodos();
                for(int num = 0; num < lista.size();num++){
                    out.print("<tr style=\"text-align: center\">");
                    out.print("<td style=\"text-align: center\"><img src='fotos/"+lista.get(num).getFoto()+"'width='80px' height='100px'/> </td>");
                    out.print("<td style=\"text-align: center\">"+lista.get(num).getId()+"</td>");
                    out.print("<td style=\"text-align: center\">"+lista.get(num).getTitulo()+"</td>");
                    out.print("<td style=\"text-align: center\">"+lista.get(num).getAutor()+"</td>");
                    out.print("<td style=\"text-align: center\">"+lista.get(num).getAno()+"</td>");
                    out.print("<td style=\"text-align: center\">"+ "R$ "+lista.get(num).getPreco()+"</td>");
                    out.print("<td style=\"text-align: center\">"+lista.get(num).getIdEditora()+"</td>");
                    out.print("<tr>");
                }
                out.print("</table>");
            }catch(Exception erro){
                throw new RuntimeException("Erro 12: "+erro);
            }
        %>
        
        <h2>Gerenciamento</h2>
        <form action="verificausuario.jsp" method="post">
            <label>Nome:</label><br/>
            <input type="text" name="nome" /><br/>
            
            <label>Senha:</label><br/>
            <input type="password" name="senha" /><br/><br/>

            <button type="submit">
                <b>Entrar</b>
            </button>
        </form>
    </body>
</html>
