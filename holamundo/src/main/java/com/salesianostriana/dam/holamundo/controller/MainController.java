package com.salesianostriana.dam.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String decirHola() {
		return "index.html";
	}
	
}
