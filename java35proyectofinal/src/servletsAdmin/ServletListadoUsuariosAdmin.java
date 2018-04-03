package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import daos.UsuariosDAO;

import daosImpl.UsuariosDAOImpl;


@WebServlet("/admin/ServletListadoUsuariosAdmin")
public class ServletListadoUsuariosAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("obteniendo usuarios para gestionarlos en administracion");
		UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
		request.setAttribute("usuarios", usuariosDAO.obtenerUsuarios());
		request.getRequestDispatcher("gestionUsuarios.jsp").forward(request, response);
	}

}
