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
public class Rutas4 {

	@GetMapping("/dolar/{dinero}")
	@ResponseBody
	public Float dolarPath(
							@PathVariable int dinero) {
									
		
		float dolar = (float) (dinero*1.05);
		
		return dolar;
		
	}
	
	@GetMapping("/dolar")
	@ResponseBody
	public Float dolarRequest(
								@RequestParam int dinero) {
									
		float dolar = (float) (dinero*1.05);
		
		return dolar;
		
	}
}
