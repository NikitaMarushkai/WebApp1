package ru.kpfu.gdc.marushkai;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by unlim_000 on 29.02.2016.
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String message = username != null && !username.trim().equals("") ? "Hello " + username + "!" : "Hello";
        resp.setContentType("text/plain; charset=utf8");
        resp.getWriter().println(message);
    }

}
