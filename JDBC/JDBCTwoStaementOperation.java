package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTwoStaementOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo","root","root");
		
		String name= "Ram";
		String id="A";
		String query="select * from emp where name=? or id=?";    //and
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,name);
		pst.setString(2, id);
		
		ResultSet res= pst.executeQuery();
		
		while (res.next()) {
			System.out.print(res.getString("id"));
			System.out.print("\t" + res.getString("name"));
			System.out.print("\t" + res.getString("loc"));
			System.out.println();
			
		}
		
	}

}
