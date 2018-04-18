package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;

public class AddQuery {

	private Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;

		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void doAdd(Customer customer) {
		String query = "insert into Customer (UserName, Password , FirstName, LastName, EmailAddress) values (?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, customer.getUserName());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getEmailAddress());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
