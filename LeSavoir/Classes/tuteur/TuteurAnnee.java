package tuteur;

import java.sql.Date;

import anneeScolaire.AnneeScolaire;

public class TuteurAnnee {
	public AnneeScolaire annee;
	public Tuteur tuteur;
	public Date dateReglement;
	public Date dateInscription;
	public double totalBase;  // montant calculé automatiquement = Montant Anuel * nombre enfants
	public double totalReduction;  // montant calculé automatiquement = relatif au nombre enfants 
	public double totalReductionExceptionel;  // montant saisi manuellement exceptioellement.
	public int nombreEnfants;					// champ calculé
	public double totalDue;  // montant à régler.
	
	public double don;       // Montant ne rentre pas dans la base de calcul.
	

}
