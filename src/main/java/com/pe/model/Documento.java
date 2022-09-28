package com.pe.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "documentos")
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_documento;

	@Column
	private String nombre;

	@OneToMany(mappedBy = "documento") // referencia
	private Collection<Cliente> itemsCliente = new ArrayList<>();

	@OneToMany(mappedBy = "documento") // referencia
	private Collection<Trabajador> itemsTrabajador = new ArrayList<>();

	public Documento(Integer id_documento, String nombre) {
		super();
		this.id_documento = id_documento;
		this.nombre = nombre;
	}

	public Documento() {
		// TODO Auto-generated constructor stub
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

	public Collection<Cliente> getItemsCliente() {
		return itemsCliente;
	}

	public void setItemsCliente(Collection<Cliente> itemsCliente) {
		this.itemsCliente = itemsCliente;
	}

	public Collection<Trabajador> getItemsTrabajador() {
		return itemsTrabajador;
	}

	public void setItemsTrabajador(Collection<Trabajador> itemsTrabajador) {
		this.itemsTrabajador = itemsTrabajador;
	}

}
