package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuariosDAO;

public class UsuariosDAOImpl extends GenericDAO implements UsuariosDAO {

	@Override
	public void registrarUsuario(Usuario usuario) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_USUARIO);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getCalle());
			ps.setString(3, usuario.getNumeracion());
			ps.setString(4, usuario.getCodigo_postal());
			ps.setString(5, usuario.getPoblacion());
			ps.setString(6, usuario.getTelefono());
			ps.setString(7, usuario.getEmail());
			ps.setString(8, usuario.getParticularoempresa());
			
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("la sql de inserccion esta mal");
		}
		desconectar();

	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_USUARIOS);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setCalle(resultado.getString("calle"));
				usuario.setNumeracion(resultado.getString("numeracion"));
				usuario.setCodigo_postal(resultado.getString("codigo_postal"));
				usuario.setPoblacion(resultado.getString("poblacion"));
				usuario.setTelefono(resultado.getString("telefono"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setParticularoempresa(resultado.getString("particularoempresa"));
				usuario.setId(resultado.getInt("id"));

				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			System.out.println("sql select usuarios esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return usuarios;
	}

	

	@Override
	public void borrarUsuarios(int id) {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_USUARIO);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("sql de borrar usuarios esta mal");

		}
		desconectar();

	}

	@Override
	public Usuario obtenerUsuarioPorId(int id) {
		conectar();
		Usuario usuario = new Usuario();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_USUARIO_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				usuario.setNombre(rs.getString("nombre"));
				usuario.setCalle(rs.getString("calle"));
				usuario.setNumeracion(rs.getString("numeracion"));
				usuario.setCodigo_postal(rs.getString("codigo_postal"));
				usuario.setPoblacion(rs.getString("poblacion"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setEmail(rs.getString("email"));
				usuario.setParticularoempresa(rs.getString("particularoempresa"));
				usuario.setId(id);
			}
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}

		desconectar();
		return usuario;
	}

	@Override
	public void guardarCambiosUsuario(Usuario usuario) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_USUARIO);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getCalle());
			ps.setString(3, usuario.getNumeracion());
			ps.setString(4, usuario.getCodigo_postal());
			ps.setString(5, usuario.getPoblacion());
			ps.setString(6, usuario.getTelefono());
			ps.setString(7, usuario.getEmail());
			ps.setString(8, usuario.getParticularoempresa());
			ps.setInt(9, usuario.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out
					.println("posiblemente la sql de guardar cambios esta mal");
			System.out.println(e.getMessage());

		}

		desconectar();

	}

}
