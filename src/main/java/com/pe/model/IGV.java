package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "igvs")
public class IGV implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_igv;

	@Column
	private double monto;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column
	private String estado;

	@OneToMany(mappedBy = "igv") // referencia
	private Collection<ComprobanteVenta> itemsIgv = new ArrayList<>();

	public IGV(Integer id_igv, double monto, Date fecha, String estado) {
		super();
		this.id_igv = id_igv;
		this.monto = monto;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Integer getId_igv() {
		return id_igv;
	}

	public void setId_igv(Integer id_igv) {
		this.id_igv = id_igv;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Collection<ComprobanteVenta> getItemsIgv() {
		return itemsIgv;
	}

	public void setItemsIgv(Collection<ComprobanteVenta> itemsIgv) {
		this.itemsIgv = itemsIgv;
	}

}
