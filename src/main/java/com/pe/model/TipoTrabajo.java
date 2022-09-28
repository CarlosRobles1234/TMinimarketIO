package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "tipostrabajos")
public class TipoTrabajo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipotrabajo;

	@Column
	private String nombre;

	@Column
	private String descripcion;

	public TipoTrabajo(Integer id_tipotrabajo, String nombre, String descripcion) {
		super();
		this.id_tipotrabajo = id_tipotrabajo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public TipoTrabajo() {
		// TODO Auto-generated constructor stub
	}

	@OneToMany(mappedBy = "tipoTrabajo") // referencia
	private Collection<Trabajador> itemsTrabajador = new ArrayList<>();

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

	public Collection<Trabajador> getItemsTrabajador() {
		return itemsTrabajador;
	}

	public void setItemsTrabajador(Collection<Trabajador> itemsTrabajador) {
		this.itemsTrabajador = itemsTrabajador;
	}

}
