package pruebasParadigmas;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcepcionesEnExamen {
	 private static int t=0; 
     private static void realizaCalculo() throws IOException{
    	 	t=t+1;
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("Esto es realiza calculo");      
     }

      private static void invocaCalculador() throws ArithmeticException{
                 try{
                      realizaCalculo();
                      System.out.println("Esto es invoca calculador");                             
                 }                 
                catch(IOException ioException){
                		int calculo=3/0;
                 }
                 finally{
                        t=t+1; 
                        System.out.println("Esto es el finally de invoca calculador"); 
                  }
      }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	        invocaCalculador();
	  		System.out.println("Imprimo dentro del try");

	    }
	     catch(ArithmeticException a){
	            t=t+1;
	            System.out.println("La excepcion propagada cae en el segundo manejador"); 
	     }
	     finally{
	           System.out.println("Esto es el ultimo finally"); 
	     }
		System.out.println("Imprimo fuera del finally del main");
	}

}
