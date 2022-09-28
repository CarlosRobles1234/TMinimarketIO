package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "mermas")
public class Merma implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_merma;

	@Column
	private Date fecha;

	@OneToMany(mappedBy = "merma")
	Set<DetalleMerma> itemsDetalleMerma;

	public Merma() {
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
	@JoinColumn(name = "id_trabajador", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition 
			= "foreign key(id_trabajador) references trabajadores(id_trabajador)"))
	private Trabajador trabajador;	
	
	public Merma(Integer id_merma, Date fecha) {
		super();
		this.id_merma = id_merma;
		this.fecha = fecha;
	}

	public Integer getId_merma() {
		return id_merma;
	}

	public void setId_merma(Integer id_merma) {
		this.id_merma = id_merma;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set<DetalleMerma> getItemsDetalleMerma() {
		return itemsDetalleMerma;
	}

	public void setItemsDetalleMerma(Set<DetalleMerma> itemsDetalleMerma) {
		this.itemsDetalleMerma = itemsDetalleMerma;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

}
