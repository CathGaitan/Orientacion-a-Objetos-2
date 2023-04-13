package ar.edu.unlp.info.oo2.P2_ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends Elemento{
	private List<Elemento> elementos;
	
	public Directorio(String nombre, LocalDate fecha){
        super(nombre,fecha);
        elementos=new ArrayList<>();
    }
	
	public int getTamanio(){
		double tamanio =this.elementos.stream()
				.mapToDouble(e -> e.getTamanio())
				.sum();
		return (int)tamanio +32;
	}
	
	public void agregar(Archivo archivo){
		this.elementos.add(archivo);
	}
	
	public void agregar(Directorio directorio){
		this.elementos.add(directorio);
	}
		 
	public int tamanioTotalOcupado() {
		double tamanio =this.elementos.stream()
			.mapToDouble(e -> e.getTamanio())
			.sum();
		return (int)tamanio + 32;
	}
	
	public boolean esArchivo(){
		return false;
	}
	
    public Archivo archivoMasGrande() {
		return this.elementos.stream().map(e -> e.archivoMasGrande())
				.max(Comparator.comparing(elem -> elem.getTamanio()))
				.orElse(null);
    }
    
    public Archivo archivoMasNuevo() {
		return this.elementos.stream().map(e -> e.archivoMasNuevo())
				.max(Comparator.comparing(elem -> elem.getFechaCreacion()))
				.orElse(null);

    }
}

