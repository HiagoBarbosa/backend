package com.thebehero.caso;

import org.springframework.data.jpa.repository.*;

public interface CasosRepository extends JpaRepository<CasoEntidade, Long> {
	public CasoEntidade findbyinserir(Long id);
	public CasoEntidade findAll(String nome); 
}