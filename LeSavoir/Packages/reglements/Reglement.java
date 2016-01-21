package reglements;

import java.sql.Date;

import anneeScolaire.AnneeScolaire;
import divers.Cheque;
import divers.ModeReglement;
import tuteur.Tuteur;

public class Reglement {
	public AnneeScolaire annee;
	public Tuteur tuteur;
	public Date dateReglement;
	public int numeroReglement;
	public ModeReglement modeReglement;
	public String memeo;				// observation;
	public Cheque cheque;
}
