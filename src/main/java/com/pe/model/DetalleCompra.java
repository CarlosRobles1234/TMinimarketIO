package com.pe.model;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name = "detallecompras")
public class DetalleCompra  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detallecompras;
	
	
	@Column
	private double precio;

	@Column
	private double cantidad;

	public DetalleCompra() {
		// TODO Auto-generated constructor stub
	}
	
	 @ManyToOne
	    @JoinColumn(name = "id_producto")
	private Producto producto  ;
	 

	    @ManyToOne
	    @JoinColumn(name = "id_ordenCompra")
		private OrdenCompra ordenCompra;



		public DetalleCompra(Integer id_detallecompras, double precio, double cantidad) {
			super();
			this.id_detallecompras = id_detallecompras;
			this.precio = precio;
			this.cantidad = cantidad;
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

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		public OrdenCompra getOrdenCompra() {
			return ordenCompra;
		}

		public void setOrdenCompra(OrdenCompra ordenCompra) {
			this.ordenCompra = ordenCompra;
		}

		public Integer getId_detallecompras() {
			return id_detallecompras;
		}

		public void setId_detallecompras(Integer id_detallecompras) {
			this.id_detallecompras = id_detallecompras;
		}

	    

	
}
