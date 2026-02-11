import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {
    public static void main(String[] args) throws Exception {

      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","1234567");
        System.out.println("Connected to database successfully");
        conn.close();
    }
}
