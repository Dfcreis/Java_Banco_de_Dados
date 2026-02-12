package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUpdate {
    public static  void main(String args[]) throws Exception {

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567")){
            System.out.println("Connected to database successfully");

       /* try(Statement stmt = conn.createStatement()){
            stmt.executeUpdate("delete from customer where id = 4");
            System.out.println("Customer deleted successfully");
        }*/

            try(Statement stmt = conn.createStatement()){
                stmt.executeUpdate("update customer set name = 'Daniel F' where id = 1");
                System.out.println("Customer updated successfully");
            }


        }






    }
}
