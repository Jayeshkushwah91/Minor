package model;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserAuth {
    
    public static boolean checkLogin(String username,String password) {
        
        try {
            PreparedStatement statement = InitDB.getConnection().prepareStatement("SELECT name FROM user WHERE password = ?");
        statement.setString(1,password);
        
        ResultSet rs = statement.executeQuery();
        
        while(rs.next()){
            System.out.println("result hai");
            if(rs.getString(1).equals(username)){
                return true;
            }
        }
        
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
        return false;
    }      
    
    public static boolean isAdmin(String username,String password){
                String role ;
        try {
            PreparedStatement statement = InitDB.getConnection().prepareStatement("SELECT role FROM user WHERE name=?");
        statement.setString(1,username);
        
        ResultSet rs = statement.executeQuery();
        
        while(rs.next()){
            System.out.println("result hai");
            role = rs.getString(1);
            System.out.println(role);
            if(role.equals("admin")){
                return true;
            }
        }
        
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
        
        return false;
    }
}