package com.spring.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas1Casa {

	@GetMapping("/reloj")
	@ResponseBody
	public String miReloj(@RequestParam int horas,
			@RequestParam int minutos,
			@RequestParam int segundos){
		
		
		String salida = Reloj.calcularSiguienteSegundo(horas, minutos, segundos);
		
		return salida;
	}
}
