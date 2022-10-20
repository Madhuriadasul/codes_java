package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementInJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String mysqlUrl="jdbc:mysql://localhost:3306/sql_demo";
		Connection con= DriverManager.getConnection(mysqlUrl,"root","root");
		
		System.out.println("Conncetion estiblished...");
		
		CallableStatement stmt=con.prepareCall("{call getProductPrice(?, ?, ?, ?)}");
		stmt.setInt(1,12);
		
		
		stmt.registerOutParameter(2,Types.VARCHAR);
		stmt.registerOutParameter(3,Types.VARCHAR);
		stmt.registerOutParameter(4,Types.INTEGER);
		
		stmt.executeUpdate();
		
		String product_Name = stmt.getString(2);

		String customer_Name = stmt.getString(3);
		int price=stmt.getInt(4);
		
		System.out.println("Details of the sale with given id are");
		
		System.out.println("Product Name:" + product_Name);
		System.out.println("Customer_Name:" + customer_Name);
		
		System.out.println("Price:" + price);
		
		
	}

}
