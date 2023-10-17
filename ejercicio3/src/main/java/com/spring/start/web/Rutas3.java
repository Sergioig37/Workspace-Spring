package com.spring.start.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas3 {

	
	@GetMapping("/numeros")
	@ResponseBody
	public String losNumeros(
			@RequestParam Map<String, String> datos) {
		
		String resultado = OperacionesSimples.crearHtml(datos);
		
		
		return resultado;
		
	}
}
