package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "marcas")
public class Marca implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_marca;

	@Column
	private String nombre;

	
	public Marca() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy="marca") //referencia
	private Collection<Producto> itemsProductos=new ArrayList<>();
	
	public Marca(Integer id_marca, String nombre) {
		super();
		this.id_marca = id_marca;
		this.nombre = nombre;
	}

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Producto> getItemsProductos() {
		return itemsProductos;
	}

	public void setItemsProductos(Collection<Producto> itemsProductos) {
		this.itemsProductos = itemsProductos;
	}


	
	
}
