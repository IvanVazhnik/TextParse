package main;

import logic.WordReplace;
import logic.WordSort;
import text.GetCode;
import text.GetSent;
import text.Text;
import text.TextInit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Main {
	
	private static final Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		FileInputStream fis;
        Properties property = new Properties();
                
        try {
            fis = new FileInputStream("src/config.properties");
            property.load(fis);
 
            String fileName = property.getProperty("fileName");
            String codeReg = property.getProperty("codeReg");
            String sentReg = property.getProperty("sentReg");
                        
            String text;
    		String textWoCode;
    		TextInit tI = new TextInit();
    		text = tI.getText(fileName);
    		    		
    		GetCode gC = new GetCode();
    				
    		textWoCode = text.replaceAll(codeReg, "");
    		GetSent gS = new GetSent();
    	    		
    		Text textClass = new Text(gS.sentInit(textWoCode, sentReg),gC.codeInit(text,codeReg));
    			
    		WordReplace wR = new WordReplace();
    		WordSort wS = new WordSort();
    		
    		wS.sort(textClass.getSents());
    		for(String s : textClass.getSents()){
    			System.out.println(wR.replace(s));
    		}
            
             
        } catch (IOException e) {
        	logger.error(e.getMessage(), e);
        }
           
		        

	}

}
