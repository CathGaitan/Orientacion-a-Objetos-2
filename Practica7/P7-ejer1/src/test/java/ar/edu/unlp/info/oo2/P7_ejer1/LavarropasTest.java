package ar.edu.unlp.info.oo2.P7_ejer1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//usar el framework mockito y realizar un mock object que simule
//un log para probar

public class LavarropasTest {
	Lavarropas lavarropas=new Lavarropas();
	EstrategiaRopaDelicada ropaDelicada=new EstrategiaRopaDelicada();
	
	@Test
	public void iniciarLavadoTest(){
		lavarropas.iniciarLavado();
		lavarropas.cambiarEstrategia(ropaDelicada);
		lavarropas.iniciarLavado();
	}

}
