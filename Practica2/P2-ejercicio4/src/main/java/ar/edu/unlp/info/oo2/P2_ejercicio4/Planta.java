package ar.edu.unlp.info.oo2.P2_ejercicio4;

public class Planta extends Empleado{
	private boolean estaCasado;
	private int cantHijos;
	private int aniosAntiguedad;
	
	public double getSueldoBasico(){
		return 50000;
	}
	
	public double getSueldoAdicional(){
		double adicional=0;
		if(estaCasado) adicional=5000;
		adicional+=this.cantHijos*2000+this.aniosAntiguedad*2000;
		return adicional;
	}
	

}
