
package bloodbankmanagementsystem;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySqlConnection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "blood_bank_management_system";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger( " Get Connection -> " + MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
    
}
