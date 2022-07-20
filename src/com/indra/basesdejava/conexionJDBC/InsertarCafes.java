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
public class InsertarCafes {

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
	            //stmt.executeUpdate(query);
	            stmt.executeUpdate("insert into cafes values ('Colombiano',101,7.99,0,0)");
	            stmt.executeUpdate("insert into cafes values ('Frances Tostado',150,9.99,0,0)");
	            stmt.executeUpdate("insert into cafes values ('Espresso',101,5.99,0,0)");
	            stmt.executeUpdate("insert into cafes values ('Colombiano Decaf',150,8.99,0,0)");
	            stmt.executeUpdate("insert into cafes values ('CafeLatte',101,7.99,0,0)");
	                    
	            
	            stmt.close();
	            con.close();                
	        }catch(SQLException e) {
	            System.err.println(e.getMessage());
	        }

	}

}
