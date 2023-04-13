package ar.edu.unlp.info.oo2.biblioteca;
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
	}
	
	@Test
	public void pruebaJson(){
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());
	}

}
