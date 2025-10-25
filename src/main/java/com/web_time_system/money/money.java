package com.web_time_system.money;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="money",urlPatterns = "/convert")
public class money extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("money.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html;charset=UTF-8");
            float rate = Float.parseFloat(req.getParameter("rate"));
            float usd = Float.parseFloat(req.getParameter("usd"));
            float vnd = rate * usd;

            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<h1>Rate: " + rate + "</h1>");
            out.println("<h1>USD: " + usd + "</h1>");
            out.println("<h1>VND: " + vnd + "</h1>");
            out.println("</html>");
    }
}
