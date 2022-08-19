package com.thebehero.caso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Casos extends JpaRepository<Caso, Long> {

}
