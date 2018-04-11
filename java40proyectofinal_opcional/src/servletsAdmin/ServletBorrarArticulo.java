package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ArticulosDAO;

import daosImpl.ArticulosDAOImpl;


@WebServlet("/admin/ServletBorrarArticulo")
public class ServletBorrarArticulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ArticulosDAO anunciosDAO = new ArticulosDAOImpl();
		System.out.println("borrar anuncio de id: " +id );
		
		anunciosDAO.borrarArticulos(id);
		
		request.getRequestDispatcher("ServletListadoArticulosAdmin").forward(request, response);
	}

}
