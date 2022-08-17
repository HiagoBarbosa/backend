package br.net.thebehero.caso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.thebehero.caso.model.Caso;


public interface Casos extends JpaRepository<Caso, Long>{

}
