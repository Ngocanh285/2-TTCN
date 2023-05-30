
package connect;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {
        
        
//        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;DatabaseName=QLKS;user=sa;password=12345678;encrypt=true;trustServerCertificate=true;";
        String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER01;DatabaseName=QLKS;user=sa;password=12345678;encrypt=false;";

//
        try{
            Connection con = DriverManager.getConnection(connectionUrl); 
            Statement stmt = con.createStatement();

            String SQL = "SELECT TOP 10 * FROM HoaDon";
            ResultSet rs = stmt.executeQuery(SQL);
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaHD") + " " + rs.getString("MaKH"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

   

    
}
