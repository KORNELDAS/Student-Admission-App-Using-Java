
package studentadmissionapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    public static Connection connect(){
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Imported");
        } catch (SQLException ex) {
            System.out.println("Connection cannot be established");
        }
        return null;
    }
         
}
