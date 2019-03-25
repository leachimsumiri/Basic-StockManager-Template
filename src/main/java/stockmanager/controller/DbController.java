package stockmanager.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbController {
	
	public static final String JDBC_DRIVER = "org.h2.Driver";   
	//TOOO change to correct path
	public static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

	//TOOO change to correct user/pwd
	public static final String USER = "sa"; 
	public static final String PASS = "sa"; 
	
	private Connection conn = null; 
	
	private static DbController instance;
	
	public DbController() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER); 
		
		//TODO change to logger
        System.out.println("Connecting to database..."); 
        conn = DriverManager.getConnection(DB_URL,USER,PASS);  
        
		//TODO change to logger
        System.out.println("connection sucessful"); 
	}

	public Connection getConnection() {
		return conn;
	}
	
	public static DbController getInstance() throws ClassNotFoundException, SQLException
	{
		if (instance == null)
		{
			setInstance(new DbController());
		}
		return instance;
	}

	private static void setInstance(DbController instance) {
		DbController.instance = instance;
	}
}
