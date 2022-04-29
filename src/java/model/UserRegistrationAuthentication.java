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
public class UserRegistrationAuthentication {

    
     public boolean isRegister(String name,String password,String id,String role,String address)
    {
        Connection con=null;
        try
        {
            

            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
            
            PreparedStatement pst=con.prepareStatement("insert into user values(?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,password);
            pst.setString(3,id);
            pst.setString(4,role);
            pst.setString(5,address);
           
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
    
