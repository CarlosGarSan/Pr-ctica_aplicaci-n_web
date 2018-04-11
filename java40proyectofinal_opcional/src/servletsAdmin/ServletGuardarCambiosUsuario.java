package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;

@WebServlet("/admin/ServletGuardarCambiosUsuario")
public class ServletGuardarCambiosUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numeracion = request.getParameter("campoNumeracion");
		String codigo_postal = request.getParameter("campoCodigo_postal");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particularoempresa = request
				.getParameter("campoParticularoempresa");

		String id = request.getParameter("campoId");

		// Ahora deberiamos validar todos los datos
		//
		// fin parte validacion

		Usuario usuario = new Usuario(nombre, calle, numeracion, codigo_postal,
				poblacion, telefono, email, particularoempresa);
		usuario.setId(Integer.parseInt(id));

		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.guardarCambiosUsuario(usuario);

		request.getRequestDispatcher("ServletListadoUsuariosAdmin").forward(
				request, response);
	}

}
