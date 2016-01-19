package etablissement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import connexions.DBConnexion;
import divers.Adresse;

public class Etablissements {
	int EtabNumVersion;
	Date EtabDateVersion;
	String EtabVersion;
	String EtabName;
	Adresse EtabAdresse;
	
	public Etablissements(String aEtabName, DBConnexion aConnexion){
		EtabName = aEtabName;
	    EtabAdresse = new Adresse();
		ChargementEtablissement(aConnexion);
	}
	
	private void ChargementEtablissement(DBConnexion aConnexion){
	      Statement stmt = null;
	      ResultSet rs = null;	
	      String SQL = 
	      " SELECT EP.class_desc AS PropertyOn, " +
	      " DB_NAME() AS DatabaseName, " +
	      " EP.name AS ExtendedPropertyDescription, " +
	      " EP.VALUE AS ExtendedPropertyValue " +
	      " FROM sys.extended_properties AS EP " +
	      " WHERE EP.name <> 'MS_Description' " +
	      " AND EP.class = 0 AND DB_NAME()  = 'LE_SAVOIR' "; //"+ EtabName + "'";
	       try {
	    	   stmt =  aConnexion.MyConnexion.createStatement();
	    	   rs = stmt.executeQuery(
	    			   
	    			   
 //" SELECT *  FROM TTTTT  " 	
	    			   SQL
	    			   
                                     );
	    	   while (rs.next()) {
	    		  
	    		   String sFieldName = rs.getString("ExtendedPropertyDescription");
	    		   String sFieldValue = rs.getString("ExtendedPropertyValue");
	    		   System.out.println(sFieldName);
	    		   System.out.println(sFieldValue);
	    		   if ((sFieldName != null) & (sFieldValue != null))
	    		   {
	    			   if (sFieldName.equals("ETAB_NAME")) {this.EtabName = sFieldValue ; };
	    			   if (sFieldName.equals("ETAB_ADRESSE_NUM")) {this.EtabAdresse.numeroComplement = sFieldValue ; };
	    			   if (sFieldName.equals("ETAB_ADRESSE_NOM")) {this.EtabAdresse.setNomVoie(sFieldValue) ; };
	    			   if (sFieldName.equals("ETAB_ADRESSE_CODEPOSTAL")) {this.EtabAdresse.setCodePostal(sFieldValue) ; };
	    			   if (sFieldName.equals("ETAB_ADRESSE_VILLE")) {this.EtabAdresse.setVille(sFieldValue) ; };
  			   
	    		   }
	       
	       		}
	    	   }
	       		catch (SQLException e ) {
	       			e.printStackTrace();
	       		} 
	       			finally {
	       	         if (rs != null) try { rs.close(); } catch(Exception e) {}
	       	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	       }
}
}
	       
	       
	     

