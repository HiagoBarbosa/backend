package com.thebehero.servicoVoluntarioEDoacao;

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

import com.thebehero.caso.Caso;

@RestController
@RequestMapping("/servicosVoluntariosEDoacoes")
public class ServicosVoluntariosEDoacoesResource {
	
	@Autowired
	private ServicosVoluntariosEDoacoes servicosVoluntariosEDoacoes;
	
	@PostMapping
	public ServicoVoluntarioEDoacao adicionar(@Valid @RequestBody ServicoVoluntarioEDoacao servicosVoluntariosEDoacao) {
		return servicosVoluntariosEDoacoes.save(servicosVoluntariosEDoacao);
	}
	
	@GetMapping
	public List<ServicoVoluntarioEDoacao> listar() {
		return servicosVoluntariosEDoacoes.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ServicoVoluntarioEDoacao> buscar(@PathVariable Long id) {
		ServicoVoluntarioEDoacao servicovoluntarioedoacoes = servicosVoluntariosEDoacoes.getOne(id);
		
		if (servicovoluntarioedoacoes == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(servicovoluntarioedoacoes);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ServicoVoluntarioEDoacao> atualizar(@PathVariable Long id, 
			@Valid @RequestBody ServicoVoluntarioEDoacao servicoVoluntarioEDoacao) {
		ServicoVoluntarioEDoacao existente = servicosVoluntariosEDoacoes.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(servicoVoluntarioEDoacao, existente, "id");
		
		existente = servicosVoluntariosEDoacoes.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		ServicoVoluntarioEDoacao caso = servicosVoluntariosEDoacoes.getOne(id);
		
		if (caso == null) {
			return ResponseEntity.notFound().build();
		}
		
		servicosVoluntariosEDoacoes.delete(caso);
		
		return ResponseEntity.noContent().build();
	}
	
}