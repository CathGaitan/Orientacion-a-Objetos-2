package ar.edu.unlp.info.oo2.P3_ejercicio1;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Duration {
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public Duration(){
		this.fechaInicio=LocalDateTime.now();
	}
	
	public LocalDateTime getFechaInicio(){
		return this.fechaInicio;
	}
	
	public LocalDateTime getFechaFin(){
		return this.fechaFin;
	}
	
	public long calcularDuracion(){
		return this.fechaInicio.until(fechaFin,ChronoUnit.HOURS);
	}
}
