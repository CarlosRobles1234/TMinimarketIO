package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "comprobanteventas")
public class ComprobanteVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ComprobanteVenta;

	@Column
	private String tipoComprobante;
	@Column
	private double subTotal;
	@Column
	private double Total;

	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references clientes(id_cliente)"))
	private Cliente cliente;
	
	public ComprobanteVenta() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	@JoinColumn(name="id_igv",nullable=false,foreignKey=@ForeignKey
(foreignKeyDefinition="foreign key(id_igv) references igvs(id_igv)"))
	private IGV igv;
	
/////
	@ManyToOne
	@JoinColumn(name = "id_trabajador", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_trabajador) references trabajadores(id_trabajador)"))
	private Trabajador trabajador;

	public ComprobanteVenta(Integer id_ComprobanteVenta, String tipoComprobante, double subTotal, double total) {
		super();
		this.id_ComprobanteVenta = id_ComprobanteVenta;
		this.tipoComprobante = tipoComprobante;
		this.subTotal = subTotal;
		Total = total;
	}

	@OneToMany(mappedBy = "comprobanteVenta")
	Set<DetalleVenta> itemsDetalleVenta;

	public Integer getId_ComprobanteVenta() {
		return id_ComprobanteVenta;
	}

	public void setId_ComprobanteVenta(Integer id_ComprobanteVenta) {
		this.id_ComprobanteVenta = id_ComprobanteVenta;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Set<DetalleVenta> getItemsDetalleVenta() {
		return itemsDetalleVenta;
	}

	public void setItemsDetalleVenta(Set<DetalleVenta> itemsDetalleVenta) {
		this.itemsDetalleVenta = itemsDetalleVenta;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public IGV getIgv() {
		return igv;
	}

	public void setIgv(IGV igv) {
		this.igv = igv;
	}

}