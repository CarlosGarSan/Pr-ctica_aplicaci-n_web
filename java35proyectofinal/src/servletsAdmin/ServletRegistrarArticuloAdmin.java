package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Articulo;
import daos.ArticulosDAO;
import daosImpl.ArticulosDAOImpl;


@WebServlet("/admin/ServletRegistrarArticuloAdmin")
public class ServletRegistrarArticuloAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("admin")==null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		System.out.println("Se ejecuta el post");
		// vamos a recoger lo que ha introducido el usuario en el formulario:
		// campoTitulo es el name del input del que quiero coger la informacion
		String talla = request.getParameter("campoTalla");
		String genero = request.getParameter("campoGenero");
		String color = request.getParameter("campoColor");
		String codigo = request.getParameter("campoCodigo");
		String moda = request.getParameter("campoModa");
		String provedor = request.getParameter("campoProvedor");
		String procedencia = request.getParameter("campoProcedencia");
		
		//Parte de validaciÛn de datos
		
		String expresionRegularTalla = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern = Pattern.compile(expresionRegularTalla);
		Matcher matcher = pattern.matcher(talla);
		
		if(matcher.matches()) {
			System.out.println("talla ok");
		}else {
			
			System.out.println("talla no valida");
			request.setAttribute("mensaje", "talla no valida");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularGenero = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern1 = Pattern.compile(expresionRegularGenero);
		Matcher matcher1 = pattern1.matcher(genero);
		
		if(matcher.matches()) {
			System.out.println("genero ok");
		}else {
			
			System.out.println("genero no valido");
			request.setAttribute("mensaje", "genero no valido");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularColor = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern2 = Pattern.compile(expresionRegularColor);
		Matcher matcher2 = pattern2.matcher(talla);
		
		if(matcher.matches()) {
			System.out.println("color ok");
		}else {
			
			System.out.println("color no valido");
			request.setAttribute("mensaje", "color no valido");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularCodigo = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern3 = Pattern.compile(expresionRegularCodigo);
		Matcher matcher3 = pattern3.matcher(codigo);
		
		if(matcher.matches()) {
			System.out.println("codigo ok");
		}else {
			
			System.out.println("codigo no valido");
			request.setAttribute("mensaje", "codigo no valido");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularModa = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern4 = Pattern.compile(expresionRegularModa);
		Matcher matcher4 = pattern4.matcher(moda);
		
		if(matcher.matches()) {
			System.out.println("moda ok");
		}else {
			
			System.out.println("moda no valida");
			request.setAttribute("mensaje", "moda no valida");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularProvedor = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern5 = Pattern.compile(expresionRegularProvedor);
		Matcher matcher5 = pattern5.matcher(provedor);
		
		if(matcher.matches()) {
			System.out.println("provedor ok");
		}else {
			
			System.out.println("provedor no valido");
			request.setAttribute("mensaje", "proovedor no valido");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularProcedencia = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,3}";
		Pattern pattern6 = Pattern.compile(expresionRegularProcedencia);
		Matcher matcher6 = pattern6.matcher(procedencia);
		
		if(matcher.matches()) {
			System.out.println("procedencia ok");
		}else {
			
			System.out.println("procedencia no valida");
			request.setAttribute("mensaje", "procedencia no valida");
			request.getRequestDispatcher("registrarArticulo.jsp").forward(request, response);
			return;
		}
		
		//Fin validaciÛn de datos
		
		Articulo nuevoArticulo = new Articulo(talla, genero,
				color, codigo, moda, provedor, procedencia);
		//Ahora le damos un nuevo anuncio a un dao para que lo registre:
		System.out.println("vamos a registrar: " +nuevoArticulo.toString());
		ArticulosDAO articulosDAO = new ArticulosDAOImpl();
		articulosDAO.registrarArticulo(nuevoArticulo);
		
		//desde un servlet no deberÌa mostrarle nada al usuario
		//para eso tenemos las jsp que son las encargadas de realizar
		//la "vista" de la aplicacion
		
		//asi digo al server que siga la ejecucion en la siguiente jsp
		
		request.getRequestDispatcher("registroArticuloOk.jsp").forward(request, response);
	}

}
