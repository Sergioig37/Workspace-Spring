package com.spring.start.web;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {

	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		return "<h1>Hola</h1> ";
	}
	
	
	@GetMapping("/hola/sergio/adios")
	@ResponseBody
	public String rutaBasica(@RequestHeader Map<String, String> request) {
		
		for(String llave: request.keySet()) {
			
			System.out.println(llave +" : " +request.get(llave));
		}
		
		
		return "OK ";
		
	}
	
	
	/*
	@GetMapping(value={"/hola", "/hola/{mensaje}"})
	@ResponseBody
	public String otraRutaInicial(@PathVariable Optional<String> mensaje) {
		
		if(mensaje.isPresent()) {
			return "Hola caracola " + mensaje.get();
		}
		else {
			return "Hola Amigos";
		}
		
	}
	*/
	
		@GetMapping( "/hola" )
		@ResponseBody
		public String hola(@RequestParam Optional<Integer> id,
					@RequestParam Optional<String> nombre) {
		
			if(id.isPresent()&&nombre.isPresent()) {
				return "<h1>Hola " + "["+id.get()+"]" + " "+ nombre.get() +"</h1>";
			}
			else if(id.isPresent()&&!nombre.isPresent()) {
				return "No está el nombre pero si el id ";
			}
			else if(!id.isPresent()&&nombre.isPresent()) {
				return "No está el id pero si el nombre ";
			}
			else {
				return "No está ninguno de los dos ";
			}
	}
		
		
	
		@GetMapping(value={"/adios","/adios/{id}", "/adios/{id}/{nombre}", "/adios/{nombre}"})
		@ResponseBody
		public String adios(@PathVariable Optional<Integer> id,
				@PathVariable Optional<String> nombre) {
			
			if(id.isPresent()&&nombre.isPresent()) {
				return "<h1>Hola " + "["+id.get()+"]" + " "+ nombre.get() +"</h1>";
			}
			else if(id.isPresent()&&!nombre.isPresent()) {
				return "No está el nombre pero si el id ";
			}
			else if(!id.isPresent()&&nombre.isPresent()) {
				return "No está el id pero si el nombre ";
			}
			else {
				return "No está ninguno de los dos ";
			}
			
	}
	
	
	
	@GetMapping("/param")
	@ResponseBody
	public String rutaParam(@RequestParam String nombre
							,@RequestParam Optional<String> apellido) {
		
		return "<h1>Hola " + nombre +" "+ apellido+"</h1>";
	}
	
	
	@PatchMapping("/patch/hola")
	@ResponseBody
	public String miPrimerPatch() {
		return "PATCH OK";
	}
	@GetMapping("/patch/hola")
	@ResponseBody
	public String miSegundoPatch() {
		return "PATCH OK PERO ES MENTIRA";
	}
	
	@PutMapping("/put/hola")
	@ResponseBody
	public String miPrimerPut() {
		return "PUT OK";
	}
	@DeleteMapping("/delete/hola")
	@ResponseBody
	public String miPrimerDelete() {
		return "DELETE OK";
	}
	
	
	@PostMapping("/put/{id}")
	@ResponseBody
	public String miPost(
			@PathVariable Optional<String> id,
			@RequestParam String nombre,
			@RequestParam String email,
			@RequestParam String msg) {
							
		System.out.println(id);
		System.out.println(nombre);
		System.out.println(email);
		System.out.println(msg);
		
		return "OK";

	}
}
	
	/*
	@GetMapping("/hola/{id}/{nombre}/{apellidos}/{ciudad}")
	@ResponseBody
	public String rutaNombre(@PathVariable Map<String, String> map) {
		
		
		String id = map.get("id");
		String nombre = map.get("nombre");
		String apellidos = map.get("apellidos");
		String ciudad = map.get("ciudad");
		
		return "<h1>Hola "+id+" " +nombre+" "+apellidos+" "+ciudad+"</h1>";
	}
	*/
	
	
	
	
	
	

