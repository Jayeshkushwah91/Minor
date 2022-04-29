package dao;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class UserDAO 
{
    public void getStudentData(String studentname)
    {
        try
        {
            Statement st = DBConnector.getStatement();
            String query = "SELECT * FROM student WHERE studentname='"+studentname+"'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                rs.getString(1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}