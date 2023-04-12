<%@ page import="com.example.atividade32.dwiiiatividade32.LoginServlet" %>
<%@ page import="com.example.atividade32.dwiiiatividade32.model.ResponseLogin" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <p>Usuário: <input type="text" name="input_login"></p>
            <p>Senha: <input type="text" name="input_senha"></p>
            <input type="submit" value="Entrar">
        </form>
        <% String error = "<p style='color:red'>Erro: Login ou senha incorretos.</p>"; %>
        <% if (ResponseLogin.loggedSuccess == false){%>
        <%= error %>
        <% } %>


    </body>
</html>