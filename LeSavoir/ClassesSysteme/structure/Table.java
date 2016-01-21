package structure;

public class Table {
	public String tablePrefixe;
	public String tableName;
	public String tableDescription;
	int tableVersion;

	public void LoadFilelds() {
		// chargement de la iste des champs
	};

	public String TableCreateScript() {
		// Retourne le script de Create ou bien Alter de la table
		return "";
	}
}
