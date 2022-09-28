package com.pe.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.pe.mapper.MapperDetalleProveedorProducto;
import com.pe.mapper.MapperUtilDetalleProveedorProducto;
import com.pe.model.*;
import com.pe.service.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/detalleproveedorproducto")
public class DetalleProveedorProductoRestController {

	/*@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	private ProductoService productoService;
	*/
	@Autowired
	private DetalleProveedorProductoService detalleProveedorProductoService;
	
	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<DetalleProveedorProducto>itemsDetalleProveedorProducto=	
				detalleProveedorProductoService.findAll();
		
		Collection<MapperDetalleProveedorProducto>
		itemsDetalleProveedorProductoMapper =
		MapperUtilDetalleProveedorProducto.convertDetalleProveedorProducto(itemsDetalleProveedorProducto);
		
		if (itemsDetalleProveedorProducto.isEmpty())
			return new ResponseEntity<>(itemsDetalleProveedorProducto, HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<>(itemsDetalleProveedorProductoMapper, HttpStatus.OK);
	}
		/*
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody DetalleProveedorProducto detalleProveedorProducto) {
		
		detalleProveedorProducto.setProveedor(proveedorService.findById(detalleProveedorProducto.getProveedor().getId_proveedor()));
		detalleProveedorProducto.setProducto(productoService.findById(detalleProveedorProducto.getProducto().getId_producto()));	
		detalleProveedorProductoService.insert(detalleProveedorProducto);
		
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}
	
	@PutMapping("/editar/{id_detalleProveedorProducto}")
	
	public ResponseEntity<?> editar(@PathVariable Integer id_detalleProveedorProducto, @RequestBody DetalleProveedorProducto newDetalleProveedorProducto) {
		
		DetalleProveedorProducto detalleProveedorProductoDB = detalleProveedorProductoService.findById(id_detalleProveedorProducto);
		if (detalleProveedorProductoDB != null) {
		
			detalleProveedorProductoDB.setPrecioCompra(newDetalleProveedorProducto.getPrecioCompra());
			detalleProveedorProductoDB.setProducto(productoService.findById(newDetalleProveedorProducto.getProducto().getId_producto()));
			detalleProveedorProductoDB.setProveedor(proveedorService.findById(newDetalleProveedorProducto.getProveedor().getId_proveedor()));
			
			detalleProveedorProductoService.update(detalleProveedorProductoDB);
			 return new ResponseEntity<>("La estudiante con el cliente " + id_detalleProveedorProducto + " se actualizó correctamente.",HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
		}
	*/
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
