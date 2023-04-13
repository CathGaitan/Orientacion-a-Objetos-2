package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet {
	private Tweet reTweet;
	private String texto;
	
	public Tweet(String texto){
		this.texto=texto;
		this.reTweet=null;
	}

	public Tweet(String texto, Tweet reTweet){
		this.texto=texto;
		this.reTweet=reTweet;
	}
	
	public String getTexto(){
		return this.texto;
	}
	
	public Tweet getReTweet(){
		return this.reTweet;
	}
	
	
	
}
