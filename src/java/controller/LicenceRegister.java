/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LicenceRegistrationAuthentication;
import model.UserRegistrationAuthentication;

/**
 *
 * @author Kanhaiyalal
 */
@WebServlet(name = "LicenceRegister", urlPatterns = {"/LicenceRegister"})
public class LicenceRegister extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String name=request.getParameter("name");
        String dob=request.getParameter("dob");
        String issue=request.getParameter("issue");
        String validity=request.getParameter("validity");
        String address=request.getParameter("address");
        String type=request.getParameter("type");
        String email=request.getParameter("email");
        String contact=request.getParameter("contact");
        String gender=request.getParameter("gender");
        String licenceNo=request.getParameter("licenceNo");
        
        LicenceRegistrationAuthentication ra=new LicenceRegistrationAuthentication();
        boolean register = ra.isRegister(name,dob,issue,validity,address,type,email,contact,gender,licenceNo);
        
        if(register)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("name",name);
            System.out.println("Successfully updated");
            
            //response.sendRedirect("login.html");
        }
        
    }
    
}
