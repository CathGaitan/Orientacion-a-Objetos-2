package ar.edu.unlp.info.oo2.P2_ejercicio1;

import java.util.List;

public class TopografiaMixta implements Topografia{
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
	
	public boolean equalsTopografia(Topografia topografia){
		return true; //no se que hacer con esto 
	}
	
	public boolean equals(Object o){
		if(this.getClass()==o.getClass()){ //nos aseguramos que no sea un object cualquiera
			TopografiaMixta topografiaCompuesta = (TopografiaMixta) o;
			return this.componentes.equals(this.componentes); //comparamos que las listas tengan los mismos componentes
		}
		return false;
	}

	
}
