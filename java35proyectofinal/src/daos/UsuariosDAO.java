package daos;

import java.util.List;
import modelo.Usuario;

public interface UsuariosDAO {

	void registrarUsuario(Usuario usuario);
	List<Usuario> obtenerUsuarios();
//	boolean identificarUsuario(String email, String contraseña);
	void borrarUsuarios(int id);
	Usuario obtenerUsuarioPorId(int id);
	void guardarCambiosUsuario(Usuario usuario);
	
}
