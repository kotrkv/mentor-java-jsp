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
import java.time.LocalDate;

@WebServlet("/delete")
public class DeleteUserServlet extends HttpServlet {

    private Repository<User> userRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userRepository = new UsersRepositoryInMemory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.setAttribute("user", name);
        User user = new User("One", "passone", LocalDate.parse("1994-01-01"));
        userRepository.delete(user);
        resp.sendRedirect("/users");
        //req.getRequestDispatcher("/info.jsp").forward(req, resp);
        //resp.getWriter().write(req.getParameter("name"));
    }
}
