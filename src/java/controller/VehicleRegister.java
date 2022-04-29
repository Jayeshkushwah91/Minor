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
import model.UserRegistrationAuthentication;
import model.VehicleRegistrationAuthentication;

/**
 *
 * @author Kanhaiyalal
 */
@WebServlet(name = "VehicleRegister", urlPatterns = {"/VehicleRegister"})
public class VehicleRegister extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String ownerName=request.getParameter("ownerName");
        String numberPlate=request.getParameter("numberPlate");
        String chessis=request.getParameter("chessis");
        String vehicleType=request.getParameter("vehicleType");
        String capacity=request.getParameter("capacity");
        String cc=request.getParameter("cc");
        String color=request.getParameter("color");
        String manufactureYear=request.getParameter("manufactureYear");
        String model=request.getParameter("model");
        String companyName=request.getParameter("companyName");
        String validity=request.getParameter("validity");
        String licenceNo=request.getParameter("licenceNo");
        String registrationNumber=request.getParameter("registrationNumber");
        String email=request.getParameter("email");
        
        
        VehicleRegistrationAuthentication ra=new VehicleRegistrationAuthentication();
        boolean register = ra.isRegister(ownerName,numberPlate,chessis,vehicleType,capacity,cc,color,manufactureYear,model,companyName,validity,licenceNo,registrationNumber,email);
        
        if(register)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("ownerName",ownerName);
            System.out.println("Successfully updated");
            
            //response.sendRedirect("login.html");
        }
        
    }
    
}
