
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseHelper {
    public static final String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER01;DatabaseName=QLKS;user=sa;password=12345678;encrypt=false;";
    public static Connection getConnectBD(){
        
        try{
            Connection conn = DriverManager.getConnection(connectionUrl); 
            return conn;
        }
        catch (exception e)
        {
            System.out.println("Connect error"+e.toString());
        }
        return null;
    }
}
