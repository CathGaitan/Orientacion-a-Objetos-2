package ar.edu.unlp.info.oo2.ejercicio1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
	private Usuario unixCat,wala;
	
	@BeforeEach
	public void setUp(){
		unixCat = new Usuario("UnixCat");
		wala = new Usuario("Wala");
	}
	
	private String tweetMuyLargo(){
		String texto="";
		for(int i=0;i<200;i++){
			texto=texto+i;
		}
		return texto;
	}
	
	private String tweetNormal(){
		String texto="";
		for(int i=0;i<50;i++){
			int random=(int)Math.floor(Math.random()*(9-0+1)+0);
			texto=texto+random;
		}
		return texto;
	}
	
	@Test
	public void hacerTweetTest(){
		Tweet noTweet=unixCat.hacerTweet(tweetMuyLargo());
		Tweet tweetBien=unixCat.hacerTweet(tweetNormal());
		assertNull(noTweet);
		assertNotNull(tweetBien);
		assertNull(tweetBien.getReTweet());
	}
	
	@Test
	public void hacerReTweet(){
		Tweet tweetBien=unixCat.hacerTweet(tweetNormal());
		Tweet tweetNormal=wala.hacerReTweet(tweetNormal(),tweetBien);
		assertNotNull(tweetNormal);
		assertSame(tweetNormal.getReTweet(),tweetBien);
	}
	
	@Test
	public void eliminarUsuarioTest(){
		Tweet tweetBien=unixCat.hacerTweet(tweetNormal());
		Tweet tweetBien2=unixCat.hacerTweet(tweetNormal());
		assertTrue(unixCat.estaEseTweet(tweetBien));
		assertTrue(unixCat.estaEseTweet(tweetBien2));
		unixCat.eliminarUsuario();
		assertFalse(unixCat.estaEseTweet(tweetBien));
		assertFalse(unixCat.estaEseTweet(tweetBien2));
	}
	
	
}
