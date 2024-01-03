package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommand {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		

		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String username = "root";
		String password = "mysql550";
		Connection connection = DriverManager.getConnection(url,username,password);
		
		Statement stmt = connection.createStatement();
		
		String s = "SELECT ContactFirstname , ContactLastName , City from customers";
		
		
		//store data in resultset
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next()) {
			
			String city = rs.getString("City");
			String firstname = rs.getString("ContactFirstname");
			String lastname = rs.getString("ContactLastName");
			
			System.out .println(firstname + "        " +lastname + "         " +city);
			
		}
		
		connection.close();
		
		
		
		

	}

}
