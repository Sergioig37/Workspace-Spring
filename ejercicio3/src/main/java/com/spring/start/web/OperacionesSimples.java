package com.spring.start.web;

import java.util.Map;

public  class  OperacionesSimples {
	
		
	
	public static String crearHtml(Map<String, String> numeros) {
		
		
		
		String resultado = "";
		
		resultado += "\n"+numeros.get("numero1")+"+"+numeros.get("numero2")+"\n";
		resultado += "\n"+numeros.get("numero1")+"-"+numeros.get("numero2")+"\n";
		resultado += "\n"+numeros.get("numero1")+"*"+numeros.get("numero2")+"\n";
		resultado += "\n"+numeros.get("numero1")+"/"+numeros.get("numero2")+"\n";
		
		return resultado;
		
	
	}
}
