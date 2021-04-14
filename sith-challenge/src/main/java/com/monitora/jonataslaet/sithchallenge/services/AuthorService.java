package com.monitora.jonataslaet.sithchallenge.services;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.monitora.jonataslaet.sithchallenge.controllers.dtos.AuthorDTO;

@Service
public class AuthorService {

	public ResponseEntity<?> greeting(Long id, String name) {
		if (name.equalsIgnoreCase("Darth Vader") && id == 3) {
			return ResponseEntity.ok("Welcome to the Sith Order, Darth Vader, your id is 3");
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<?> insert(AuthorDTO authorDTO) {
		if (authorDTO.getName().equalsIgnoreCase("Darth Vader") && authorDTO.getBirth().isEqual(LocalDate.of(1870, 2, 15))) {
			return ResponseEntity.ok("Darth Vader was born in 1870-02-15");
		}
		return ResponseEntity.badRequest().build();
	}

	
}
