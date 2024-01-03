package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//to create connection
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "mysql550";
		Connection connection = DriverManager.getConnection(url,username,password);
		
		//to create statement/query
		Statement stmt = connection.createStatement();
		
		String s ="INSERT INTO students values('Max','John',86)";
		//String s= "UPDATE students SET LastName = 'David' WHERE marks=80";
		//String s = "DELETE from students WHERE LastName ='Fill' ";
		
        //execute query
		stmt.execute(s);
		
		//close the connection
		connection.close();
		
		//confirmation message
		System.out.println("query executed....");
	}
//jdbc:mysql://localhost:3306/mydb
}
