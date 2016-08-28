package elements;

import java.util.HashMap;

public class HtmlSpan extends HTMLElement{
   private static final String span = HTMLAttributes.SPAN;
   
   public HtmlSpan(){
	   setName(span);
   }
   
   public HtmlSpan(HashMap<String,String> mapOfAttributes){
	   setName(span);
   }
	
}
