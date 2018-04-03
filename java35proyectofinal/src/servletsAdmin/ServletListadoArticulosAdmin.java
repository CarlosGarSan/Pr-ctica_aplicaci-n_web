package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ArticulosDAO;

import daosImpl.ArticulosDAOImpl;


@WebServlet("/admin/ServletListadoArticulosAdmin")
public class ServletListadoArticulosAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("obteniendo articulos para gestionarlos en administracion");
		ArticulosDAO articulosDAO = new ArticulosDAOImpl();
		request.setAttribute("articulos", articulosDAO.obtenerArticulos());
		request.getRequestDispatcher("gestionArticulos.jsp").forward(request, response);
	}

}
