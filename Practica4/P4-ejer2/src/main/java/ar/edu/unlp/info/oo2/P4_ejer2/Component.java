package ar.edu.unlp.info.oo2.P4_ejer2;
import java.time.LocalDate;

public interface Component {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public int getTamanio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}
