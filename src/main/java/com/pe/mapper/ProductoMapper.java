package com.pe.mapper;

public class ProductoMapper {
	private Integer id_producto;
	private String nombre;
	private String descripcion;
	private double precioVenta;
	private Integer id_marca;
	private String nombreMarca;

	public ProductoMapper() {
		// TODO Auto-generated constructor stub
	}

	public ProductoMapper(Integer id_producto, String nombre, String descripcion, double precioVenta, Integer id_marca,
			String nombreMarca) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.id_marca = id_marca;
		this.nombreMarca = nombreMarca;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

}
