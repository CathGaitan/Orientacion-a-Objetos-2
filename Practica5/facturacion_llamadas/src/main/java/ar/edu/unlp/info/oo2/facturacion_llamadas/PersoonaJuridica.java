package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona{
	
	public PersoonaJuridica(String DNI, String nombre,String telefono){
		super(DNI,nombre,telefono);
	}
	
	public double calcularDescuento(double descuento){
		return descuento*0.15;
	}
}
