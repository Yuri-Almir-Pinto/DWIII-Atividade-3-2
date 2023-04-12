package com.example.atividade32.dwiiiatividade32;

import com.example.atividade32.dwiiiatividade32.model.ResponseLogin;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    static boolean isLogged = false;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("input_login");
        String senha = request.getParameter("input_senha");

        if (login.contentEquals("admin") && senha.contentEquals("admin")) {
            ResponseLogin.loggedSuccess = true;
            isLogged = true;
            response.sendRedirect("http://localhost:8080/DWIII_Atividade_3_2_war_exploded/OutraServlet");
        }
        else {
            ResponseLogin.loggedSuccess = false;
            response.sendRedirect("http://localhost:8080/DWIII_Atividade_3_2_war_exploded/");
        }
    }
}
