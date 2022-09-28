package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_proveedor;
	@Column
	private String noombre;
	@Column
	private String direccion;
	@Column
	private Integer telefono;
	@Column
	private Integer ruc;
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy="proveedor") 
	private  Collection< OrdenCompra>itemsOrdenCompra = new ArrayList<>();
	
	@OneToMany(mappedBy = "proveedor")
	Set<DetalleProveedorProducto> itemsDetalleProveedorProducto;
	
	public Proveedor(Integer id_proveedor, String noombre, String direccion, Integer telefono, Integer ruc) {
		super();
		this.id_proveedor = id_proveedor;
		this.noombre = noombre;
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
	public String getNoombre() {
		return noombre;
	}
	public void setNoombre(String noombre) {
		this.noombre = noombre;
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
	public Collection<OrdenCompra> getItemsOrdenCompra() {
		return itemsOrdenCompra;
	}
	public void setItemsOrdenCompra(Collection<OrdenCompra> itemsOrdenCompra) {
		this.itemsOrdenCompra = itemsOrdenCompra;
	}
	public Set<DetalleProveedorProducto> getItemsDetalleProveedorProducto() {
		return itemsDetalleProveedorProducto;
	}
	public void setItemsDetalleProveedorProducto(Set<DetalleProveedorProducto> itemsDetalleProveedorProducto) {
		this.itemsDetalleProveedorProducto = itemsDetalleProveedorProducto;
	}
	
	
	
}
