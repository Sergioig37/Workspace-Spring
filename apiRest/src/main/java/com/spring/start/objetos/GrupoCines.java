package com.spring.start.objetos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.start.utilities.ArrayCineConstructor;

@Service
public class GrupoCines {

	private static GrupoCines grupoCines = null;
	private List<Cine> cines;

	private GrupoCines() {
		
	}

	public static GrupoCines getGrupoCines() {

		if (grupoCines == null) {
			grupoCines = new GrupoCines();
			grupoCines.setCines(ArrayCineConstructor.construirCines());
		}

		return grupoCines;

	}

	public List<Cine> getCines() {

		return cines;
	}

	private void setCines(List<Cine> ciness) {

		this.cines = ciness;

	}

	public void borrarCine(int id) {

		for (int i = 0; i < cines.size(); i++) {
			if (cines.get(i).getId() == id) {
				cines.remove(i);
			}

		}

	}

	public boolean comprobarExiste(int id) {

		boolean encontrado = false;

		for (int i = 0; i < cines.size(); i++) {
			if (cines.get(i).getId() == id) {
				encontrado = true;
			}
		}
		return encontrado;

	}
}
