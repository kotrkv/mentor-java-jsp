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

@WebServlet("edit")
public class UpdateUserServlet extends HttpServlet {

    private Repository<User> userRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userRepository = new UsersRepositoryInMemory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        LocalDate birthday = LocalDate.parse(req.getParameter("birthday"));
        User user = new User(name, password, birthday);
        req.setAttribute("user", user);
        req.getRequestDispatcher("updateUser.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        LocalDate birthday = LocalDate.parse(req.getParameter("birthday"));
        userRepository.update(new User(name, password, birthday));
        resp.sendRedirect("/users");
    }
}
