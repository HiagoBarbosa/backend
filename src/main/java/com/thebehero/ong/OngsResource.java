package com.thebehero.ong;

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
import org.modelmapper.ModelMapper;

@RestController
@RequestMapping("/ongs")
public class OngsResource {
	@Autowired
	private Ongs ongs;
	private ModelMapper mapper;
	
	@PostMapping
	public Ong adicionar(@Valid @RequestBody Ong ong) {
		return ongs.save(ong);

	}
	
	
	@GetMapping
	public List<Ong> listar() {
		return ongs.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Ong> buscar(@PathVariable Long id) {
		Ong ong = ongs.getOne(id);
		
		if (ong == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(ong);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Ong> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Ong ong) {
		Ong existente = ongs.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(ong, existente, "id");
		
		existente = ongs.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Ong ong = ongs.getOne(id);
		
		if (ong == null) {
			return ResponseEntity.notFound().build();
		}
		
		ongs.delete(ong);
		
		return ResponseEntity.noContent().build();
	}
}
