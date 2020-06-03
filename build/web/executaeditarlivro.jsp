<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.mypackage.catalogo.Livro"%>
<%@page import="dao.LivroDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                Livro pro = new Livro();
                LivroDAO prd = new LivroDAO();
                if(request.getParameter("titulo").equals("") || request.getParameter("autor").equals("") || request.getParameter("ano").equals("") || request.getParameter("preco").equals("") || request.getParameter("foto").equals("") || request.getParameter("id").equals("")){
                    response.sendRedirect("gerenciamento.jsp");
                }else{
                    pro.setTitulo(request.getParameter("titulo"));
                    pro.setAutor(request.getParameter("autor"));
                    pro.setAno(Integer.parseInt(request.getParameter("ano")));
                    pro.setPreco(Double.parseDouble(request.getParameter("preco")));
                    pro.setFoto(request.getParameter("foto"));
                    pro.setId(Integer.parseInt(request.getParameter("id")));
                    prd.alterar(pro);
                    response.sendRedirect("listalivrosedicao.jsp");
                }
            }catch(Exception erro){
                throw new RuntimeException("Erro 9: "+erro);
            }
        %>
    </body>
</html>
