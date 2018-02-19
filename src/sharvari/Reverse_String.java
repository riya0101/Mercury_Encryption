package sharvari;

import org.apache.poi.util.SystemOutLogger;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text="Hello , This is Sonali!!!";
		
	      String[] t= text.split(" ");
	      
	      System.out.println();
	      for (int i=t.length-1; i>=0;i--)
	      {
	    	 
	    	  System.out.print(t[i]+" ");
	      }
	      
	      

	}

}
