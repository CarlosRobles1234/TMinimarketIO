package com.pe.mapper;

import java.util.Date;

public class MapperOrdenCompra {
	private Integer id_ordenCompra;
	private Date fechaPerdido;
	private String observacion;
	private double costo;
	private Date fechaEntrada;

	public MapperOrdenCompra() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_ordenCompra() {
		return id_ordenCompra;
	}

	public void setId_ordenCompra(Integer id_ordenCompra) {
		this.id_ordenCompra = id_ordenCompra;
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
}
