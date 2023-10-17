package com.spring.start.web;

import java.util.Map;

public class Reloj {
	
	public  static String calcularSiguienteSegundo(int horas, int minutos, int segundos) {
		
		String resultado = "";
		
			
			segundos++;
			
			if(horas<=24&&minutos<=60&&segundos<=60) {
				if (segundos == 60) {
				segundos = 0;
				minutos++;
				if (minutos == 60) {
					minutos = 0;
					horas++;
					if (horas == 24) {
						horas = 0;
					}
				}
			}
			 resultado += "La hora del siguiente segundo será " +horas+":"+minutos+":"+segundos;
			}
			else {
				resultado = "Hora inválida, prueba de nuevo";
			}
			
			
			
		return resultado;
	}
	
public  static String calcularSiguienteMinuto(int horas, int minutos) {
		
		String resultado = "";
		
		if(horas<=24&&minutos<=60) {
			minutos++;
			if (minutos == 60) {
				minutos = 0;
				horas++;
				if (horas == 24) {
					horas = 0;
				}    
			}
			resultado += "La hora del siguiente minuto  será " +horas+":"+minutos;
		}
		else {
			resultado = "Hora inválidad prueba de nuevo";
		}
			
		
			
		return resultado;
	}
	


}
