package modelo;

import javax.servlet.http.Part;

public class Articulo {
	private String talla;
	private String genero;
	private String color;
	private String codigo;
	private String moda;
	private String provedor;
	private String procedencia;
	private Part imagenSubida;
	private String rutaImagen;
	private int id;

	public Articulo() {

	}

	public Articulo(String talla, String genero, String color, String codigo,
			String moda, String provedor, String procedencia, Part imagenSubida) {
		super();
		this.talla = talla;
		this.genero = genero;
		this.color = color;
		this.codigo = codigo;
		this.moda = moda;
		this.provedor = provedor;
		this.procedencia = procedencia;
		this.imagenSubida = imagenSubida;
	}

	
	public Part getImagenSubida() {
		return imagenSubida;
	}

	public void setImagenSubida(Part imagenSubida) {
		this.imagenSubida = imagenSubida;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModa() {
		return moda;
	}

	public void setModa(String moda) {
		this.moda = moda;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Articulo [talla=" + talla + ", genero=" + genero + ", color="
				+ color + ", codigo=" + codigo + ", moda=" + moda
				+ ", provedor=" + provedor + ", procedencia=" + procedencia
				+ ", imagenSubida=" + imagenSubida + ", rutaImagen="
				+ rutaImagen + ", id=" + id + "]";
	}

	

	
}
