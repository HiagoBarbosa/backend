package com.thebehero.caso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebehero.caso.model.Caso;

public interface Casos extends JpaRepository<Caso, Long> {

}
