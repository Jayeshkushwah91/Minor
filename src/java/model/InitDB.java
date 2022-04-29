package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mv
 */
public class InitDB {
    private static Connection con = null;
    private static Statement st = null;
    
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded :)");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getCause());
            System.out.print("cant found th e Driver class");
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
            st = con.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public static Connection getConnection() {
        return con;
    }

    public static Statement getStatement(){
        return st;
    }
}
