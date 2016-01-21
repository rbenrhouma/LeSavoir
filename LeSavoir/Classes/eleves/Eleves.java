package eleves;

import java.sql.Date;

import divers.Sexe;

public class Eleves {
	public NomPrenom info;
	public Sexe sexe;
	public Date dateNaissance;
	
	Eleves(int id) {
		info.nom = "";
		info.prenom = "";
		info.nomArabe = "";
		info.prenomArabe = "";
	}

}
