package logic;





public class WordReplace {

	public String replace(String msg){
		
		String[] str = msg.split("\\s+");
        StringBuilder sb = new StringBuilder();
      
        String buff;
        buff = str[str.length-1];
        str[str.length-1]=str[0];
        str[0]=buff;
        
        for (int i = 0; i <str.length; i++) {
               sb.append(str[i] + " ");
           }
        
        
    
        return sb.toString().trim();
		
		
		
	}
	
	
}
