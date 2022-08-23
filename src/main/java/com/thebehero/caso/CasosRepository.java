package com.thebehero.caso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CasosRepository extends JpaRepository<CasoEntidade, Long> {
	public CasoEntidade findbyinserir(String nome);
	public CasoEntidade findAll(String nome); 
}