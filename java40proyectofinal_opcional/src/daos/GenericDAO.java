package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDAO {

	protected Connection miConexion = null;

	// con abstract de esta clase solo se puede usar para heredar de
	// ella no para hacer objetos de ella

	// carga del driver de conexion con jdbc

	static {
		// este es un bloque especial que se ejecuta una unica vez
		// a lo largo de la aplicacion la primera vez que esta
		// clase es usada
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("No encuentro el driver");
		} 

	}// end static
	
	protected void conectar(){
		
		try {
			miConexion = DriverManager.getConnection(
					
					"jdbc:mysql://localhost:3306/portal_articulos", "root",
							"jeveris");
		} catch (SQLException e) {
			System.out.println("No pude conectarme a la base de datos");
			System.out.println("Comprobar ruta de base de datos");
			System.out.println("Comprobar nombre de usuario y contraseña");
			
		}
	}//end conectar
	
	protected void desconectar() {
		
		try {
			miConexion.close();
		} catch (SQLException e) {
			System.out.println("No pude realizar la desconexion");
		}
	}//end desconectar
	
}
