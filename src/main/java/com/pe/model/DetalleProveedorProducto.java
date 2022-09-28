package com.pe.model;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name = "detalleproveedorproductos")
public class DetalleProveedorProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalleProveedorProducto;
	
	@Column
	private double precioCompra;
	 @ManyToOne
	    @JoinColumn(name = "id_proveedor")
	 private Proveedor proveedor;
	 
	 public DetalleProveedorProducto() {
		// TODO Auto-generated constructor stub
	}
	 @ManyToOne
	 @JoinColumn(name = "id_producto")
	 private Producto producto;
	 
	public DetalleProveedorProducto(Integer id_detalleProveedorProducto, double precioCompra) {
		super();
		this.id_detalleProveedorProducto = id_detalleProveedorProducto;
		this.precioCompra = precioCompra;
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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
