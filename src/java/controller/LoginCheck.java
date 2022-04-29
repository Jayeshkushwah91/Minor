package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserAuth;

/**
 *
 * @author mv
 */
@WebServlet(name = "LoginCheck", urlPatterns = {"/LoginCheck"})
public class LoginCheck extends HttpServlet {


    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        boolean isLogin = UserAuth.checkLogin(username,password);
        
        if (isLogin) {
            
            if (UserAuth.isAdmin(username, password)) {
                response.sendRedirect(request.getContextPath()+"/admin.html");
            } else {
            response.sendRedirect(request.getContextPath()+"/User2.jsp");
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}