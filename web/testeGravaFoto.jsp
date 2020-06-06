<%@ page language="java" import="org.apache.commons.fileupload.*, java.util.*, java.sql.*" %>
<html>
<body bgcolor="#FFFFFF">
<%
    // Verificando se o form possui campo(s) com dados bin�rios
    if (FileUpload.isMultipartContent(request)) {
    // criando o objeto para cuidar do upload
    DiskFileUpload fu = new DiskFileUpload();
    // setando o tamanho maximo em bytes para upload
    fu.setSizeMax(800000);
    try {
        // parseando a requisi��o e retornando uma lista com os campos
        // encontrando, tanto textos, quanto dados bin�rios (arquivos bin�rios)
        List items = fu.parseRequest(request);
        Iterator i = items.iterator();
        FileItem fi;
        String cmt=null;
        // la�o para pegar todos os campos do form
        while (i.hasNext()) {
            fi = (FileItem)i.next();
            // teste para ver se o campo em quest�o � campo do formulario
            // ou um arquivo
            if (fi.isFormField()) {
                // pegando o valor do campo do formul�rio (coment�rio)
                cmt = fi.getString();
            }
            else{
                // obtendo o tamanho da foto
                int size = (int) fi.getSize();
                // array de byte para armazenar a foto
                byte [] imagem = new byte[size];
                // carregando a foto no array
                upload.read(imagem, 0, size);
                // chamado o m�todo est�tico para conectar com o banco
                Connection con = MyConnection.createConnection("bolao");
                // onde tem ???, ser� substitu�do por valores posteriormente.
                PreparedStatement pstm = con.prepareStatement("INSERT INTO
                foto (comentario, foto) VALUES (?, ?)");
                // inserindo o coment�rio no lugar da primeira interroga��o
                pstm.setString(1, cmt);
                // inserindo a foto no lugar da segunda interroga��o
                pstm.setBytes(2, imagem);
                // executando a query
                pstm.executeUpdate();
            }
        }
    } catch (FileUploadException e) {
        out.print(?Erro no upload do arquivo?);
    } catch (SQLException e) {
        out.print(?Erro na consulta com o banco de dados?);
    } catch (Exception e) {
        out.print(e.getMessage());
    }else {
        out.print(?O Formulario nao possui dados bin�rios?)
    }
} %>
<h2>Fonto inserida com sucesso no banco de dados!</h2>
</body>
</html>


