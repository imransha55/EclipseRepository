package org.pro;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Session")
public class Session extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public Session() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        HttpSession session = request.getSession();
         
        PrintWriter writer = response.getWriter();
        writer.println("Session ID: " + session.getId());
        writer.println("Creation Time: " + new Date(session.getCreationTime()));
        writer. println("Last Accessed Time: " + new Date(session.getLastAccessedTime()));
    }
}