package com.web_time_system.tu_dien;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="tu_dien", urlPatterns = "/tu_dien")
public class Tu_dien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tu_dien.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> dien=new HashMap<>();
        dien.put("hello","xin chao");
        dien.put("how", "Thế nào");
        dien.put("book", "Quyển vở");
        dien.put("computer", "Máy tính");
        String search=req.getParameter("txtSearch");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        String result=dien.get(search);
        if(result!=null){
            out.println("Word: "+search);
            out.println("Result: "+result);
        }else {
            out.println("Not found ");
        }
        out.println("</html>");
    }
}
