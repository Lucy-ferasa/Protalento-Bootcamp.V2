package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos implements Entity {
	

	private Long id;
	private String titulo;
	private String codigo;
	private Date fechaCreacion;
	private Double precio;
	private Long stock;
	private Long marcaId;
	// private Marcas marca;
	// un articulo puede tener una marca (objeto)
	private Long categoriaId;
	//private Categorias categoria;

	
	// sobrecarga del constructor
	// dos constructores, uno tiene id y el otro no
	// si están desordenados, pueden tener los mismos atributos
	// el que no tiene el id no lo tiene porque al insertar un articulo en la base de
	// datos, esa generacion del id se hará de forma automática
	
		
	// hacia la db
	// no es para generar un registro
	public Articulos(String titulo, String codigo, Date fechaCreacion, Double precio, Long stock, Long marcaId,
			Long categoriaId) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.fechaCreacion = fechaCreacion;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}

	
	// desde la db
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Long stock,
			Long marcaId, Long categoriaId) {
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}

	//constructor 
	//alt+shift+s --> generate constructor using Fields
	
	// puede haber sobrecarga de metodos también
	// se pueden llamar igual
	// el retorno no cuenta
	// los parametros tendrían que ser diferentes

	public Articulos(Long id, String titulo, Double precio) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public Articulos() {
		
	}
	
	public Double getPrecio() {
		return this.precio;
	}

	public String getPrecio(String pattern) {
		//##,###.00
		return this.precio.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Long getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", categoriaId=" + categoriaId
				+ "]";
	}

	//get/set
	//toString


}
