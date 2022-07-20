/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author aocarballo
 *
 */
public class InsertarProveedores {
	static String user="root";
	static String passwd="123456";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/indra2022";
        Connection con;
        Statement stmt;
        
        try {
            con=DriverManager.getConnection(url, user, passwd);
            stmt=con.createStatement();
            stmt.executeUpdate("insert into SUPPLIERS " +
                     "values('Superior Coffee', 150, '1 Party Place', " +
                 "'Mendocino', 'CA', '95460')");
        
            stmt.executeUpdate("insert into SUPPLIERS " +
                "values( 'Acme, Inc.',101, '99 Market Street', " +
                "'Groundsville', 'CA', '95199')");
    
            stmt.executeUpdate("insert into SUPPLIERS " +
                     "values( 'The High Ground', 190,'100 Coffee Lane', " +
                 "'Meadows', 'CA', '93966')");
            
            stmt.close();
            con.close();
            
        }catch(SQLException e1) {
            System.err.print("Query invalida");
        }
	}

}
