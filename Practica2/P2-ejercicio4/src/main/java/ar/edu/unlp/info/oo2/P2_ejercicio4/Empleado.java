package ar.edu.unlp.info.oo2.P2_ejercicio4;

public abstract class Empleado {
	
	public void templateGetSueldo(){
		this.getSueldoBasico();
		this.getSueldoAdicional();
		this.getDescuento();
	}
	
	public abstract double getSueldoBasico();
	public abstract double getSueldoAdicional();
	
	public double getDescuento(){
		return (this.getSueldoBasico()*0.13)+(this.getSueldoAdicional()*0.05);
	}
	
	
	
}
