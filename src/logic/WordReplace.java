package logic;

import java.util.ArrayList;
import java.util.Collections;



public class WordReplace {

	public String replace(String msg){
		
		String[] str = msg.split("\\s+");
        StringBuilder sb = new StringBuilder();
      
             	ArrayList<String> words = new ArrayList<String>();
        	for(String s : str){
        		words.add(s);
        		
        	}
        	Collections.swap(words, 0, words.size());
        
        for(String s: words){
        	sb.append(s+" ");
        	
        }
            	
            
    
        return sb.toString().trim();
		
		
		
	}
	
	
}
