package com.spring.start.web;

public class AnalizadorNota {

	
	public static String analizarNota(int nota) {
		
		if(nota<=4) {
			return"Insuficiente";
		}
		else if(nota==5) {
			return "Suficiente";
		}
		else if(nota<7&&nota>=6) {
			return "Bien";
		}
		else if(nota>=7&&nota<9) {
			return "Notable";
		}
		else {
			return"Sobresaliente";
		}
		
	}
}