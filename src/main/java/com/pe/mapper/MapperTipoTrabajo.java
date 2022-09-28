package com.pe.mapper;

public class MapperTipoTrabajo {
	private Integer id_tipotrabajo;
	private String nombre;
	private String descripcion;

	public MapperTipoTrabajo() {
		// TODO Auto-generated constructor stub
	}

	public MapperTipoTrabajo(Integer id_tipotrabajo, String nombre, String descripcion) {
		super();
		this.id_tipotrabajo = id_tipotrabajo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId_tipotrabajo() {
		return id_tipotrabajo;
	}

	public void setId_tipotrabajo(Integer id_tipotrabajo) {
		this.id_tipotrabajo = id_tipotrabajo;
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

}
