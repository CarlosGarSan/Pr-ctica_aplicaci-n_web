package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;


@WebServlet("/ServletListarUsuarioAdmin")
public class ServletListarUsuarioAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosDAO daoUsuario = new UsuariosDAOImpl();
		// asi continuo en listadoAnuncios.jsp al cual le tengo que dar
		// los anuncios que me de el dao.
		request.setAttribute("usuarios", daoUsuario.obtenerUsuarios());
		request.getRequestDispatcher("listadoUsuarios.jsp").forward(request,
				response);
	}

}
