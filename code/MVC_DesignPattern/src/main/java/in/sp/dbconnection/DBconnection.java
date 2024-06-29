package in.sp.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection getConnection() {
        Connection con = null;
        try{
         Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mvc_db","root","");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
