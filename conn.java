
package restaurant.management.system;

import java.sql.*;


public class conn {
    Connection c;
    Statement s;
    
    public conn() throws SQLException{
        
        try {
              Class.forName("com.mysql.jdbc.Driver");
              c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","madhav0001");
              s=c.createStatement();
            }catch(ClassNotFoundException | SQLException e){
                    }
    }
        
}
