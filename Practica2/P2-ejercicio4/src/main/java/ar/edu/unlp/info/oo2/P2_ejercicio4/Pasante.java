package ar.edu.unlp.info.oo2.P2_ejercicio4;

public class Pasante extends Empleado{
	private int cantExamenes;
	
	public double getSueldoBasico(){
		return 20000;
	}
	
	public double getSueldoAdicional(){
		return cantExamenes*2000;
	}
	
}
