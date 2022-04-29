/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import model.UserRegistrationAuthentication;

/**
 *
 * @author Kanhaiyalal
 */
@WebServlet(name = "UserRegister", urlPatterns = {"/UserRegister"})
public class UserRegister extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String id=request.getParameter("id");
        String role=request.getParameter("role");
        String address=request.getParameter("address");
        
        UserRegistrationAuthentication ra=new UserRegistrationAuthentication();
        boolean register = ra.isRegister(name,password,id,role,address);
        
        if(register)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("name",name);
            System.out.println("Successfully updated");
            
            //response.sendRedirect("login.html");
        }
        
    }
            
            
    
    
}
