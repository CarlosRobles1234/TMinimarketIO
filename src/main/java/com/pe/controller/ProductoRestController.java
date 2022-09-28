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
@RequestMapping("/producto")
public class ProductoRestController {

	@Autowired
	private ProductoService productoService;

	@Autowired
	private MarcaService marcaService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<Producto> itemsProducto = productoService.findAll();
		Collection<ProductoMapper> itemsProductoMapper = 
		ProductoMapperUtil.convertProducto(itemsProducto);
		
		if (itemsProducto.isEmpty())
			return new ResponseEntity<>(itemsProducto, HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(itemsProductoMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Producto producto) {

		producto.setMarca(marcaService.findById(producto.getMarca().getId_marca()));
		productoService.insert(producto);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}
	@PutMapping("/editar/{id_producto}")
	public ResponseEntity<?> editar(@PathVariable Integer id_producto, @RequestBody Producto newProducto) {
		Producto productoDB = productoService.findById(id_producto);
		
		if (productoDB != null) {

			productoDB.setNombre(newProducto.getNombre());
			//productoDB.setNombreProd(newProducto.getNombreProd());
			productoDB.setDescripcion(newProducto.getDescripcion());
			productoDB.setPrecioVenta(newProducto.getPrecioVenta());
			productoDB.setMarca(marcaService.findById(newProducto.getMarca().getId_marca()));
			
			productoService.update(productoDB);
			 return new ResponseEntity<>("La estudiante con el cliente " + id_producto + " se actualizó correctamente.",HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/buscar/{id_producto}")
	public ResponseEntity<?> buscar(@PathVariable Integer  id_producto){
		
		Producto itemsProducto = productoService.findById(id_producto);
		ProductoMapper productoMapper = ProductoMapperUtil.convertProductoList(itemsProducto);
				
		if(	itemsProducto!=null) {		
			return new ResponseEntity<>( productoMapper , HttpStatus.OK);}		
		return new ResponseEntity<>("Apoderado con el dni " + productoMapper + " no existente.", HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/eliminar/{id_producto}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_producto)
	{
		Producto trabajoDB = productoService.findById(id_producto);
		if( trabajoDB!= null) { 
			productoService.delete(id_producto);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("producto con ID: "+id_producto+" no existe.",HttpStatus.NOT_FOUND);
	}	
	
}
		
