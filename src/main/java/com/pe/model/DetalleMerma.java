package com.pe.model;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name = "detallemermas")
public class DetalleMerma implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalleMerma;
	
	@Column
	private Integer cantidad;

	@Column
	private String descripcion;
	
	@ManyToOne
	 @JoinColumn(name = "id_producto")
	 private Producto producto;
	
	 @ManyToOne
	 @JoinColumn(name = "id_merma")
	 private Merma merma;
	
	public DetalleMerma() {
		// TODO Auto-generated constructor stub
	}

	public DetalleMerma(Integer id_detalleMerma, Integer cantidad, String descripcion) {
		super();
		this.id_detalleMerma = id_detalleMerma;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	public Integer getId_detalleMerma() {
		return id_detalleMerma;
	}

	public void setId_detalleMerma(Integer id_detalleMerma) {
		this.id_detalleMerma = id_detalleMerma;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Merma getMerma() {
		return merma;
	}

	public void setMerma(Merma merma) {
		this.merma = merma;
	}

	
	
}
