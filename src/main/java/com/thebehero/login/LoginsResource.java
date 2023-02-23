package com.thebehero.login;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebehero.ong.Ong;
import com.thebehero.ong.Ongs;

@RestController
@RequestMapping("/login")
public class LoginsResource {
	@Autowired
	private Ongs ongs;
	
	@PostMapping
	public ResponseEntity<Ong> login(@Valid @RequestBody Login login){	
		Ong ong = new Ong();
		if(login.getEmailId().equals(ong.getEmail()) & login.getPassword().equals(ong.getPassword())) {	
			return (ResponseEntity<Ong>) ResponseEntity.ok().header(null, null);
		}
		else {
			return (ResponseEntity<Ong>) ResponseEntity.ok().header(null, null);
			//return ResponseEntity.ok().body(ong);
			//return ResponseEntity.status(401).build();
		}
	}

}
