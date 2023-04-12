package com.example.atividade32.dwiiiatividade32;

import com.example.atividade32.dwiiiatividade32.model.ResponseLogin;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "OutraServlet", value = "/OutraServlet")
public class OutraServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (LoginServlet.isLogged == true) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("pagina.jsp");
            dispatcher.forward(request, response);
        }
        else if (LoginServlet.isLogged == false) {
            ResponseLogin.loggedSuccess = false;
            response.sendRedirect("http://localhost:8080/DWIII_Atividade_3_2_war_exploded/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
