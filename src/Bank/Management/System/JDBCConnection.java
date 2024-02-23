package Bank.Management.System;
                                       
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {
    Connection connection;
    Statement statement;
    public JDBCConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Rupani@0410");
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
