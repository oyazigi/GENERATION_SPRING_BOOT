package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/objetivos")
public class ObjetivoAprendizagemController {		
	@GetMapping
	public String objetivos() {
		return "Nessa semana pretendo me dedicar a aprender todo o backend do spring tools, me parece ser algo bem desafiador\n"
				+ "e estou realmente ansioso para isso!";
}
}