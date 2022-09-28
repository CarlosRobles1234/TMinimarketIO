package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "trabajadores")
public class Trabajador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_trabajador;

	@Column
	private String nombre;

	@Column
	private Integer telefono;

	@Column
	private String Direccion;

	@OneToMany(mappedBy = "trabajador")
	private Collection<Merma> itemsMerma = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "id_documento", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_documento) references documentos(id_documento)"))
	private Documento documento;

	public Trabajador() {
	}

	@OneToMany(mappedBy = "trabajador")
	private Collection<ComprobanteVenta> itemsComprobanteVenta = new ArrayList<>();

	public Trabajador(Integer id_trabajador, String nombre, Integer telefono, String direccion) {
		super();
		this.id_trabajador = id_trabajador;
		this.nombre = nombre;
		this.telefono = telefono;
		Direccion = direccion;
	}

	@ManyToOne
	@JoinColumn(name = "id_tipotrabajo", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_tipotrabajo) references tipostrabajos(id_tipotrabajo)"))
	private TipoTrabajo tipoTrabajo;

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

	public Collection<ComprobanteVenta> getItemsComprobanteVenta() {
		return itemsComprobanteVenta;
	}

	public void setItemsComprobanteVenta(Collection<ComprobanteVenta> itemsComprobanteVenta) {
		this.itemsComprobanteVenta = itemsComprobanteVenta;
	}

	public Collection<Merma> getItemsMerma() {
		return itemsMerma;
	}

	public void setItemsMerma(Collection<Merma> itemsMerma) {
		this.itemsMerma = itemsMerma;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

}
