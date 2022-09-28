package com.pe.mapper;

public class MapperProveedor {
	private Integer id_proveedor;
	private String nombre;
	private String direccion;
	private Integer telefono;
	private Integer ruc;

	public MapperProveedor() {
		// TODO Auto-generated constructor stub
	}

	public MapperProveedor(Integer id_proveedor, String nombre, String direccion, Integer telefono, Integer ruc) {
		super();
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ruc = ruc;
	}

	public Integer getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getRuc() {
		return ruc;
	}

	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}



}
