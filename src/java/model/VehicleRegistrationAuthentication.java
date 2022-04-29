/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kanhaiyalal
 */
public class VehicleRegistrationAuthentication 
{
    public boolean isRegister(String ownerName,String numberPlate,String chessis,String vehicleType,String capacity,String cc,String color,String manufactureYear,String model,String companyName,String validity,String licenceNo,String registrationNumber,String email)
    {
        Connection con=null;
        try
        {
            

            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
            
            PreparedStatement pst=con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,ownerName);
            pst.setString(2,numberPlate);
            pst.setString(3,chessis);
            pst.setString(4,vehicleType);
            pst.setString(5,capacity);
            pst.setString(6,cc);
            pst.setString(7,color);
            pst.setString(8,manufactureYear);
            pst.setString(9,model);
            pst.setString(10,companyName);
            pst.setString(11,validity);
            pst.setString(12,licenceNo);
            pst.setString(13,registrationNumber);
            pst.setString(14,email);
           
            pst.executeUpdate();
            
//            if(rs.next())
//            {
//                return true;
//            }
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
        
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return false;
    }

}
