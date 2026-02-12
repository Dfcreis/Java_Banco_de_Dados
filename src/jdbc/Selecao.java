package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Selecao {
    public static void main(String[] args) throws Exception{
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567");) {
            System.out.println("Connected to database successfully");


            try(PreparedStatement stmt = conn.prepareStatement("select * from customer order by name")){
                try(ResultSet rs = stmt.executeQuery()){
                    while(rs.next()){
                       int id =   rs.getInt("id");
                       String name = rs.getString("name");
                       String email = rs.getString("email");
                       int age = rs.getInt("age");
                        System.out.format("ID: %d, Name: %s , Email: %s , Age: %d\n",id,name,email,age);
                    }
                }
            }
        }
    }
}
