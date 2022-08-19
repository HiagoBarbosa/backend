package com.thebehero.descricao;

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



public class DescricaoResource {
	@Autowired
	private Descricoes descricoes;
	
	@PostMapping
	public Descricao adicionar(@Valid @RequestBody Descricao descricao) {
		return descricoes.save(descricao);
	}
	
	@GetMapping
	public List<Descricao> listar() {
		return descricoes.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Descricao> buscar(@PathVariable Long id) {
		Descricao descricao = descricoes.getOne(id);
		
		if (descricao == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(descricao);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Descricao> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Descricao descricao) {
		Descricao existente = descricoes.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(descricao, existente, "id");
		
		existente = descricoes.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Descricao descricao = descricoes.getOne(id);
		
		if (descricao == null) {
			return ResponseEntity.notFound().build();
		}
		
		descricoes.delete(descricao);
		
		return ResponseEntity.noContent().build();
	}
}
