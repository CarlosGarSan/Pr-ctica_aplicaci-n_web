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

@WebServlet("/admin/ServletGuardarCambiosArticulo")
public class ServletGuardarCambiosArticulo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String talla = request.getParameter("campoTalla");
		String genero = request.getParameter("campoGenero");
		String color = request.getParameter("campoColor");
		String codigo = request.getParameter("campoCodigo");
		String moda = request.getParameter("campoModa");
		String provedor = request.getParameter("campoProvedor");
		String procedencia = request.getParameter("campoProcedencia");

		String id = request.getParameter("campoId");

		// Ahora deberiamos validar todos los datos
		//
		// fin parte validacion

		Articulo articulo = new Articulo(talla, genero, color, codigo, moda,
				provedor, procedencia);
		articulo.setId(Integer.parseInt(id));

		ArticulosDAO articulosDAO = new ArticulosDAOImpl();
		articulosDAO.guardarCambiosArticulo(articulo);

		request.getRequestDispatcher("ServletListadoArticulosAdmin").forward(
				request, response);

	}

}
