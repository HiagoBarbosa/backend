package com.thebehero.doacao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doacoes")
public class DoacoesResource {
	@Autowired
	private Doacoes doacoes;

	@GetMapping
	public List<Doacao> listar() {
		return doacoes.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Doacao> buscar(@PathVariable Long id) {
		Doacao doacao = doacoes.getOne(id);
		
		if (doacao == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(doacao);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Doacao> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Doacao doacao) {
		Doacao existente = doacoes.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(doacao, existente, "id");
		
		existente = doacoes.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Doacao doacao = doacoes.getOne(id);
		
		if (doacao == null) {
			return ResponseEntity.notFound().build();
		}
		
		doacoes.delete(doacao);
		
		return ResponseEntity.noContent().build();
	}
}
