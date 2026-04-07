package controller;

import java.io.IOException;

import dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String societyName = request.getParameter("societyName");
        String societyToken = request.getParameter("societyToken");
        String address = request.getParameter("address");
        String role = request.getParameter("role");

        User user = new User();
        user.setFullName(fullName);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        user.setSocietyName(societyName);
        user.setSocietyToken(societyToken);
        user.setAddress(address);
        user.setRole(role);

        UserDAO dao = new UserDAO();

        if (dao.registerUser(user)) {
            response.sendRedirect("jsp/login.jsp");
        } else {
            response.getWriter().println("Registration Failed");
        }
    }
}