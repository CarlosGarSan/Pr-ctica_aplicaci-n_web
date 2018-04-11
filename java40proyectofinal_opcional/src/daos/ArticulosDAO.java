package daos;

import java.util.List;

import modelo.Articulo;

public interface ArticulosDAO {

	void registrarArticulo(Articulo articulo);

	List<Articulo> obtenerArticulos();

	void borrarArticulos(int id);

	Articulo obtenerArticuloPorId(int id);

	void guardarCambiosArticulo(Articulo articulo);
	
}
