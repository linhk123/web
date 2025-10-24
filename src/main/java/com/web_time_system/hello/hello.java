package com.web_time_system.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="hello", value = "/login")

public class hello extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)) {
            out.println("<h1> Welcome"+username+"to website </h1>");
        }else {
            out.println("<h1> Login error </h1>");
        }
        out.println("</html>");
    }
}
