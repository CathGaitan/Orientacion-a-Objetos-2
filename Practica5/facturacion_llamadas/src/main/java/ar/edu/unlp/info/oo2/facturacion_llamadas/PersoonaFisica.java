package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona{
	
	public PersoonaFisica(String DNI, String nombre,String telefono){
		super(DNI,nombre,telefono);
	}
	
	public double calcularDescuento(double descuento){
		return 0;
	}
}
