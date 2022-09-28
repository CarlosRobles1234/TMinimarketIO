package com.pe.model;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_stock;

	@Column
	private Integer cantidad;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "id_tienda")
	private Tienda tienda;

	public Integer getId_stock() {
		return id_stock;
	}

	public Stock(Integer id_stock, Integer cantidad) {
		super();
		this.id_stock = id_stock;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public void setId_stock(Integer id_stock) {
		this.id_stock = id_stock;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
