import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;

public class test2 {
	public static void main (String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?user=root&password=iotian");
			Statement s = con.createStatement();
			s.execute("select* from demo");
			int i = 1;
			ResultSet rs = s.getResultSet();
			if(rs!=null)
				while(rs.next())
				{
					System.out.println("Record Number:"+i);
					System.out.println("Data from column name: "+rs.getString(1));
					System.out.println("Data from column name: "+rs.getString(2));
					System.out.println("Data from column name: "+rs.getString(3));
					System.out.println("Data from column name: "+rs.getString(4));
					i = i+1;
				}
			s.close();
			con.close();
		
		
	
	}
		catch(Exception err) {
			System.out.println("ERROR:"+err);
		}
	}
}

