package ar.edu.unlp.info.oo2.P7_ejer1;

public class EstrategiaRopaDelicada implements EstrategiaLavado{

	public void iniciarLavado(Lavarropas lavarropas){
		lavarropas.agregarAgua(100);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(40);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(100);
		lavarropas.agregarEnjuague();
		lavarropas.enjuaga(15);
	}
	
}
