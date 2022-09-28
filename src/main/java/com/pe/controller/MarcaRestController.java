package com.pe.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.pe.mapper.MapperUtilMarca;
import com.pe.mapper.MarcaMapper;
import com.pe.model.*;
import com.pe.service.*;
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/marca")
public class MarcaRestController {

	@Autowired
	private MarcaService marcaService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<Marca> itemsMarca = marcaService.findAll();
		Collection<MarcaMapper> itemsMarcaMapper = MapperUtilMarca.convertMarca(itemsMarca);

		if (itemsMarca.isEmpty())
			return new ResponseEntity<>(itemsMarca, HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(itemsMarcaMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")

	public ResponseEntity<?> agregar(@RequestBody Marca marca) {
		marcaService.insert(marca);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);

	}

	@PutMapping("/editar/{id_marca}")
	public ResponseEntity<?> editar(@PathVariable Integer id_marca, @RequestBody Marca newMarca) {
		Marca marcaDB = marcaService.findById(id_marca);

		if (marcaDB != null) {
			marcaDB.setNombre(newMarca.getNombre());

			marcaService.update(marcaDB);
			return new ResponseEntity<>("marca ID " + id_marca + " se actualizó correctamente",
					HttpStatus.OK);

		}

		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/buscar/{id_marca}")
	public ResponseEntity<?> buscar(@PathVariable Integer id_marca){
		
		Marca itemsMarca = marcaService.findById(id_marca);
		MarcaMapper marcaMapper =  MapperUtilMarca.convertMarcaList(itemsMarca);
		
		if(itemsMarca!=null) {
			return new ResponseEntity<>(marcaMapper, HttpStatus.OK);
		}
		return new ResponseEntity<>("Apoderado con el dni " + id_marca + " no existente.", HttpStatus.NOT_FOUND);
		
	}
	
	@DeleteMapping("/eliminar/{id_marca}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_marca) {

		Marca marcaDb = marcaService.findById(id_marca);
		if (marcaDb != null) {
			marcaService.delete(id_marca);
			return new ResponseEntity<>("Marca eliminado.", HttpStatus.OK);
		}

		return new ResponseEntity<>("Marca con ID: " + id_marca + " no existe.", HttpStatus.NOT_FOUND);
	}
}
