package ar.edu.unlp.info.oo2.P4_ejer2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class ComponentTest {
	private Archivo archivo1;
	private Nombre nombre;
	private Extension extension;
	private Tamanio tamanio;
	private FechaCreacion fechaCreacion;
	
	@BeforeEach
	public void setUp(){
		
	}
	
	@Test
	public void prettyPrintTest(){
		archivo1 = new Archivo("CuteMiku","png",12,LocalDate.of(2022,02,19),LocalDate.of(2022,04,15),"todos");
		nombre= new Nombre(archivo1);
		assertEquals(nombre.prettyPrint(),"CuteMiku ");
		extension= new Extension(nombre);
		assertEquals(extension.prettyPrint(),"CuteMiku png ");
		tamanio=new Tamanio(extension);
		assertEquals(tamanio.prettyPrint(),"CuteMiku png 12 ");
		fechaCreacion=new FechaCreacion(tamanio);
		assertEquals(fechaCreacion.prettyPrint(),"CuteMiku png 12 2022-02-19 ");
	}
}
