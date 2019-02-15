import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class test1{
	public static void main (String[] args) {
		
		Connection testconn ;
		try {
			String url1 = "jdbc:mysql://localhost:3306/test1";
			String user = "root";
			String password = "iotian";
			
			testconn = DriverManager.getConnection(url1, user, password);
			
			if(testconn!=null) {
				System.out.println("hi i'm able to connect");
			}
		}
		catch(SQLException e) {
			System.out.println("Sorry");
			e.printStackTrace();
		}
	}
}