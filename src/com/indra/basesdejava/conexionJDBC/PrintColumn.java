/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author aocarballo
 *
 */
public class PrintColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/indra2022";
        Connection con;
        Statement stmt;
    String query="Select * from cafes";        
        
        try {
            con=DriverManager.getConnection(url, "root", "123456");
            stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData();
            PrintColumnTypes.printColTypes(rsmd);
            
            System.out.println("-----------------------------------");            
            System.out.println("Lista de Cafes");
            System.out.println("-----------------------------------");
            System.out.printf("%30s %20s", "Nombre", "Precio");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            
            while(rs.next()) {
            	System.out.printf("%30s %20s", rs.getString("cof_name"), rs.getFloat(3));
                System.out.println();
            }
                    
            stmt.close();
            con.close();                
        }catch(SQLException e) {
            System.err.println(e.getMessage());
        }
	}

}
