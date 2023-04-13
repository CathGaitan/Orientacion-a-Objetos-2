package ar.edu.unlp.info.oo1.P7_ejer3;

public class Proyecto {
	private String titulo;
	private double montoNecesario;
	private double montoActual;
	private Usuario emprendedor;
	private Estado estado;
	
	public Proyecto(String titulo,Usuario emprendedor,double montoNecesario){
		this.titulo=titulo;
		this.emprendedor=emprendedor;
		this.montoNecesario=montoNecesario;
	}
	
	public void cancelarProyecto(){
		//cancelo aca directamente? o cancelo en cada estado??
	}
	
	public void setEstado(Estado estado){
		this.estado=estado;
	}
	
	public void invertirMonto(double monto){
		this.estado.invertir(this,monto);
	}
	
	public void actualizarMontoActual(double monto){
		this.montoActual+=monto;
	}
	
	public double getMontoActual(){
		return this.montoActual;
	}
	
	public double getMontoNecesario(){
		return this.montoNecesario;
	}
	
	
}
