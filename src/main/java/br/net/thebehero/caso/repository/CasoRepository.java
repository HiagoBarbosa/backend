package br.net.thebehero.caso.repository;

import br.net.thebehero.caso.model.Caso;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface CasoRepository extends JpaRepository<Caso,Long>{
	public Caso findByCaso(String caso);
	
	@Query("from tb_casoOng")
	public Caso findByAllCaso(
			@Param
			("nome") String nome,
			@Param
			("raca") String caso,
			@Param
			("especie") String especie,
			@Param
			("dta_recolhimento") String dta_recolhimento,
			@Param
			("descricao") String descricao,
			@Param
			("image") String image
			);
}
