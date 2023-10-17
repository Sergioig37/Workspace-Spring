package com.spring.start.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {

	@PostMapping("/libro")
	@ResponseBody
	public String postLibro(@RequestParam String isbn,
			@RequestParam String nombreAutor,
			@RequestParam String fechaPublicacion,
			@RequestParam String categoria
			
			) {
		
		Libro libro = new Libro(isbn,nombreAutor,fechaPublicacion,categoria);
		
		System.out.println(libro);
		 
		return "sf";
	}
}
