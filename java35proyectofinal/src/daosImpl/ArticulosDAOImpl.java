package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;
import modelo.Articulo;
import daos.ArticulosDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class ArticulosDAOImpl extends GenericDAO implements ArticulosDAO{

	@Override
	public void registrarArticulo(Articulo articulo) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_ARTICULO);
			ps.setString(1, articulo.getTalla());
			ps.setString(2, articulo.getGenero());
			ps.setString(3, articulo.getColor());
			ps.setString(4, articulo.getCodigo());
			ps.setString(5, articulo.getModa());
			ps.setString(6, articulo.getProvedor());
			ps.setString(7, articulo.getProcedencia());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("La sql de insercion esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		
	}

	@Override
	public List<Articulo> obtenerArticulos() {
		conectar();
		List<Articulo> articulos = new ArrayList<Articulo>();

		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_ARTICULOS);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Articulo articulo = new Articulo();
				articulo.setTalla(resultado.getString("talla"));
				articulo.setGenero(resultado.getString("genero"));
				articulo.setColor(resultado.getString("color"));
				articulo.setCodigo(resultado.getString("codigo"));
				articulo.setModa(resultado.getString("moda"));
				articulo.setId(resultado.getInt("id"));
				articulo.setProvedor(resultado.getString("provedor"));
				articulo.setProcedencia(resultado.getString("procedencia"));
				articulos.add(articulo);
			}
		} catch (SQLException e) {
			System.out.println("sql select Articulos esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return articulos;
		
	}

	@Override
	public void borrarArticulos(int id) {
		
		conectar();
		List<Articulo> articulos = new ArrayList<Articulo>();

		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_ARTICULO);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("sql de borrar articulos esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();

		
	}

	@Override
	public Articulo obtenerArticuloPorId(int id) {
		
		conectar();
		Articulo articulo = new Articulo();

		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_ARTICULO_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				articulo.setTalla(rs.getString("talla"));
				articulo.setGenero(rs.getString("genero"));
				articulo.setColor(rs.getString("color"));
				articulo.setCodigo(rs.getString("codigo"));	
				articulo.setModa(rs.getString("moda"));
				articulo.setProvedor(rs.getString("provedor"));
				articulo.setProcedencia(rs.getString("procedencia"));
				articulo.setId(id);
			}
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}

		desconectar();
		return articulo;
	}

	@Override
	public void guardarCambiosArticulo(Articulo articulo) {
		
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_ARTICULO);
			ps.setString(1, articulo.getTalla());
			ps.setString(2, articulo.getGenero());
			ps.setString(3, articulo.getColor());
			ps.setString(4, articulo.getCodigo());
			ps.setString(5, articulo.getModa());
			ps.setString(6, articulo.getProvedor());
			ps.setString(7, articulo.getProcedencia());
			ps.setInt(8, articulo.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("posiblemente la sql de guardar cambios esta mal");
			System.out.println(e.getMessage());
		}
		
		
		desconectar();
		
	}
	
	

}
