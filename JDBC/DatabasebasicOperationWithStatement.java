package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Emp1{
	private int id;
	private String name;
	private String loc;
	
}

public class DatabasebasicOperationWithStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo","root","root");
		
		String query="select * from emp3";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(query);
		
		while(res.next()) {
			System.out.print("\t" + res.getString("name"));
			System.out.print("\t" + res.getString("loc"));
			System.out.println();
		}
		
		
	}

}
