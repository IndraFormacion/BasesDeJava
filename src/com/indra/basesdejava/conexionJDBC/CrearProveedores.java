/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author aocarballo
 *
 */
public class CrearProveedores {
	static String user="root";
	static String passwd="123456";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/indra2022";
		Connection con;
		String query;
		Statement stmt;
		 query="create table suppliers (sup_name varchar(32), " +
	                "sup_id int, " +
	                "street varchar(40), " +
	                "city varchar(20), " +
	                "state char(2), " + 
	                "zip char(5))";
		try {
			con=DriverManager.getConnection(url, user, passwd);
            stmt=con.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
		} catch (Exception e) {
			// TODO: handle exception
			 System.err.println(e.getMessage());
		}
	}

}
