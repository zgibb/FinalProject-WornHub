package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import model.Product;

public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public ReadQuery(String dbName, String uname, String pwd){
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
	
	public void doRead(){
		String query = "select * from Customer";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table ="";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				
				Customer customer = new Customer();
				customer.setUserName(this.results.getString("username"));
				customer.setPassword(this.results.getString("password"));
				customer.setFirstName(this.results.getString("firstName"));
				customer.setLastName(this.results.getString("lastName"));
				customer.setEmailAddress(this.results.getString("emailAddress"));
								
				table +="<tr>";
				table +="<td>";
				table += customer.getUserName();
				table +="</td>";
				table +="<td>";
				table += customer.getPassword();
				table +="</td>";
				table +="<td>";
				table += customer.getFirstName();
				table +="</td>";
				table +="<td>";
				table += customer.getLastName();
				table +="</td>";
				table +="<td>";
				table += customer.getEmailAddress();
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}

}



