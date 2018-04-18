package miscellaneous;

public class DbCredentials {
	private String db;
	private String dbUser;
	private String dbPwd;

	public DbCredentials() {
		this.db = "RetailProject";
		this.dbUser = "root";
		this.dbPwd = "Allatoona1";
		
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPwd() {
		return dbPwd;
	}

	public void setDbPwd(String dbPwd) {
		this.dbPwd = dbPwd;
	}
	
	

}
