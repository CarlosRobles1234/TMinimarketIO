package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "ordenes_compras")
public class OrdenCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ordenCompra;
	@Temporal(TemporalType.DATE)
	private Date fechaPerdido;
	@Column
	private String observacion;
	@Column
	private double costo;
	@Temporal(TemporalType.DATE)
	private Date fechaEntrada;

	@OneToMany(mappedBy = "ordenCompra")
	Set<DetalleCompra> itemsDetalleCompra;

	@ManyToOne
	@JoinColumn(name = "id_proveedor", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_proveedor) references proveedores(id_proveedor)"))
	private Proveedor proveedor;
	
	public OrdenCompra() {
		// TODO Auto-generated constructor stub
	}
	
	public OrdenCompra(Integer id_ordenCompra, Date fechaPerdido, String observacion, double costo, Date fechaEntrada) {
		super();
		this.id_ordenCompra = id_ordenCompra;
		this.fechaPerdido = fechaPerdido;
		this.observacion = observacion;
		this.costo = costo;
		this.fechaEntrada = fechaEntrada;
	}

	public Integer getId_ordenCompra() {
		return id_ordenCompra;
	}

	public void setId_ordenCompra(Integer id_ordenCompra) {
		this.id_ordenCompra = id_ordenCompra;
	}

	public Set<DetalleCompra> getItemsDetalleCompra() {
		return itemsDetalleCompra;
	}

	public void setItemsDetalleCompra(Set<DetalleCompra> itemsDetalleCompra) {
		this.itemsDetalleCompra = itemsDetalleCompra;
	}

	public Date getFechaPerdido() {
		return fechaPerdido;
	}

	public void setFechaPerdido(Date fechaPerdido) {
		this.fechaPerdido = fechaPerdido;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}
