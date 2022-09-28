package com.pe.model;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "tiendas")
public class Tienda implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tienda;

	@Column
	private String nombre;

	@OneToMany(mappedBy = "tienda")
	Set<Stock> itemsStock;
	
	public Tienda(Integer id_tienda, String nombre) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
	}
public Tienda() {
	// TODO Auto-generated constructor stub
}
	public Integer getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(Integer id_tienda) {
		this.id_tienda = id_tienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Stock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(Set<Stock> itemsStock) {
		this.itemsStock = itemsStock;
	}

}
