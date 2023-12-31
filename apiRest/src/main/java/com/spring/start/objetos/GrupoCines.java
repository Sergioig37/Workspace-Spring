package com.spring.start.objetos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.start.utilities.ArrayCineConstructor;

@Service
public class GrupoCines {

	private List<Cine> cines;

	private GrupoCines() {
		setCines(ArrayCineConstructor.construirCines());
	}

	
	public Cine getCine(int id) {

		Cine cine = null;
		boolean encontrado = false;
		int i = 0;
		while (encontrado == false && i < cines.size()) {
			if (cines.get(i).getId() == id) {
				cine = cines.get(i);
				encontrado = true;
			}
			i++;
		}
		return cine;
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

	public void addCine(Cine cine) {

		checkId(cine);

		cine.setDireccion(DireccionConstructor.construirDireccion());

		cines.add(cine);

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

	private void checkId(Cine cine) {

		if (cines.isEmpty()) {
			cine.setId(0);
		} else {
			for (Cine cineTest : cines) {
				if (cineTest.getId() == cine.getId()) {
					cine.setId(cines.get(cines.size() - 1).getId() + 1);
				}
			}
		}

	}

	public void actualizarCine(Cine cine) {

		boolean encontrado = false;
		int i = 0;

		while (encontrado == false && i != cines.size()) {
			if (cines.get(i).getId() == cine.getId()) {
				encontrado = true;
				cines.set(i, cine);
			}
			i++;
		}

	}

}
