package com.kotrkv.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String val1 = req.getParameter("val1");
        String val2 = req.getParameter("val2");

        Integer result = Integer.parseInt(val1) + Integer.parseInt(val2);

        PrintWriter writer = resp.getWriter();
        writer.write("Result = " + result);
    }
}
