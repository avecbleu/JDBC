package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// 1 create a connection
		

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root","q59znpcfrk");
		
		// 2 create statement/query
		
		Statement stmt=con.createStatement();
		
		String s="insert into sys.student values(104,'Frank')";
		
		// 3 execute statement/query
		
		stmt.execute(s);
		
		// close connection
		
		con.close();
		
		System.out.println("Query executed....");
	}

}
