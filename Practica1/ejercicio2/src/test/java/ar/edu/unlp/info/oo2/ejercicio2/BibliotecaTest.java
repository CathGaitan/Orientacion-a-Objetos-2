package ar.edu.unlp.info.oo2.ejercicio2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	private Socio cath,wala; 
	
	
	@BeforeEach
	public void setUp(){
		biblioteca = new Biblioteca();
		cath = new Socio("Cath","cath@gmail.com","1234-5");
		wala = new Socio("Wala","wala@gmail.com","4324-1");
	}
	
	@Test
	public void agregarSocioTest(){
		biblioteca.agregarSocio(cath);
		biblioteca.agregarSocio(wala);
		System.out.println(biblioteca.exportarSocios());
	}
	
}
