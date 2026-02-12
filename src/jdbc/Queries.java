package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Queries {
    public static void main (String[] args) throws Exception {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567")){
            System.out.println("Connected to database successfully");

           try(PreparedStatement stmt = conn.prepareStatement("insert into customer(name,email,age) values (?,?,?)")){
               stmt.setString(1,"Karin R");
               stmt.setString(2,"k@k.com");
               stmt.setInt(3,43);
               stmt.executeUpdate();
           }

        }
    }

}
