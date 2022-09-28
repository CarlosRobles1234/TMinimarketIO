package com.pe.mapper;

public class MapperCliente {

	private Integer id_cliente;
	private String nombre;
	private Integer telefono;
	private String direccion;
	private String correo;
	private Integer id_documento;
	private String nombredocumento;
	private String numero_documento;

	public MapperCliente() {
	}

	public MapperCliente(Integer id_cliente, String nombre, Integer telefono, String direccion, String correo,
			Integer id_documento, String nombredocumento, String numero_documento) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.id_documento = id_documento;
		this.nombredocumento = nombredocumento;
		this.numero_documento = numero_documento;
		
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
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
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getId_documento() {
		return id_documento;
	}

	public void setId_documento(Integer id_documento) {
		this.id_documento = id_documento;
	}

	public String getNombredocumento() {
		return nombredocumento;
	}

	public void setNombredocumento(String nombredocumento) {
		this.nombredocumento = nombredocumento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

}
