package ar.edu.unlp.info.oo2.P5_ejer1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpOOtifyTest {
	private SpOOtify spOOtify;
	private Autor miku,rin,len;
	private Album love,yellowBanana,mandarinLove;
	private Cancion neeNeeNeeCont,loveIsWar,childrenWar,remoteController,butterfly;
	
	@BeforeEach
	public void setUp(){
		spOOtify = new SpOOtify();
		miku = new Autor("miku");
		rin = new Autor("rin");
		len = new Autor("len");
		love= new Album("love");
		yellowBanana= new Album("yellowBanana");
		mandarinLove = new Album("mandarinLove");
		neeNeeNeeCont = new Cancion("neeNeeNeeCont");
		loveIsWar = new Cancion("loveIsWar");
		childrenWar = new Cancion("childrenWar");
		remoteController = new Cancion("remoteController");
		butterfly = new Cancion("butterfly");
		spOOtify.agregarAutor(miku);
		spOOtify.agregarAutor(rin);
		spOOtify.agregarAutor(len);
		
		miku.agregarAlbum(love);
		rin.agregarAlbum(mandarinLove);
		len.agregarAlbum(yellowBanana);
		
		love.agregarCancion(neeNeeNeeCont);
		love.agregarCancion(loveIsWar);
		mandarinLove.agregarCancion(childrenWar);
		mandarinLove.agregarCancion(remoteController);
		yellowBanana.agregarCancion(butterfly);
	}
	
	@Test
	public void buscarPorTituloTest(){
		List<Cancion> temasWar = Arrays.asList(loveIsWar,childrenWar);
		System.out.print(temasWar);
		System.out.print(spOOtify.buscarPorTitulo("war"));
		assertEquals(temasWar,spOOtify.buscarPorTitulo("war"));
		List<Cancion> temasCont = Arrays.asList(neeNeeNeeCont,remoteController);
		assertEquals(temasCont,spOOtify.buscarPorTitulo("cont"));
		List<Cancion> temasB = Arrays.asList(butterfly);
		assertEquals(temasB,spOOtify.buscarPorTitulo("b"));
		assertEquals(Collections.emptyList(),spOOtify.buscarPorTitulo("NoExiste"));
		
	}
	
	@Test
	public void buscarPorAlbum(){
		List<Cancion> temasLove = Arrays.asList(neeNeeNeeCont,loveIsWar,childrenWar,remoteController);
		assertEquals(temasLove,spOOtify.buscarPorAlbum("love"));
		List<Cancion> temasBanana = Arrays.asList(butterfly);
		assertEquals(temasBanana,spOOtify.buscarPorAlbum("banana"));
		assertEquals(Collections.emptyList(),spOOtify.buscarPorAlbum("NoExiste"));
	}
	
	@Test
	public void buscarPorAutor(){
		List<Cancion> temasI = Arrays.asList(neeNeeNeeCont,loveIsWar,childrenWar,remoteController);
		assertEquals(temasI,spOOtify.buscarPorAutor("i"));
		List<Cancion> temasE = Arrays.asList(butterfly);
		assertEquals(temasE,spOOtify.buscarPorAutor("e"));
		assertEquals(Collections.emptyList(),spOOtify.buscarPorAutor("NoExiste"));
	}
}
