package elements;

import elements.Element;

public class HTMLElement implements Element {

	private String name = null;
	private String id= null;
	private String domClass = null;
	private String text = null;
	private HTMLElement innerHTMLElement = null;
	private ListofChildNodes<Object> listOfChildNodes= null;
	private AttributeStorage attributeStorage;
	private String space = (char)32+"";
	private String newLine = "\n";

	
	public HTMLElement(){
		attributeStorage = new AttributeStorage();
		listOfChildNodes = new ListofChildNodes<>();
	}
	public  void setName(String name) {
		this.name = name;
	}

	public  String getName() {
		return name;
	}

	public  void setId(String id) {
		this.id = id;
	}
	
	public  String getId() {
		return id;
	}
	
	
	public  String getDomClass() {
		return domClass;
	}
	
	public  void setDomClass(String domClass) {
		this.domClass = domClass;
	}
	
	public void setAtrribute(String key, String value){
		attributeStorage.putAttribute(key,value);
	}
	
	
	public String getAtrribute(String key){
		return attributeStorage.get(key);
	}
	
	public  void appendText(String text) {
		listOfChildNodes.add(text);
	}
	

	
	public  void appendInnerHTMLElement(HTMLElement innerHTMLElement) {
		listOfChildNodes.add(innerHTMLElement);
	}
	
	public  ListofChildNodes<Object> getInnerHTMLElement() {
		return listOfChildNodes;
	}
	
	public String getInnerText(){
		StringBuilder sb = new StringBuilder();
		if(listOfChildNodes!=null)
			for(Object node : listOfChildNodes){
				if(node instanceof String){
					sb.append(node);
				}
			}
			return sb.toString() ;		
	}
	
	
		
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(HTMLAttributes.rightAngular+name);
		
		for(String key : attributeStorage.keySet()){
		sb.append(space+Atrributes(key,attributeStorage.get(key)));	
		}
		sb.append(HTMLAttributes.leftAngular);
		sb.append(newLine);
		
		if(listOfChildNodes!=null)
		for(Object node : listOfChildNodes){
			if(node instanceof HTMLElement){
				sb.append(node.toString());
			}
			if(node instanceof String){
				sb.append(node);
			}
		}
		sb.append(endTag());
		return sb.toString() ;
		
	}
	private String endTag() {
		// TODO Auto-generated method stub
		return HTMLAttributes.rightAngular+"/"+name+HTMLAttributes.leftAngular;
	}
	private String Atrributes(String key, String value) {
		// TODO Auto-generated method stub
		return key+"="+Quotes(value);
	}
	private String Quotes(String value) {
		// TODO Auto-generated method stub
		return "\""+value+"\"";
	}

}
