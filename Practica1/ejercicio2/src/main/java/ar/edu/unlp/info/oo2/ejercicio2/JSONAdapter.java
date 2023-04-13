package ar.edu.unlp.info.oo2.ejercicio2;
import java.util.List;

public class JSONAdapter extends VoorheesExporter{
	private JSONSimpleAdaptee adaptee;
	
	public String exportar(List<Socio> socios) {
		return adaptee.exportar(socios);
	}
}
