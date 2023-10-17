package com.spring.start.web;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas1 {

	@GetMapping(value= {"/tiempo", "/tiempo/{temperatura}"})
	@ResponseBody
	public String elTiempo(@PathVariable Optional<Integer>temperatura) {
	
		if (temperatura.isPresent()) {

			if (temperatura.get() > 40) {
				return "Me aso";
			} else {
				return "Hace bueno";
			}
		}
		return "No hay temperatura";
	}
}
