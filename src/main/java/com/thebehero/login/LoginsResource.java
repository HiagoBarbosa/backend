package com.thebehero.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebehero.ong.Ong;

@RestController
@RequestMapping("/login")
public class LoginsResource {

	
	@PostMapping
	public ResponseEntity<Ong> login(@RequestBody Login login){	
		Ong ong = new Ong();
		if(login.getEmailId().equals(ong.getEmail()) & login.getPassword().equals(ong.getPassword())) {	
			return ResponseEntity.ok().body(ong);
		}
		else {
			return ResponseEntity.status(401).build();
		}
	}

}
