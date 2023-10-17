package com.spring.start.web;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas1Casa {

	@GetMapping(value={"/relojMini","/relojMini/{horas}/{minutos}","/relojMini/{horas}/{minutos}/{segundos}"})
	@ResponseBody
	public String miReloj(
			@PathVariable int horas,
			@PathVariable int minutos, 
			@PathVariable(required=false) Integer segundos){
		
		if(segundos==null) {
			return Reloj.calcularSiguienteMinuto(horas, minutos);
		}
		else {
			return Reloj.calcularSiguienteSegundo(horas, minutos, segundos);
		}
		
	}
	
}
