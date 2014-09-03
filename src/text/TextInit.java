package text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import main.Main;

import org.apache.log4j.Logger;


public class TextInit {
	
	
	private static final Logger logger = Logger.getLogger(TextInit.class);
	
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
	    	 logger.error(e.getMessage(), e);
		     }
	    
	     return text;
	
	
	
	}
}
