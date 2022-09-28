package com.pe.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.pe.mapper.*;
import com.pe.model.*;
import com.pe.service.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/detallecompra")
public class DetalleCompraRestController {

	@Autowired
	private ProductoService productoService;

	@Autowired
	private OrdenCompraService ordenCompraService;

	@Autowired
	private DetalleCompraService detalleCompraService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {

		Collection<DetalleCompra> itemsDetalleCompra = detalleCompraService.findAll();
		Collection<MapperDetalleCompra> itemsProductoMapper = MapperUtilDetalleCompra
				.convertDetalleCompra(itemsDetalleCompra);

		if (itemsDetalleCompra.isEmpty())
			return new ResponseEntity<>(itemsDetalleCompra, HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(itemsProductoMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody DetalleCompra detalleCompra) {
		detalleCompra.setProducto(productoService.findById(detalleCompra.getProducto().getId_producto()));
		detalleCompra.setOrdenCompra(ordenCompraService.findById(detalleCompra.getOrdenCompra().getId_ordenCompra()));
		detalleCompraService.insert(detalleCompra);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}

	@PutMapping("/editar/{id_detallecompras}")
	public ResponseEntity<?> editar(@PathVariable Integer id_detallecompras,
			@RequestBody DetalleCompra newdetalleCompra) {
		DetalleCompra detalleCompraDB = detalleCompraService.findById(id_detallecompras);

		if (detalleCompraDB != null) {

			detalleCompraDB.setCantidad(newdetalleCompra.getCantidad());
			detalleCompraDB.setPrecio(newdetalleCompra.getPrecio());
			detalleCompraDB.setProducto(productoService.findById(newdetalleCompra.getProducto().getId_producto()));
			detalleCompraDB
					.setOrdenCompra(ordenCompraService.findById(newdetalleCompra.getOrdenCompra().getId_ordenCompra()));

			detalleCompraService.update(detalleCompraDB);
			return new ResponseEntity<>(
					"La estudiante con el cliente " + id_detallecompras + " se actualizó correctamente.",
					HttpStatus.OK);

		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/buscar/{id_detallecompras}")
	public ResponseEntity<?> buscar(@PathVariable Integer id_detallecompras) {

		DetalleCompra itemsDetalleCompra = detalleCompraService.findById(id_detallecompras);
		MapperDetalleCompra mapperDetalleCompra = MapperUtilDetalleCompra.convertDetalleCompraList(itemsDetalleCompra);

		if (itemsDetalleCompra != null) {
			return new ResponseEntity<>(mapperDetalleCompra, HttpStatus.OK);
		}
		return new ResponseEntity<>("Apoderado con el dni " + mapperDetalleCompra + " no existente.",
				HttpStatus.NOT_FOUND);
	}
	///// No funciona
	
	@DeleteMapping("/eliminar/{id_detallecompras}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_detallecompras)
	{
		DetalleCompra detalleCompraDB  = detalleCompraService.findById(id_detallecompras);
		// Producto dproductoDB = productoService.findById(detalleCompraDB.getProducto().getId_producto());
		
		
		if(detalleCompraDB!= null) { 
			productoService.delete(id_detallecompras);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("Detalle compras con ID: "+id_detallecompras+" no existe.",HttpStatus.NOT_FOUND);
	}
}
