package com.pe.mapper;

public class MapperDetalleCompra {

	private Integer id_detallecompras;
	private double precio;
	private double cantidad;
	private Integer id_ordenCompra;
	private Integer id_producto;

	public MapperDetalleCompra() {
		// TODO Auto-generated constructor stub
	}

	public MapperDetalleCompra(Integer id_detallecompras, double precio, double cantidad, Integer id_ordenCompra,
			Integer id_producto) {
		super();
		this.id_detallecompras = id_detallecompras;
		this.precio = precio;
		this.cantidad = cantidad;
		this.id_ordenCompra = id_ordenCompra;
		this.id_producto = id_producto;
	}

	public Integer getId_detallecompras() {
		return id_detallecompras;
	}

	public void setId_detallecompras(Integer id_detallecompras) {
		this.id_detallecompras = id_detallecompras;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getId_ordenCompra() {
		return id_ordenCompra;
	}

	public void setId_ordenCompra(Integer id_ordenCompra) {
		this.id_ordenCompra = id_ordenCompra;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

}
