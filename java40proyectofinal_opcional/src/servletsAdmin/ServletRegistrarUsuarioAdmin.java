package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.println("Se ejecuta el post del ServletRegistroUsuario");
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
		
		String expresionRegularNombre = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,20}";
		Pattern patternNombre = Pattern.compile(expresionRegularNombre);
		Matcher matcherNombre = patternNombre.matcher(nombre);
		
		if(matcherNombre.matches()) {
			System.out.println("nombre ok");
		}else {
			
			System.out.println("nombre no valido");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularCalle = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,20}";
		Pattern patternCalle = Pattern.compile(expresionRegularCalle);
		Matcher matcherCalle = patternCalle.matcher(calle);
		
		if(matcherCalle.matches()) {
			System.out.println("calle ok");
		}else {
			
			System.out.println("calle no valida");
			request.setAttribute("mensaje", "calle no valida");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularNumeracion = "[1-9]{1,20}";
		Pattern patternNumeracion = Pattern.compile(expresionRegularNumeracion);
		Matcher matcherNumeracion = patternNumeracion.matcher(numeracion);
		
		if(matcherNumeracion.matches()) {
			System.out.println("numeracion ok");
		}else {
			
			System.out.println("numeracion no valida");
			request.setAttribute("mensaje", "numeracion no valida");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularCp = "[1-9]{5,6}";
		Pattern patternCp = Pattern.compile(expresionRegularCp);
		Matcher matcherCp = patternCp.matcher(codigo_postal);
		
		if(matcherCp.matches()) {
			System.out.println("codigo postal ok");
		}else {
			
			System.out.println("codigo postal no valido");
			request.setAttribute("mensaje", "codigo postal no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularPoblacion = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{1,20}";
		Pattern patternPoblacion = Pattern.compile(expresionRegularPoblacion);
		Matcher matcherPoblacion = patternPoblacion.matcher(poblacion);
		
		if(matcherPoblacion.matches()) {
			System.out.println("poblacion ok");
		}else {
			
			System.out.println("poblacion no valido");
			request.setAttribute("mensaje", "poblacion no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularTelefono = "[0-9]{8,12}";
		Pattern patternTelefono = Pattern.compile(expresionRegularTelefono);
		Matcher matcherTelefono = patternTelefono.matcher(telefono);
		
		if(matcherTelefono.matches()) {
			System.out.println("telefono ok");
		}else {
			
			System.out.println("telefono no valido");
			request.setAttribute("mensaje", "telefono no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularEmail = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—0-9]{1,20}@[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—0-9]{1,20}\\.[a-z]{2,5}";
		Pattern patternEmail = Pattern.compile(expresionRegularEmail);
		Matcher matcherEmail = patternEmail.matcher(email);
		
		if(matcherEmail.matches()) {
			System.out.println("email ok");
		}else {
			
			System.out.println("email no valido");
			request.setAttribute("mensaje", "email no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
		
		String expresionRegularPoE = "[particularems]{1,10}";
		Pattern patternPoE = Pattern.compile(expresionRegularPoE);
		Matcher matcherPoE = patternPoE.matcher(particularoempresa);
		
		if(matcherPoE.matches()) {
			System.out.println("resultado ok");
		}else {
			
			System.out.println("particular o empresa no valido");
			request.setAttribute("mensaje", "particular o empresa no valido");
			request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
			return;
		}
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
