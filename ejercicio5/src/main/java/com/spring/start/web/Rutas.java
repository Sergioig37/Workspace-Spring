package com.spring.start.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {

	
	@GetMapping("/ecuacion")
	@ResponseBody
	public List<Double> rutaOperaciones(@PathVariable Double a,@PathVariable Double b,@RequestParam Optional<Double> c) {
		
		Double d = null;
		if(c.isEmpty()) {
			d = 0.0;
		}else {
			d = c.get();
		}
		
		ArrayList<Double> soluciones= new ArrayList<>();
		
		soluciones.add((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * d)) / (2 * a));
		soluciones.add(((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * d))) / (2 * a));
		
		return soluciones;
	}
}
