package ar.edu.unlp.info.oo2.P2_ejercicio4;

public class Temporario extends Empleado{
	private double horasTrabajadas;
	private boolean estaCasado;
	private int cantHijos;
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public double getSueldoBasico(){
		return 20000+(this.horasTrabajadas*300);
	}
	
	public double getSueldoAdicional(){
		if(estaCasado) return 5000+cantHijos*2000;
		else return cantHijos*2000;
	}
	
}
