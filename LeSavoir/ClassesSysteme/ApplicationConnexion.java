
public class ApplicationConnexion {
	public DBConnexion Session ;
	public DBConnexion SystemeSession;
	public String ApplicationUser;
	public String ApplicationPassWord;
	
	public ApplicationConnexion(){
		Session = new DBConnexion();
		SystemeSession = new DBConnexion();
	}
	public boolean ApplicationUserExist(){
		return true;
	}
}
