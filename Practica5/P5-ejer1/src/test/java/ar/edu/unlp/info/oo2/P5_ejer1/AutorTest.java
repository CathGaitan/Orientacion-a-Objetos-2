package ar.edu.unlp.info.oo2.P5_ejer1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutorTest {
	private Autor miku,rin;
	private Album love,loveEnVivo,mandarinLove;
	
	@BeforeEach
	public void setUp(){
		miku = new Autor("miku");
		rin = new Autor("rin");
		love= new Album("love");
		loveEnVivo = new Album("loveEnVivo");
		mandarinLove = new Album("mandarinLove");
	}
	
	@Test
	public void agregarAlbumTest(){
		miku.agregarAlbum(love);
		miku.agregarAlbum(loveEnVivo);
		List<Album> albumesMiku = Arrays.asList(love,loveEnVivo);
		assertEquals(miku.getAlbumes(),albumesMiku);
		rin.agregarAlbum(mandarinLove);
		List<Album> albumesRin = Arrays.asList(mandarinLove);
		assertEquals(rin.getAlbumes(),albumesRin);
	}
	
}
