package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import daos.AdminDAO;
import daos.UsuariosDAO;
import daosImpl.AdminDAOImpl;
import daosImpl.UsuariosDAOImpl;


@WebServlet("/admin/ServletIdentificacionAdmin")
public class ServletIdentificacionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el servlet de identificacion de admin");
		String login = request.getParameter("campoLogin");
		String pass = request.getParameter("campoPass");
		AdminDAO adminDAO = new AdminDAOImpl();
		if (adminDAO.identificarAdmin(login, pass)) {
			request.getSession().setAttribute("admin", "ok");
			System.out.println("admin");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			System.out.println("noadmin");
			//falta indicar mensaje de email o pass incorrectos
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

}
