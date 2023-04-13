package ar.edu.unlp.info.oo2.P2_ejercicio1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixtaTest {
	private TopografiaMixta topografiaMixta;
	private Agua agua=new Agua();
	private Tierra tierra=new Tierra();
	
	@BeforeEach
	public void setUp(){
		
	}
	
	@Test
	public void calcularProporcionTest(){
		List<Topografia> listaT = new ArrayList<>();
		listaT.add(agua);
		listaT.add(agua);
		listaT.add(tierra);
		listaT.add(tierra);
		topografiaMixta = new TopografiaMixta(listaT);
		assertEquals(topografiaMixta.calcularProporcion(),0.5);
	}
	
	@Test
	public void calcularProporcionTest2(){
		List<Topografia> listaT = new ArrayList<>();
		List<Topografia> listaT2 = new ArrayList<>();
		listaT.add(agua);
		listaT.add(agua);
		listaT.add(tierra);
		listaT.add(tierra);
		TopografiaMixta otraTopografia = new TopografiaMixta(listaT);
		listaT2.add(agua);
		listaT2.add(agua);
		listaT2.add(tierra);
		listaT2.add(otraTopografia);
		topografiaMixta = new TopografiaMixta(listaT2);
		//listaT = (1+1+0+0)/4 = 0.5
		//listaT2 = (1+1+0+0.5)/4 = 0.625!!! 
		//listaT2 tiene 2 cuadrados de agua, 1 de tierra, y un cuadrado
		//que se divide en otras 4 topografias
		assertEquals(topografiaMixta.calcularProporcion(),0.625);	
	}
	
}
