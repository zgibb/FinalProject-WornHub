package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import miscellaneous.DbCredentials;
import model.Customer;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// get inputs
		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String emailAddress = request.getParameter("EmailAddress");
		
		Customer customer = new Customer();
		customer.setUserName(userName);
		customer.setPassword(password);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmailAddress(emailAddress);
		


		// get db credentials
		DbCredentials dbc = new DbCredentials();

		// get handle on addquery object
		AddQuery aq = new AddQuery(dbc.getDb(),dbc.getDbUser(),dbc.getDbPwd());

		// call method to add to the database
		aq.doAdd(customer);

		// when done, go back 
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
