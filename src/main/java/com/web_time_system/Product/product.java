package com.web_time_system.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="product", urlPatterns="/display-discount")
public class product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String product = req.getParameter("product");
        float price = Float.parseFloat(req.getParameter("price"));
        float percent = Float.parseFloat(req.getParameter("percent"));

        float discountAmount = price * percent * 0.01f;
        float discountPrice = price - discountAmount;

        req.setAttribute("product", product);
        req.setAttribute("price", price);
        req.setAttribute("percent", percent);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);

        RequestDispatcher rd = req.getRequestDispatcher("/webapp/display_discount.jsp");
        rd.forward(req, resp);
    }
}
