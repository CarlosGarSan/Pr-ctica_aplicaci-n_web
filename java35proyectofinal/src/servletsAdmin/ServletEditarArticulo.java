package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Articulo;

import daos.ArticulosDAO;

import daosImpl.ArticulosDAOImpl;

@WebServlet("/admin/ServletEditarArticulo")
public class ServletEditarArticulo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ArticulosDAO articulosDAO = new ArticulosDAOImpl();

		Articulo articuloAeditar = articulosDAO.obtenerArticuloPorId(id);
		request.setAttribute("articuloAeditar", articuloAeditar);
		request.getRequestDispatcher("editarArticulo.jsp").forward(request,
				response);

	}

}
