/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;

import java.sql.*;

/**
 * @author aocarballo
 *
 */
public class CrearCafe {
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
		query="create table cafes "+
                "(COF_NAME varchar(32), " +
                "SUP_ID int, " +
                "PRICE float, " +
                "SALES int, " +
                "TOTAL int)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
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
