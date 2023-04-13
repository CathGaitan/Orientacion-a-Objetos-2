package ar.edu.unlp.info.oo2.ejercicio3;

public class VideoStreamAdapter implements Media{
	private VideoStream videoStream;
	
	public void play(){
		videoStream.reproduce();
	}
}
