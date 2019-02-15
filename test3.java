import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;

public class test3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?user=root&password=iotian" );
			String sql = "INSERT INTO demo1(no,name,age)" +"VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			con.setAutoCommit(false);
			ps.setInt(1, 25);
			ps.setString(2, "BB");
			ps.setInt(3, 38);
			ps.execute();
			ps.setInt(1, 26);
			ps.setString(2, "BIRLA BOY");
			ps.setInt(3, 7);
			ps.execute();
			con.commit();
			ps.close();
			con.close();
			System.out.println("Records are insered");
		}
		catch(Exception err) {
			System.out.println("ERROR: "+err);
		}
	}

}
