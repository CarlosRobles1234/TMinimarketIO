package com.pe.mapper;

public class MapperDetalleProveedorProducto {

	private Integer id_detalleProveedorProducto;
	private double precioCompra;
	private Integer id_proveedor;
	private Integer id_producto;

	public MapperDetalleProveedorProducto() {
		// TODO Auto-generated constructor stub
	}

	public MapperDetalleProveedorProducto(Integer id_detalleProveedorProducto, double precioCompra,
			Integer id_proveedor, Integer id_producto) {
		super();
		this.id_detalleProveedorProducto = id_detalleProveedorProducto;
		this.precioCompra = precioCompra;
		this.id_proveedor = id_proveedor;
		this.id_producto = id_producto;
	}

	public Integer getId_detalleProveedorProducto() {
		return id_detalleProveedorProducto;
	}

	public void setId_detalleProveedorProducto(Integer id_detalleProveedorProducto) {
		this.id_detalleProveedorProducto = id_detalleProveedorProducto;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Integer getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

}
