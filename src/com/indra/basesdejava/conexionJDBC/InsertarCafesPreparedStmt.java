/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author aocarballo
 *
 */
public class InsertarCafesPreparedStmt {
	static String user="root";
	static String passwd="123456";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/indra2022";
        Connection con;
        PreparedStatement stmt;
        
        String misql="insert into cafes (cof_name, sup_id, price) values (?,?,?)";
        
        try {
            con=DriverManager.getConnection(url, user, passwd);
            //stmt=con.createStatement();
            stmt=con.prepareStatement(misql);
            stmt.setString(1, "Caramel Macchiato");
            stmt.setInt(2, 101);
            stmt.setFloat(3, 11.99f);
            int i=stmt.executeUpdate();
            if(i>0) {
                System.out.println("alta exitosa");
            }else {
                System.out.println("no se pudo realizar el alta");
            }
            
            
            stmt.close();
            con.close();                
        }catch(SQLException e) {
            System.err.println(e.getMessage());
        }
	}

}
