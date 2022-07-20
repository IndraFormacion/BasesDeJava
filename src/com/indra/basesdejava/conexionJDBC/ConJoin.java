/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author aocarballo
 *
 */
public class ConJoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/indra2022";
        Connection con;
        Statement stmt;
        String query="Select sup_name, cof_name, price from cafes inner join suppliers on \r\n"
                + "cafes.SUP_ID =suppliers.sup_id";        
        
        try {
            con=DriverManager.getConnection(url, "root", "123456");
            stmt=con.createStatement();
            //stmt.executeUpdate(query); --> da una respuesta booleana
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("Lista de Cafes");
            System.out.println("-----------------------------------");
            System.out.printf("%30s %20s %20s", "sup_name","cof_name", "Precio");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            
            while(rs.next()) {
            	System.out.printf("%30s %20s %20s", rs.getString(1), rs.getString(2), rs.getFloat(3));
                System.out.println();
                
            }
                    
            stmt.close();
            con.close();                
        }catch(SQLException e) {
            System.err.println(e.getMessage());
        }
	}

}
