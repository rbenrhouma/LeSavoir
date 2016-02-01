package structure;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

class ResultSetTableModel extends AbstractTableModel
{  
   /**
      Constructs the table model.
      @param aResultSet the result set to display.
   */
   public ResultSetTableModel(ResultSet aResultSet)
   {  
      rs = aResultSet;
      try
      {  
         rsmd = rs.getMetaData();
      }
      catch (SQLException e)
      {  
         e.printStackTrace();
      }
   }
 
   public String getColumnName(int c)
   {  
      try
      {  
         return rsmd.getColumnName(c + 1);
      }
      catch (SQLException e)
      {  
         e.printStackTrace();
         return "";
      }
   }
 
   public int getColumnCount()
   {  
      try
      {  
         return rsmd.getColumnCount();
      }
      catch (SQLException e)
      {  
         e.printStackTrace();
         return 0;
      }
   }
 
   public Object getValueAt(int r, int c)
   {  
      try
      {  
         rs.absolute(r + 1);
         return rs.getObject(c + 1);
      }
      catch(SQLException e)
      {  
         e.printStackTrace();
         return null;
      }
   }
 
   public int getRowCount()
   {  
      try
      {  
         rs.last();
         return rs.getRow();
      }
      catch(SQLException e)
      {  
         e.printStackTrace();
         return 0;
      }
   }
 
   private ResultSet rs;
   private ResultSetMetaData rsmd;
}
