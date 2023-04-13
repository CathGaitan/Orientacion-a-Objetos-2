package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Empresa {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	
	public boolean agregarTelefono(String telefono){
		return this.guiaTelefonica.agregarTelefono(telefono);
	}

	public Persoona registrarUsuario(String DNI, String nombre, String tipo) {
		Persoona persona=null;
		if (tipo.equals("fisica")) {
			String telefono = guiaTelefonica.devolverUltimo();
			persona = new PersoonaFisica(DNI,nombre,telefono);
			this.guiaTelefonica.eliminarTelefono(telefono);
		}
		else if (tipo.equals("juridica")) {
			String telefono = guiaTelefonica.devolverUltimo();
			persona = new PersoonaJuridica(DNI,nombre,telefono); 
			this.guiaTelefonica.eliminarTelefono(telefono);
		}
		this.personas.add(persona);
		return persona;
		
	}
	
	public boolean eliminarUsuario(Persoona p) {
		return this.personas.remove(p);
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, String tipoLlamada, int duracion) {
		Llamada llamada=null;
		if(tipoLlamada.equals("nacional")){
			llamada= new LlamadaNacional(emisor,remitente,duracion);
			this.llamadas.add(llamada);
			emisor.agregarLlamada(llamada);
		}else if(tipoLlamada.equals("internacional")){
			llamada = new LlamadaInternacional(emisor,remitente,duracion);
			this.llamadas.add(llamada);
			emisor.agregarLlamada(llamada);
		}
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Persoona persona) {
		double monto = 0;
		if (this.encontrarNumero(persona) == null) return monto;
		else monto = persona.calcularPrecioLlamadas();
		return monto;
	}

	private Persoona encontrarNumero(Persoona persona) {
		return this.personas.stream()
			.filter(p -> persona.coincideTelefono(p.getTelefono()))
			.findFirst()
			.orElse(null);
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
