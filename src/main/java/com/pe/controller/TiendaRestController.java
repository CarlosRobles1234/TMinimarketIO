package com.pe.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.pe.mapper.*;
import com.pe.model.*;
import com.pe.service.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/tienda")
public class TiendaRestController {

	@Autowired
	private TiendaService tiendaService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<Tienda> itemsTienda = tiendaService.findAll();
		Collection<MapperTienda> itemsTiendaMapper = MapperUtilTienda.convertTienda(itemsTienda);

		if (itemsTienda.isEmpty())
			return new ResponseEntity<>(itemsTienda, HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(itemsTiendaMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Tienda tienda) {

		tiendaService.insert(tienda);

		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}

	@PutMapping("/editar/{id_tienda}")
	public ResponseEntity<?> editar(@PathVariable Integer id_tienda, @RequestBody Tienda newTienda) {
		Tienda tiendaDB = tiendaService.findById(id_tienda);

		if (tiendaDB != null) {

			tiendaDB.setNombre(newTienda.getNombre());

			tiendaService.update(tiendaDB);
			return new ResponseEntity<>("La estudiante con el cliente " + id_tienda + " se actualizó correctamente.",
					HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/eliminar/{id_tienda}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_tienda) {
		Tienda tiendaDB = tiendaService.findById(id_tienda);
		if (tiendaDB != null) {
			tiendaService.delete(id_tienda);
			return new ResponseEntity<>("producto eliminado.", HttpStatus.OK);
		}
		return new ResponseEntity<>("producto con ID: " + id_tienda + " no existe.", HttpStatus.NOT_FOUND);
	}

}
