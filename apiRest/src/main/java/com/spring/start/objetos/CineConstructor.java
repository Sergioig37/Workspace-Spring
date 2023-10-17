package com.spring.start.objetos;

public class CineConstructor {

	public static Cine construirCine() {
		
		Cine cine = new Cine();
		
		Direccion direccion = DireccionConstructor.construirDireccion();
			direccion.setCalle("Genral Elorza 41");
			direccion.setCiudad("Oviedo");
			direccion.setCp("33002");
		
		for(int i=0;i<5;i++) {
			
			cine.setId(i);
			cine.setNombre("Arango"+i);
			cine.setDireccion(direccion);
			cine.setCapacidad(i*1000);
		}
		
		
		return cine;
		
	}

}
