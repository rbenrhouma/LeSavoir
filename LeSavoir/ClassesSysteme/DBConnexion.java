import java.sql.Connection;
import java.sql.Date;
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
	public Date DataBaseVersion ;
	
	private Date getDataBaseVersion(){
		if (DataBaseVersion.getDate() == 0)
		{
			// chercher la date de la version à partir de la table infos
			return DataBaseVersion;
			
		}
			
		else
			return DataBaseVersion;
	}
	
	@SuppressWarnings("deprecation")
	public DBConnexion(){
		SqlUser = new User();
		SqlUser.UserName ="";
		SqlUser.userPassword="";
		localhost = "49159";
		ConnexionIsOK = false;		
		
		//DataBaseVersion.setDate(0);
	}
	
	public String getConnexionString()
	{
		return "jdbc:sqlserver://localhost:" + localhost +
			   ";databaseName=" + DataBase+
			   ";user=" + SqlUser.UserName+
			   ";password=" + SqlUser.userPassword	;
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

