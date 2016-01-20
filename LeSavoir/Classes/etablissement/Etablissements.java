package etablissement;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import connexions.DBConnexion;
import divers.Adresse;

public class Etablissements {
	public int EtabNumVersion;
	public Date EtabDateVersion;
	public String EtabVersion;
	public String EtabName;
	public Adresse EtabAdresse;

	public Etablissements(String aEtabName, DBConnexion aConnexion) {
		EtabName = aEtabName;
		EtabAdresse = new Adresse();
		ChargementEtablissement(aConnexion);
	}

	private void ChargementEtablissement(DBConnexion aConnexion) {
		Statement stmt = null;
		ResultSet rs = null;
		String SQL = " SELECT CONVERT(varchar(100),EP.class_desc) AS PropertyOn, CONVERT(varchar(100),DB_NAME()) AS DatabaseName, CONVERT(varchar(100),EP.name) AS ExtendedPropertyDescription, " + "\n" + 
		             " CONVERT(varchar(100),EP.VALUE) AS ExtendedPropertyValue    " + "\n" +
				     " FROM sys.extended_properties AS EP  WHERE EP.name <> 'MS_Description' " + "\n" +
				     " AND EP.class = 0 AND DB_NAME()  = '" + EtabName + "'";
		try {
			
			
			stmt = aConnexion.MyConnexion.createStatement();
		
			rs = stmt.executeQuery(

					// " SELECT CONVERT(varchar(100), SERVERPROPERTY('ProductVersion'))  "
					SQL

			);
			while (rs.next()) {

				String sFieldName = rs.getString("ExtendedPropertyDescription");
				String sFieldValue = rs.getString("ExtendedPropertyValue");
				System.out.println(sFieldName);
				System.out.println(sFieldValue);
				if ((sFieldName != null) & (sFieldValue != null)) {
					if (sFieldName.equals("ETAB_NAME")) {
						this.EtabName = sFieldValue;
					}
					;
					if (sFieldName.equals("ETAB_ADRESSE_NUM")) {
						this.EtabAdresse.numeroComplement = sFieldValue;
					}
					;
					if (sFieldName.equals("ETAB_ADRESSE_NOM")) {
						this.EtabAdresse.setNomVoie(sFieldValue);
					}
					;
					if (sFieldName.equals("ETAB_ADRESSE_CODEPOSTAL")) {
						this.EtabAdresse.setCodePostal(sFieldValue);
					}
					;
					if (sFieldName.equals("ETAB_ADRESSE_VILLE")) {
						this.EtabAdresse.setVille(sFieldValue);
					}
					;


				}


			}
			System.out.print(this.EtabName);
			System.out.print(EtabAdresse.numeroComplement);
			System.out.print(EtabAdresse.getNomVoie());
			System.out.print(EtabAdresse.getCodePostal());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
		}
	}
}
