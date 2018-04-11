package daos;

public class ConstantesSQL {

	public static final String INSERCION_ARTICULO = "insert into tabla_articulos(talla, genero, color, codigo, moda, provedor, procedencia) values(?,?,?,?,?,?,?)";
	public static final String SELECCION_ARTICULOS = "select * from tabla_articulos";
	public static final String BORRAR_ARTICULO = "delete from tabla_articulos where id = ?";
	public static final String OBTENER_ARTICULO_POR_ID = "select * from tabla_articulos where id = ? ";
	public static final String GUARDAR_CAMBIOS_ARTICULO = "update tabla_articulos set talla = ?, genero = ?, color = ?, codigo = ?, moda = ?, provedor = ?, procedencia = ? where id = ?";
	public static final String INSERCION_USUARIO = "insert into tabla_usuarios (nombre, calle, numeracion, codigo_postal, poblacion, telefono, email, particularoempresa) values(?,?,?,?,?,?,?,?)";
	public static final String SELECCION_USUARIOS = "select * from tabla_usuarios";
	public static final String IDENTIFICACION_ADMIN = "select id from tabla_admin where login = ? and pass = ?";
	public static final String BORRAR_USUARIO = "delete from tabla_usuarios where id = ?";
	public static final String OBTENER_USUARIO_POR_ID = "select * from tabla_usuarios where id = ? ";
	public static final String GUARDAR_CAMBIOS_USUARIO = "update tabla_usuarios set nombre = ?, calle = ?, numeracion = ?, codigo_postal = ?, poblacion = ?, telefono = ?, email = ?, particularoempresa = ? where id = ?";

}
