package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName){
		this.screenName=screenName;
		this.tweets=new ArrayList<>();
	}
	
	public String getScreenName(){
		return this.screenName;
	}
	
	public Tweet hacerTweet(String texto){
		if(comprobarLargo(texto)){
			Tweet tweet = new Tweet(texto);
			tweets.add(tweet);
			return tweet;
		}
		return null;
	}
	
	public Tweet hacerReTweet(String texto, Tweet reTweet){
		if(comprobarLargo(texto)&&(reTweet!=null)){
			Tweet tweet = new Tweet(texto,reTweet);
			tweets.add(tweet);
			return tweet;
		}
		return null;
	}
	
	public void eliminarUsuario(){
		this.tweets.clear();
	}
	
	private boolean comprobarLargo(String texto){
		return (1<=texto.length())&&(texto.length()<=140);
	}
	
	public boolean estaEseTweet(Tweet tweet){
		return this.tweets.stream()
				.anyMatch(u -> u.equals(tweet));
	}
}
