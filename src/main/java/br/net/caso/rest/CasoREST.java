package br.net.caso.rest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.net.thebehero.caso.model.Caso;
import br.net.thebehero.caso.model.CasoDTO;
import br.net.thebehero.caso.repository.CasoRepository;

@CrossOrigin
@RestController
public class CasoREST {

	@Autowired
	private CasoRepository repo;
	@Autowired
	private ModelMapper mapper;
	
//	@GetMapping("/casosOng")
//	public  List<CasoDTO>obterTodosCasosOng(){
//		return lista;
//	}
//
//	@GetMapping("/casoOng/{id}")
//	CasoDTO obterTodosCasosOng(@PathVariable("id") int id) {
//		CasoDTO c = lista.stream().filter(csao -> csao.getId() == id).
//				findAny().orElse(null);
//		return c;
//	}
	
	@PostMapping("/casoOng")
	CasoDTO inserirCaso(@RequestBody CasoDTO caso) {
		repo.save(
				mapper.map(caso, Caso.class));
		
		Caso csa = repo.findByCaso(caso.getNome());
		return mapper.map(csa, CasoDTO.class);
	}
	
//	@PutMapping("/casoOng/{id}")
//	public CasoDTO alterarCaso(@PathVariable("id") int id, @RequestBody CasoDTO caso) {
//		CasoDTO c = lista.stream().filter(csao -> csao.getId() == id).findAny().orElse(null);
//		if(c != null) {
//			c.setNome(caso.getNome());
//			c.setRaca(caso.getRaca());
//			c.setEspecie(caso.getEspecie());
//			c.setDta_recolhimento(caso.getDta_recolhimento());
//			c.setDescricao(caso.getDescricao());
//			c.setImage(caso.getImage());
//		}
//		return c;
//	}
//	
//	@DeleteMapping("/casoOng/{id}")
//	public CasoDTO removeCaso(@PathVariable("id") int id) {
//		CasoDTO caso = lista.stream().filter(csao ->csao.getId() == id).findAny().orElse(null);
//		if(caso != null)
//			lista.removeIf(c -> c.getId() == id);
//		return caso;
//	}
}












































