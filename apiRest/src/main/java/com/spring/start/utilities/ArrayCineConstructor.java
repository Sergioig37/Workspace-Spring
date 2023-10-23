package com.spring.start.utilities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.CineConstructor;
import com.spring.start.objetos.Direccion;
import com.spring.start.objetos.DireccionConstructor;
import com.spring.start.objetos.Pelicula;

public class ArrayCineConstructor {

	
	
	
	
	
	
	public static List<Cine> construirCines(){
		
		ArrayList<Cine> cines = new ArrayList<Cine>();
		
		
		Direccion direccion = DireccionConstructor.construirDireccion();
		direccion.setCalle("Genral Elorza 41");
		direccion.setCiudad("Oviedo");
		direccion.setCp("33002");
		
		
		
		
		for(int i=0; i<5;i++) {
			Cine cine = new Cine();
			cine.setId(i);
			cine.setNombre("Arango"+i);
			cine.setDireccion(direccion);
			cine.setCapacidad(i*1000);
			cines.add(cine);
			for(int j=0;j<4;j++) {
				Pelicula pelicula = new Pelicula(j, "Carrion", "Motor", "Felpe");
				cine.addPelicula(pelicula);
			}
			
		}
		
		return cines;
	}
	
}
