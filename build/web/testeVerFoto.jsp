<%@ page language="java" import="java.lang.*" %>
<%
    try {
        // criando a conexao com o banco de dados
        Connection con = MyConnection.createConnection("bolao");
        Statement stm = con.createStatement();
        int codigo;
        // pegando o codigo da foto a ser exibida
        if (request.getParameter("numero") == null)
        codigo = 1;
        else
        codigo = Integer.parseInt(request.getParameter("numero"));
        // procurando pela foto na tabela
        ResultSet rs = stm.executeQuery("SELECT * FROM foto WHERE codigo = "+codigo);
        if (rs.next()) {
        // pegando o conteudo do campo foto (BLOB, binario)
        Blob blob = rs.getBlob("foto");
        // Codificando para JPG e enviando para o browser, através do Output do servlet
        JPEGManager.encodeJPG(response.getOutputStream(), blob.getBytes(1, (int)
        blob.length()) );
    }catch (Exception e){
        // erro
        %>Erro encontrado<%
    }
%>