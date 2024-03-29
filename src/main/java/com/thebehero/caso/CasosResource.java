package com.thebehero.caso;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@RestController
@RequestMapping("/casos")
public class CasosResource {
	
	@Autowired
	private Casos casos;
	
	@PostMapping
	public Caso adicionar(@Valid @RequestBody Caso caso) {
		return casos.save(caso);
	}
	
	@GetMapping
	public List<Caso> listar() {
		return casos.findAll();
	}
	
	@JsonSerialize
	@GetMapping("/{id}")
	public ResponseEntity<Caso> buscar(@PathVariable Long id) {
		Caso caso = casos.getOne(id);
		
		if (caso == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(caso);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Caso> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Caso caso) {
		Caso existente = casos.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(caso, existente, "id");
		
		existente = casos.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Caso caso = casos.getOne(id);
		
		if (caso == null) {
			return ResponseEntity.notFound().build();
		}
		
		casos.delete(caso);
		
		return ResponseEntity.noContent().build();
	}
	
}