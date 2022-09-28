package com.pe.mapper;

public class MapperTrabajador {
	private Integer id_trabajador;
	private String nombre;
	private Integer telefono;
	private String Direccion;
	private Integer id_tipotrabajo;
	private String nombreTipoTrabajo;
	private Integer id_documento;
	private String nombreDocumento;

	public MapperTrabajador() {
		// TODO Auto-generated constructor stub
	}

	public MapperTrabajador(Integer id_trabajador, String nombre, Integer telefono, String direccion,
			Integer id_tipotrabajo, String nombreTipoTrabajo, Integer id_documento, String nombreDocumento) {
		super();
		this.id_trabajador = id_trabajador;
		this.nombre = nombre;
		this.telefono = telefono;
		Direccion = direccion;
		this.id_tipotrabajo = id_tipotrabajo;
		this.nombreTipoTrabajo = nombreTipoTrabajo;
		this.id_documento = id_documento;
		this.nombreDocumento = nombreDocumento;
	}

	public Integer getId_trabajador() {
		return id_trabajador;
	}

	public void setId_trabajador(Integer id_trabajador) {
		this.id_trabajador = id_trabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Integer getId_tipotrabajo() {
		return id_tipotrabajo;
	}

	public void setId_tipotrabajo(Integer id_tipotrabajo) {
		this.id_tipotrabajo = id_tipotrabajo;
	}

	public String getNombreTipoTrabajo() {
		return nombreTipoTrabajo;
	}

	public void setNombreTipoTrabajo(String nombreTipoTrabajo) {
		this.nombreTipoTrabajo = nombreTipoTrabajo;
	}

	public Integer getId_documento() {
		return id_documento;
	}

	public void setId_documento(Integer id_documento) {
		this.id_documento = id_documento;
	}

	public String getNombreDocumento() {
		return nombreDocumento;
	}

	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

}
