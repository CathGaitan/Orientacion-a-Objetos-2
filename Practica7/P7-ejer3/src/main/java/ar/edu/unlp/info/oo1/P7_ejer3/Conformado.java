package ar.edu.unlp.info.oo1.P7_ejer3;

public class Conformado implements Estado{

	public void invertir(Proyecto proyecto,double monto){
		proyecto.actualizarMontoActual(monto);
	}
	
}
