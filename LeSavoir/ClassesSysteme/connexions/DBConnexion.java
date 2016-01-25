package connexions;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import structure.User;

public class DBConnexion {
	public String ServeurName;
	public String localhost;
	public String DataBaseName;
	public User SqlUser;
	public Connection MyConnexion;
	public Statement MyStatement;
	public ResultSet MyResultSet;
	public Boolean ConnexionIsOK;
	public Date DataBaseVersion;

	private Date getDataBaseVersion() {
		if (DataBaseVersion.getDate() == 0) {
			// chercher la date de la version à partir de la table infos
			return DataBaseVersion;

		}

		else
			return DataBaseVersion;
	}

	@SuppressWarnings("deprecation")
	public DBConnexion() {
		SqlUser = new User();
		SqlUser.UserName = "";
		SqlUser.userPassword = "";
		localhost = "49159";
		ConnexionIsOK = false;

		// DataBaseVersion.setDate(0);
	}

	public String getConnexionString() {
		return "jdbc:sqlserver://localhost:" + localhost + ";databaseName=" + DataBaseName + ";user=" + SqlUser.UserName
				+ ";password=" + SqlUser.userPassword;
	}

	public boolean ExecuteConnexion() {

		ConnexionIsOK = true;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String StrCon = getConnexionString();
			MyConnexion = DriverManager.getConnection(StrCon);
			if (!MyConnexion.isClosed())
				System.out.println("Connexion au serveur MySQL par TCP/IP...");
		}

		catch (Exception e) {
			ConnexionIsOK = false;
			e.printStackTrace();
		} finally {
		}
		return ConnexionIsOK;
	}

}
