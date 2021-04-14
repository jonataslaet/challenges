package com.monitora.jonataslaet.sithchallenge.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * _____

Task
-----
1. I want the API to **GET** the **id** from the *pathvariable* on the endpoint "/authors/{id}" and also **GET** the **param** *"author"*.
2. As a return, if I send the param author = *Darth Vader* on the endpoint "/authors/**3**", I want a string  like the model:
> "Welcome to the Sith Order, **Darth Vader**, your id is **3**"
3. After that, commit with the message "sith challenge 1".
4. Create a remote repository on your *VistaJet GitLab*.
5. Push the project to your remote repository.
 */
@RestController
@RequestMapping(value="/authors")
public class AuthorController {

	@GetMapping("/{id}")
	public ResponseEntity<?> greeting(@PathVariable("id") Long id, @RequestParam("author") String name) {
		if (name.equalsIgnoreCase("Darth Vader") && id == 3) {
			return ResponseEntity.ok("Welcome to the Sith Order, Darth Vader, your id is 3");
		}
		return ResponseEntity.notFound().build();
	}
}
