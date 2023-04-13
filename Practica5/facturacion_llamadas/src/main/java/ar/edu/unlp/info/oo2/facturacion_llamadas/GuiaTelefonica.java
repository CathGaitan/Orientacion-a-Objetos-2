package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;
import java.util.TreeSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();

	public boolean agregarTelefono(String telefono){
		if (guia.contains(telefono)) return false;
		else{
			guia.add(telefono);
			return true;
		}
	}
	
	public String devolverUltimo(){
		return this.guia.last();
	}
	
	public void eliminarTelefono(String telefono){
		this.guia.remove(telefono);
	}
}
