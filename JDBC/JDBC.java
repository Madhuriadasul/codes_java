package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo","root","root");
		String name="Raj";
		String query="select * from emp where name=?";
		
		PreparedStatement pst= conn.prepareStatement(query);
		pst.setString(1, name);
		
		ResultSet res= pst.executeQuery();
		while(res.next()) {
			System.out.print(res.getString("id"));
			System.out.print("\t"+ res.getString("name"));
			
			System.out.print("\t "+ res.getString("loc"));
			System.out.println();
		}
		
	}

}
