package controller;

import dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAO();

        if (dao.loginUser(email, password)) {
        	response.sendRedirect(request.getContextPath() + "/jsp/dashboard.jsp");
        } else {
            response.getWriter().println("Invalid Email or Password");
        }
    }
}