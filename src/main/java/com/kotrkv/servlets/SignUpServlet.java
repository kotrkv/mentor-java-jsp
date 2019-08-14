package com.kotrkv.servlets;

import com.kotrkv.model.User;
import com.kotrkv.repositories.Repository;
import com.kotrkv.repositories.UsersRepositoryInMemory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/sign")
public class SignUpServlet extends HttpServlet {

    private Repository<User> userRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userRepository = new UsersRepositoryInMemory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> users = userRepository.findAll();

        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello from SingUpServlet</h1>");

        for (User user : users) {
            writer.write("<h2>" + user.getName() + " - " + user.getPassword() + "</h2></br>");
        }
    }
}