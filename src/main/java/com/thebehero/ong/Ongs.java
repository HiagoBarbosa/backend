package com.thebehero.ong;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Ongs extends JpaRepository<Ong, Long> {
	@Query("from ong where email= :email and password= :password")
	public Ong findByLoginAndSenha(@Param("email") String email, @Param("password")String password);
}
