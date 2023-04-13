package ar.edu.unlp.info.oo1.P7_ejer3;

public class EnProceso implements Estado{
	
	public void invertir(Proyecto proyecto,double monto){
		proyecto.actualizarMontoActual(monto);
		if(proyecto.getMontoActual()>=proyecto.getMontoNecesario()){
			proyecto.setEstado(new Conformado());
		}
	}
	
}
