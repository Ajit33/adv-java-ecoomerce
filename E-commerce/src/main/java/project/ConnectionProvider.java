package project;
import java.sql.*;
public class ConnectionProvider {
 public static Connection getCon() {
	 try {
		 Class.forName("com.mysql.cj.jdbc.driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","12345678");
		 return con;
	 }
	 catch(Exception e) {
		 System.out.print(e);
	    return null;
	 }
 }
}
