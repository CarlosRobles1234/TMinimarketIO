package com.pe.mapper;

public class MarcaMapper {

	private Integer id_marca;

	private String nombre;

	public MarcaMapper() {
	}

	public MarcaMapper(Integer id_marca, String nombre) {
		super();
		this.id_marca = id_marca;
		this.nombre = nombre;
	}

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
