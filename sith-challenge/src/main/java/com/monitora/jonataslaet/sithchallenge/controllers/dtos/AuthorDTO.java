package com.monitora.jonataslaet.sithchallenge.controllers.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AuthorDTO {

	private Long id;
	private String name;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate birth;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirth() {
		return birth;
	}

}
