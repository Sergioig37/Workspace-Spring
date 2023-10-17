package com.spring.start.web;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas2 {

	@GetMapping(value= {"/calificacion", "/calificacion/{nota}"})
	@ResponseBody
	public String laNota(@PathVariable int nota) {

			return AnalizadorNota.analizarNota(nota);
	}
}
