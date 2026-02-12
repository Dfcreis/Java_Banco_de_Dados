package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertCustomer {

    public static void main (String[] args)throws Exception{

         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567")){
             System.out.println("Connected to database successfully");

           try(Statement stmt = conn.createStatement()){
               stmt.executeUpdate("insert into customer(name,email,age) values ('Gabrielli','g@g.com',22)");
               System.out.println("Customer inserted successfully");
           }
         }




    }
}
