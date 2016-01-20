package structure;

public class Table {
	String tablePrefixe;
	String tableName;
	String tableDescription;
	int tableVersion;

	void LoadFilelds() {
		// chargement de la iste des champs
	};

	String TableCreateScript() {
		// Retourne le script de Create ou bien Alter de la table
		return "";
	}
}
