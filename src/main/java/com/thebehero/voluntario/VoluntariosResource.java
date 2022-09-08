package com.thebehero.voluntario;

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

@RestController
@RequestMapping("/voluntarios")
public class VoluntariosResource {
	@Autowired
	private Voluntarios voluntarios;
	
	@PostMapping
	public Voluntario adicionar(@Valid @RequestBody Voluntario voluntario) {
		return voluntarios.save(voluntario);
	}
	
	@GetMapping
	public List<Voluntario> listar() {
		return voluntarios.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Voluntario> buscar(@PathVariable Long id) {
		Voluntario voluntario = voluntarios.getOne(id);
		
		if (voluntario == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(voluntario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Voluntario> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Voluntario voluntario) {
		Voluntario existente = voluntarios.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(voluntario, existente, "id");
		
		existente = voluntarios.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Voluntario voluntario = voluntarios.getOne(id);
		
		if (voluntario == null) {
			return ResponseEntity.notFound().build();
		}
		
		voluntarios.delete(voluntario);
		
		return ResponseEntity.noContent().build();
	}
}
