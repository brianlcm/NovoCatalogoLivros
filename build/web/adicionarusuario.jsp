<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Adicionar Usuário</h1>
        <form action="executaadicionarusuario.jsp" method="post">
            <label>Nome</label><br/>
            <input type="text" name="nome" /><br/>
            
            <label>Senha</label><br/>
            <input type="password" name="senha" /><br/><br/>
            
            <button type="submit">
                <b>Confirmar</b>
            </button>
        </form>
    </body>
</html>
