package text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class GetCode {
	
	
	
	
	
	public ArrayList<String> codeInit(String text,String codeReg){
		ArrayList<String> codes = new ArrayList<String>();
		
		
		Matcher matcher = Pattern.compile(codeReg).matcher(text);
		while (matcher.find())
		{ codes.add(matcher.group());
		
		}
		
		return codes;
	}
	
	
}
