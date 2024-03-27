package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	@GetMapping
	public String bsm() {
		return "Orientação ao futuro\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de crescimento\n"
				+ "Persistência";
	}

}