package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;

	@Column
	private String nombre;

	@Column
	private String descripcion;

	@Column
	private double precioVenta;

	@OneToMany(mappedBy = "producto")
	Set<DetalleCompra> itemsDetalleCompra;

	// marca
	@ManyToOne
	@JoinColumn(name ="id_marca", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition 
			
			= "foreign key(id_marca) references marcas(id_marca)"))
	private Marca marca;
	//tienda
	@OneToMany(mappedBy = "producto")
	Set<Stock> itemsStock;
	
	//merma
	
	@OneToMany(mappedBy = "producto")
	Set<DetalleMerma> itemsDetalleMerma;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	//DetalleProveedorProducto
	@OneToMany(mappedBy = "producto")
	Set<DetalleProveedorProducto> itemsDetalleProveedorProducto;
	//detalleVenta
	
	@OneToMany(mappedBy = "producto")
	Set<DetalleVenta> itemsDetalleVenta;

	public Producto(Integer id_producto, String nombre, String descripcion, double precioVenta) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
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

	public Set<DetalleCompra> getItemsDetalleCompra() {
		return itemsDetalleCompra;
	}

	public void setItemsDetalleCompra(Set<DetalleCompra> itemsDetalleCompra) {
		this.itemsDetalleCompra = itemsDetalleCompra;
	}


	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Set<DetalleProveedorProducto> getItemsDetalleProveedorProducto() {
		return itemsDetalleProveedorProducto;
	}

	public void setItemsDetalleProveedorProducto(Set<DetalleProveedorProducto> itemsDetalleProveedorProducto) {
		this.itemsDetalleProveedorProducto = itemsDetalleProveedorProducto;
	}

	public Set<DetalleMerma> getItemsDetalleMerma() {
		return itemsDetalleMerma;
	}

	public void setItemsDetalleMerma(Set<DetalleMerma> itemsDetalleMerma) {
		this.itemsDetalleMerma = itemsDetalleMerma;
	}

	public Set<DetalleVenta> getItemsDetalleVenta() {
		return itemsDetalleVenta;
	}

	public void setItemsDetalleVenta(Set<DetalleVenta> itemsDetalleVenta) {
		this.itemsDetalleVenta = itemsDetalleVenta;
	}

	public Set<Stock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(Set<Stock> itemsStock) {
		this.itemsStock = itemsStock;
	}

}