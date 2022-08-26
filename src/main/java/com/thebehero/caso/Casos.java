package com.thebehero.caso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Casos extends JpaRepository<Caso, Long> {
	Caso findById(long id);
}