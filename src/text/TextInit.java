package text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TextInit {
	
	
	
	
	public String getText(String fileName){

		 BufferedReader input = null;
	     
	     try {
	        input = new BufferedReader(new FileReader(fileName));
	     } catch (FileNotFoundException e) {
	        System.out.println("File \"" + fileName + "\" not found");
	        
	     }
	    	     
	     String text="";
	     try {
	     String tmp;
	   
	     while((tmp = input.readLine()) != null)
	    	 text+=tmp;
	     }catch (IOException e) {
		        e.printStackTrace();
		     }
	    
	     return text;
	
	
	
	}
}
