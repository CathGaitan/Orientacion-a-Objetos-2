package ar.edu.unlp.info.oo2.P2_ejercicio3;

import java.time.LocalDate;

public class Archivo extends Elemento{
	private int tamanio;
	
    public Archivo (String nombre, LocalDate fecha, int tamanio) {
    	super(nombre,fecha);
    	this.tamanio=tamanio;
    }
    
    public int getTamanio(){
    	return this.tamanio;
    }
    
	public boolean esArchivo(){
		return true;
	}
	
	public Archivo archivoMasGrande(){
		return this;
	}
	
	public Archivo archivoMasNuevo(){
		return this;
	}
}
