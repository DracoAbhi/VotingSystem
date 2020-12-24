package Project;
import java.sql.*;


public class Connect {
    public static Connection getCon()
    {
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","19982212");
            return con;
        }
        
        catch(Exception e)
        {
            return null;
        }
    }
}

