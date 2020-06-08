<%@page import="util.Upload"%>
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
            Upload upload = new Upload();
            upload.setFolderUpload("fotos");
            if (upload.formProcess(getServletContext(), request)) {
                try{
                    Livro pro = new Livro();
                    LivroDAO prd = new LivroDAO();
                    if (upload.getForm().get("titulo").equals("") || upload.getForm().get("autor").equals("") || upload.getForm().get("ano").equals("") || upload.getForm().get("idEditora").equals("")) {
                        response.sendRedirect("gerenciamento.jsp");
                    } else {
                        pro.setTitulo(upload.getForm().get("titulo").toString());
                        pro.setAutor(upload.getForm().get("autor").toString());
                        pro.setAno(Integer.parseInt(upload.getForm().get("ano").toString()));
                        pro.setPreco(Double.parseDouble(upload.getForm().get("preco").toString()));
                        pro.setIdEditora(Integer.parseInt(upload.getForm().get("idEditora").toString()));
                        pro.setFoto(upload.getFiles().get((upload.getFiles().size()-1)));
                        prd.alterar(pro);
                        response.sendRedirect("listalivrosedicao.jsp");
                    }
                }catch(Exception erro){
                    throw new RuntimeException("Erro 9: "+erro);
                }
            }
        %>
    </body>
</html>
