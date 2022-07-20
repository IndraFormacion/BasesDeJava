/**
 * 
 */
package com.indra.basesdejava.conexionJDBC;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * @author aocarballo
 *
 */
public class PrintColumnTypes {

	  public static void printColTypes(ResultSetMetaData rsmd) throws SQLException {
	        int columns=rsmd.getColumnCount();
	        for(int i=1;i<=columns;i++) {
	            int jdbcType=rsmd.getColumnType(i);
	            String nombre=rsmd.getColumnTypeName(i);
	            String campo=rsmd.getColumnName(i);
	            System.out.print("La columna " + i + " es jdbcType " + jdbcType );
	            System.out.print(", el campo es " + campo );
	            System.out.println(", la cual es " + nombre);

	        }

	  }
}
