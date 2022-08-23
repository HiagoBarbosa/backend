package com.thebehero.caso;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.*;

@CrossOrigin
@RestController
public class CasosRest {
	
	@Autowired
	private CasosRepository casos;
	
	@Autowired
	private ModelMapper mapper;
	
	@PostMapping("/casos")
	CasoDTO inserir(@RequestBody CasoDTO caso) {
		casos.save(mapper.map(caso, CasoEntidade.class));
		CasoEntidade csae = casos.findbyinserir(caso.getId());
		return mapper.map(csae, CasoDTO.class);
	}
	
	@GetMapping("/casos")
	List<CasoDTO> listarTodos(){
		List<CasoEntidade> lista = casos.findAll();
		return lista.stream().map(e -> mapper.map(e, CasoDTO.class))
				.collect(Collectors.toList());
	}
	
	
/*	
	@GetMapping("/{id}")
	public ResponseEntity<CasoDTO> buscar(@PathVariable Long id) {
		CasoDTO caso = casos.getOne(id);
		
		if (caso == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(caso);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CasoDTO> atualizar(@PathVariable Long id, 
			@Valid @RequestBody CasoDTO caso) {
		CasoDTO existente = casos.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(caso, existente, "id");
		
		existente = casos.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		CasoDTO caso = casos.getOne(id);
		
		if (caso == null) {
			return ResponseEntity.notFound().build();
		}
		
		casos.delete(caso);
		
		return ResponseEntity.noContent().build();
	}
	*/
}