package jdbc;

import java.sql.*;

public class SelectCustomer {
    public static void main(String[] args) throws Exception {
       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567");) {

           System.out.println("success");

           try(PreparedStatement stmt = conn.prepareStatement("select count(*) from customer")){
               try(ResultSet rs = stmt.executeQuery()){
                   rs.next();
                  int count = rs.getInt(1);
                   System.out.println("count= "+count);
               }
           }
       }
    }
}
