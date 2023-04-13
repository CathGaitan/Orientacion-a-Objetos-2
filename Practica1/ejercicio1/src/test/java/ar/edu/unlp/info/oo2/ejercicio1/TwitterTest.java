package ar.edu.unlp.info.oo2.ejercicio1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwitterTest {
	private Twitter twitter;
	
	@BeforeEach
	public void setUp(){
		twitter = new Twitter();
	}
	
	@Test
	public void crearUsuarioTest(){
		Usuario unixCat = twitter.crearUsuario("unixCat");
		Usuario usuarioNull = twitter.crearUsuario("unixCat");
		assertSame(twitter.buscarUsuario("unixCat"),unixCat);
		assertNull(usuarioNull);
	}
	
	@Test
	public void eliminarUsuario(){
		twitter.crearUsuario("unixCat");
		twitter.crearUsuario("wala");
		twitter.eliminarUsuario("unixCat");
		assertNull(twitter.buscarUsuario("unixCat"));
	}
	
}
