package com.spring.start.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.CineConstructor;
import com.spring.start.objetos.Direccion;
import com.spring.start.objetos.DireccionConstructor;

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
		}
		
		return cines;
	}
	
}
