package ar.edu.unlp.info.oo2.P2_ejercicio3;
import java.time.LocalDate;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public Elemento (String nombre,LocalDate fechaCreacion){
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public LocalDate getFechaCreacion(){
		return this.fechaCreacion;
	}
	
	public abstract int getTamanio();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();

}
