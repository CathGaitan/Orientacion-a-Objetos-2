package ar.edu.unlp.info.oo2.P2_ejercicio1;

public class Agua implements Topografia{
	
	public double calcularProporcion(){
		return 1;
	}
	
	//este metodo extra es para asegurarse de comparar
	//objetos atomicos con otro objeto atomico (hojas)
	public boolean equalsTopografia(Topografia topografia){
		return topografia.calcularProporcion() == this.calcularProporcion();
	}
	
	
	public boolean equals(Object o){
		if(this.getClass()==o.getClass()){ //nos aseguramos que no sea un object cualquiera
			Topografia topografia = (Topografia) o;
			return topografia.equalsTopografia(this);
		}
		return false;
	}
}
