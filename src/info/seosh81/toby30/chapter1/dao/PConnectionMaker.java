package info.seosh81.toby30.chapter1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PConnectionMaker implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "mysql9002");
		return c;
	}

}
