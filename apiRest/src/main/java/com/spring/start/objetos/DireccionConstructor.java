package com.spring.start.objetos;

public class DireccionConstructor {

	
	public static Direccion construirDireccion() {
		
		
		Direccion direccion = new Direccion();
		direccion.setCalle("Genral Elorza 41");
		direccion.setCiudad("Oviedo");
		direccion.setCp("33002");
		
		
		return direccion;
		
		
	}
}
