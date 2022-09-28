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
@RequestMapping("/documentos")
public class DocumentoRestController {

	@Autowired
	private DocumentoService documentoService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {

		Collection<Documento> itemsDocumento = documentoService.findAll();
		Collection<MapperDocumento> itemsDocumentoMapper = MapperUtilDocumento.convertDocumento(itemsDocumento);
		if (itemsDocumento.isEmpty())
			return new ResponseEntity<>(itemsDocumento, HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(itemsDocumentoMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Documento documento) {
		documentoService.insert(documento);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}

	@PutMapping("/editar/{id_documento}")
	public ResponseEntity<?> editar(@PathVariable Integer id_documento, @RequestBody Documento newDocumento) {
		Documento documentoDB = documentoService.findById(id_documento);
		if (documentoDB != null) {
			documentoDB.setNombre(newDocumento.getNombre());

			documentoService.update(documentoDB);
			return new ResponseEntity<>("La estudiante con el cliente " + id_documento + " se actualizó correctamente.",
					HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/buscar/{id_documento}")
	public ResponseEntity<?> buscar(@PathVariable Integer id_documento) {

		Documento itemsDocumento = documentoService.findById(id_documento);
		MapperDocumento mapperDocumento = MapperUtilDocumento.convertDocumentoList(itemsDocumento);

		if (itemsDocumento != null) {
			return new ResponseEntity<>(mapperDocumento, HttpStatus.OK);
		}
		return new ResponseEntity<>("Apoderado con el dni " + mapperDocumento + " no existente.", HttpStatus.NOT_FOUND);

	}
	
	@DeleteMapping("/eliminar/{id_documento}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_documento){
		
		Documento documentoDB =documentoService.findById(id_documento);
	
		if( documentoDB!= null) { 
			documentoService.delete(id_documento);
			return new ResponseEntity<>("Documento eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("documento con ID: "+id_documento+" no existe.",HttpStatus.NOT_FOUND);
		}
	
}
