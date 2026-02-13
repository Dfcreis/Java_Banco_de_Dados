package metadados;

import java.sql.*;

public class MetaData {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567")){
            System.out.println("Connected to database successfully");

            DatabaseMetaData dbmd = conn.getMetaData();
           try (ResultSet rs =  dbmd.getTables(null, null, null, new String[]{"TABLE"})) {
               while (rs.next()) {
                  String tableName = rs.getString("TABLE_NAME");
                   System.out.println(tableName);
               }
           }
        }
    }
}
