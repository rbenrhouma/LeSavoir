package eleves;

import java.sql.Date;

import divers.Email;
import divers.Sexe;
import divers.Telephone;

public class Eleves {
	public NomPrenom info;
	public Sexe sexe;
	public Date dateNaissance;
	public Email email;
	public Email email2;
	public Telephone telMobile;
	
	Eleves(int id) {
		info.nom = "";
		info.prenom = "";
		info.nomArabe = "";
		info.prenomArabe = "";
	}

}
