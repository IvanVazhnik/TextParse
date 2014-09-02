package logic;

import java.util.ArrayList;

import java.util.Collections;

public class WordSort {

	public void sort(String[] sentsToSort){
		ArrayList<String> words = new ArrayList<String>();
		for(String s : sentsToSort){
			String[] str = s.split("\\s+");
			for(String st : str){
				words.add(st);
			}
			
		}
		
		Collections.sort(words);
		
		for(String s: words){
			
			System.out.println(s);
		}
		
		
	}
	
	
	
}
