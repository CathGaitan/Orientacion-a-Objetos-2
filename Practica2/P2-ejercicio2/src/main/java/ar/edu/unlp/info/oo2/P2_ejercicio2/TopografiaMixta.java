package ar.edu.unlp.info.oo2.P2_ejercicio2;

import java.util.List;

public class TopografiaMixta {
	private List<Topografia> componentes;
	
	
	public TopografiaMixta(List<Topografia> componentes){
		this.componentes=componentes;
	}
	
	public double calcularProporcion(){
		double suma=this.componentes.stream()
				.mapToDouble(c -> c.calcularProporcion())
				.sum();
		return suma/4;
	}
	
}
