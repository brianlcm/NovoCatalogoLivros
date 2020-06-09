<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet">
        <title>Adicionar Editora</title>
    </head>
    <body>
        <h1>Adicionar Editora</h1>

        <form action="executaadicionaeditora.jsp" method="post">
            <label>Nome</label><br/>
            <input type="text" name="nome" /><br/>

            <label>Cidade:</label><br/>
            <input type="text" name="cidade" /><br/><br/>

            <button class="button" type="submit">
                <b>Confirmar</b>
            </button>
        </form>
    </body>
</html>
