package com.monitora.jonataslaet.sithchallenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monitora.jonataslaet.sithchallenge.controllers.dtos.AuthorDTO;
import com.monitora.jonataslaet.sithchallenge.services.AuthorService;

/*
====
Let's make some new features!

In a *new branch*, using Java and Spring, implement some new features.
I want the API to receive an author object with *"name"* and *"birth"* from the **POST's body** (in JSON format) on the endpoint "/authors".

If I send 
{
"name": "Darth Vader",
"birth": "1870-02-15"
}
Return a String like the following model:
____
"**Darth Vader** was born in **1870-02-15**"
_____

After that, commit your changes with the message "sith challenge 2".
Push it to your remote repository.
 */
@RestController
@RequestMapping(value="/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> greeting(@PathVariable("id") Long id, @RequestParam("author") String name) {
		return authorService.greeting(id, name);
	}
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody AuthorDTO authorDTO) {
		return authorService.insert(authorDTO);
	} 
}
