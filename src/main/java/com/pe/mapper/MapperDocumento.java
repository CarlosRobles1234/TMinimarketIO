package com.pe.mapper;

public class MapperDocumento {

	private Integer id_documento;
	private String nombre;
	
	public MapperDocumento() {
		// TODO Auto-generated constructor stub
	}
	
	public MapperDocumento(Integer id_documento, String nombre) {
		super();
		this.id_documento = id_documento;
		this.nombre = nombre;
	}

	public Integer getId_documento() {
		return id_documento;
	}

	public void setId_documento(Integer id_documento) {
		this.id_documento = id_documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
