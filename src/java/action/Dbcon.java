package action;

import java.sql.Connection;
import java.sql.DriverManager;
public class Dbcon {

    public static Connection getCon() throws ClassNotFoundException {
        Connection con = null;  
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nicees", "root", "Keerthana");
            System.out.println("Data base connected succesfully"+con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
