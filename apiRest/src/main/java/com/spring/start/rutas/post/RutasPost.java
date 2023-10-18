package com.spring.start.rutas.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.GrupoCines;

@RestController
public class RutasPost {

	@Autowired
	private GrupoCines grupoCines;

	@PostMapping("/cines/post")
	public void cinesPost(@RequestBody Cine cine){
		
		grupoCines = GrupoCines.getGrupoCines();
		
		grupoCines.addCine(cine);
		
		System.out.println(cine);
	}
	
}
