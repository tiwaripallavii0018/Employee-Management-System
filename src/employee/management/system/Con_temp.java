
package employee.management.system;
import java.sql.*;
/**
 *
 * @author pallavi
 */
public class Con {
  
    Connection c;
    Statement s;
    public Con(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql:///employee_management_sys","root","101179");
          s=c.createStatement();
          
        
    }catch(Exception e){
        e.printStackTrace();
    }}
}
