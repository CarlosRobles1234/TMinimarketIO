package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	@Column
	private String nombre;

	@Column
	private Integer telefono;
	@Column
	private String direccion;
	@Column
	private String correo;

	@Column
	private String password;

	@Column
	private String numero_documento;

	public Cliente() {
	}
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "id_documento", nullable = false, unique = true,
	 * foreignKey = @ForeignKey(foreignKeyDefinition =
	 * "foreign key(id_documento) references documentos(id_documento)")) private
	 * Documento documento;
	 */

	@ManyToOne
	@JoinColumn(name = "id_documento", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_documento) references documentos(id_documento)"))
	private Documento documento;

	@OneToMany(mappedBy = "cliente") // referencia
	private Collection<ComprobanteVenta> itemsComprobanteVenta = new ArrayList<>();

	public Cliente(Integer id_cliente, String nombre, Integer telefono, String direccion, String correo,
			String password, String numero_documento) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.password = password;
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

	public Collection<ComprobanteVenta> getItemsComprobanteVenta() {
		return itemsComprobanteVenta;
	}

	public void setItemsComprobanteVenta(Collection<ComprobanteVenta> itemsComprobanteVenta) {
		this.itemsComprobanteVenta = itemsComprobanteVenta;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

}