package text;

import java.util.ArrayList;

public class Text {

	
	String[] sents;
	ArrayList<String> code;
	
	
	public Text(String[] sents,ArrayList<String> codes){
		this.sents = sents;
		this.code = codes;
		
	}
	
	
	public String[] getSents() {
		return sents;
	}
	public void setSents(String[] sents) {
		this.sents = sents;
	}
	public ArrayList<String> getCode() {
		return code;
	}
	public void setCode(ArrayList<String> code) {
		this.code = code;
	}
	
	
	
	
}
