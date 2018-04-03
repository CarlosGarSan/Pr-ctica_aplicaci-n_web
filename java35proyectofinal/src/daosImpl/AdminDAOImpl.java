package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import daos.AdminDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuariosDAO;

public class AdminDAOImpl extends GenericDAO implements AdminDAO{

	public boolean identificarAdmin(String login, String pass) {

		boolean identificado = false;
		System.out.println("login: " + login + " - pass: " + pass);
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			ps.setString(1, login);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			if (rs.next()) {
				// Si ESTE IF SE CUMPLE ESO ES QUE HE OBTENIDO UN RESULTADO
				// DE BASE DE DATOS
				System.out.println("next");
				identificado = true;
			}
			System.out.println(identificado);
		} catch (SQLException e) {
			System.out.println("sql de identificacion tiene problemas");
			System.out.println(e.getMessage());
		}
		desconectar();

		return identificado;
	}
	
}
