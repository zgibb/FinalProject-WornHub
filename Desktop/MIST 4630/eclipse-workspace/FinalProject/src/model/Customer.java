package model;

public class Customer {
	
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public Customer() {
		this.firstName = "Zack";
		this.lastName = "Gibson";
		this.emailAddress = "z.gibson14@yahoo.com";
		this.userName = "zgibb";
		this.password = "password";
		
	}
	
	public Customer(String userName, String password, String firstName, String lastName, String emailAddress) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
