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
public class LicenceRegistrationAuthentication 
{
    public boolean isRegister(String name,String dob,String issue,String validity,String address,String type,String email,String contact,String gender,String licenceNo)
    {
        Connection con=null;
        try
        {
            

            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
            
            PreparedStatement pst=con.prepareStatement("insert into licence values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,dob);
            pst.setString(3,issue);
            pst.setString(4,validity);
            pst.setString(5,address);
            pst.setString(6,type);
            pst.setString(7,email);
            pst.setString(8,contact);
            pst.setString(9,gender);
            pst.setString(10,licenceNo);
           
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
