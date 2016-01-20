package divers;

public class Adresse {
	int numero;
	public String numeroComplement;
	typeRue typeVoie;
	private String nomVoie;
	private String codePostal;
	private String ville;
	String pays;

	public String AdresseAsString(){
		return numeroComplement + " "+ nomVoie + " "+codePostal +" "+ ville;
	};
	
	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
