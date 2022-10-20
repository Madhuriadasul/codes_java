package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedstatementInt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo","root","root");
		
		int id=10;
		
		String query="select * from emp2  where id=?";
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		
		ResultSet res= pst.executeQuery();
		while(res.next()) {
			System.out.print(res.getString("id")); 
			System.out.print("\t" +res.getString("name"));
			System.out.print("\t" +res.getString("loc"));
			System.out.println();
		}
		
	}

}
