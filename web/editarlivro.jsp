<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet">
        <title>Editar Livros</title>
    </head>
    <body>
        <h1 class="titulo">Editar Livro</h1>
        <form class="tabelaFormulario" action="executaeditarlivro.jsp" method="post"  enctype="multipart/form-data">
            <label>Título:</label><br/>
            <input type="text" name="titulo" value="<%=request.getParameter("titulo")%>"/><br/>

            <label>Autor(a):</label><br/>
            <input type="text" name="autor" value="<%=request.getParameter("autor")%>"/><br/>

            <label>Ano:</label><br/>
            <input type="number" name="ano" value="<%=request.getParameter("ano")%>"/><br/>

            <label>Preço:</label><br/>
            <input type="number" name="preco" value="<%=request.getParameter("preco")%>"/><br/>
            

            <label>Nova foto:</label><br/>
            <input type="file" name="foto"/><br/>
            
            <label>Editora:</label><br/>
            <input type="text" name="foto" value="<%=request.getParameter("idEditora")%>"/><br/>

            <label>ID:</label><br/> 
            <input readonly=“true” type="number" name="id" value="<%=request.getParameter("id")%>"/><br/><br/>
            
            <button class="button" type="submit">
                <b>Salvar</b>
            </button>
        </form>
    </body>
</html>
