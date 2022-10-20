package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcbasicOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo","root","root");
		
		String query="select * from emp";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(query);
		System.out.println(res.toString());
	}

}
