package com.proj.Servlets;

import java.io.IOException;
import java.sql.Timestamp;

import com.proj.DOAImp.UsersDOAImp;
import com.proj.models.Users;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginPage")
public class LoginServlet extends HttpServlet {

    Users user;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        UsersDOAImp udi = new UsersDOAImp();

        String method = req.getParameter("method");

        if (method.equalsIgnoreCase("signIn")) {

            String email = req.getParameter("Semail");
            String pass = req.getParameter("Spassword");

            user = udi.getUserByemail(email);

            if (user == null || !user.getPassword().equalsIgnoreCase(pass)) {
                session.setAttribute("error", "yes");
                RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
                rd.forward(req, resp);
                return;
            }

            // Valid login
            session.removeAttribute("error");
            session.setAttribute("user", user);
            RequestDispatcher rd = req.getRequestDispatcher("HomeServlet");
            rd.forward(req, resp);
        }

        else if (method.equalsIgnoreCase("Register")) {

            String userName = req.getParameter("RuserName");
            String email = req.getParameter("Remail");
            String pass = req.getParameter("Rpassword");
            String phNo = req.getParameter("RphoneNumber");
            String address = req.getParameter("Raddress");
            String role = req.getParameter("Rrole");

            user = new Users(userName,pass, email, phNo, address, role,
                    new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()));

            int res = udi.addUsers(user);
            session.setAttribute("user", user);

            if (res == 1) {
                RequestDispatcher rd = req.getRequestDispatcher("HomeServlet");
                rd.forward(req, resp);
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
                rd.forward(req, resp);
            }
        }
    }
}
