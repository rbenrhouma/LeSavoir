import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnexion {
	public String ServeurName;
	public String localhost;
	public String DataBase;
	public User SqlUser;
	public Connection MyConnexion;
	public Statement MyStatement;
	public ResultSet MyResultSet;
	public Boolean ConnexionIsOK ;
	
	public DBConnexion(){
		User user = new User();
		user.UserName ="";
		user.userPassword="";
		localhost = "49159";
		ConnexionIsOK = false;		
	}
	
	public String getConnexionString()
	{
		//String connectionUrl = "jdbc:sqlserver://localhost:49159;databaseName=SYSTEME;user=Administrateur;password=Admin";
		return "jdbc:sqlserver://localhost:" + localhost +
			   ";databaseName=" + DataBase+
			   ";user=" + SqlUser.UserName+
			   ";password=" + SqlUser.userPassword
				;
	}
	public boolean ExecuteConnexion() {
	      
	      //Statement stmt = null;
	      //ResultSet rs = null;	
		 ConnexionIsOK = true;
	      try {
	    	  	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	  	String StrCon = getConnexionString();
	    	  	MyConnexion = DriverManager.getConnection(StrCon);
	    	  	if (!MyConnexion.isClosed())
	    	  		System.out.println("Connexion au serveur MySQL par TCP/IP...");
	    	  	//String SQL = "SELECT * FROM TABLES";
	    	  	//stmt = connexion.createStatement();
	    	  	//rs = stmt.executeQuery(SQL);
	         
	      	}
	      
	      catch (Exception e) {
	    	  ConnexionIsOK = false;
	         e.printStackTrace();
	      }
	      finally {
	    	 
	         //if (rs != null) try { rs.close(); } catch(Exception e) {}
	         //if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	         //if (MyConnexion != null) try { MyConnexion.close(); } catch(Exception e) {}	         
	      }	 		
	      return ConnexionIsOK;		
	}

}

