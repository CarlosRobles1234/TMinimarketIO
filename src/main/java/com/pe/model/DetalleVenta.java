package com.pe.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "detalleventas")
public class DetalleVenta implements Serializable
{private static final long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id_detalleVenta;

@Column
private Integer cantidad;

@Column
private double precio;

 @ManyToOne
 @JoinColumn(name = "id_producto")
 private Producto producto;
 
 @ManyToOne
 @JoinColumn(name = "id_ComprobanteVenta")
 private ComprobanteVenta comprobanteVenta;


public DetalleVenta() {
	// TODO Auto-generated constructor stub
}

public DetalleVenta(Integer id_detalleVenta, Integer cantidad, double precio) {
	super();
	this.id_detalleVenta = id_detalleVenta;
	this.cantidad = cantidad;
	this.precio = precio;
}

public Integer getId_detalleVenta() {
	return id_detalleVenta;
}

public void setId_detalleVenta(Integer id_detalleVenta) {
	this.id_detalleVenta = id_detalleVenta;
}

public Integer getCantidad() {
	return cantidad;
}

public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public Producto getProducto() {
	return producto;
}

public void setProducto(Producto producto) {
	this.producto = producto;
}

public ComprobanteVenta getComprobanteVenta() {
	return comprobanteVenta;
}

public void setComprobanteVenta(ComprobanteVenta comprobanteVenta) {
	this.comprobanteVenta = comprobanteVenta;
}

}