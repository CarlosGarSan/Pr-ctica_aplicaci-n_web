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


@WebServlet("/admin/ServletRegistrarUsuarioAdmin")
public class ServletRegistrarUsuarioAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Se ejecuta el post del ServletRegistroCliente");
		// vamos a recoger lo que ha introducido el usuario en el formulario:
		// campoTitulo es el name del input del que quiero coger la informacion
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numeracion = request.getParameter("campoNumeracion");
		String codigo_postal = request.getParameter("campoCodigo_postal");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particularoempresa = request.getParameter("campoParticularoempresa");

		// parte de validacion de datos
		// ...
		// fin parte validacion de datos
		Usuario nuevoUsuario = new Usuario(nombre, calle, 
				numeracion, codigo_postal, poblacion, telefono, email, particularoempresa);
		// Ahora le damos un nuevo anuncio a un dao para que lo registre:
		System.out.println("vamos a registrar: " + nuevoUsuario.toString());
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		usuariosDAO.registrarUsuario(nuevoUsuario);
		
		request.getRequestDispatcher("registroUsuarioOk.jsp").forward(request,
				response);
	}
	
}
