package nodes;

import nodes.Element;

public interface HTMLElement extends Element {
	
public void setHTMLElementName(String d_ame);
public String getElementDomName();

public void setHTMLElementTitle(String d_title);
public String getHTMLElementTitle();

public void setHTMLElementClass(String d_class);
public String getHTMLElementClass();

public void setHTMLElementId(String d_id);
public String getHTMLElementId();

public void setHTMLElementDir(String d_dir);
public String getHTMLElementDir();

public void setInnerHTMLElement(Object d_innerHTMLElement );
public Object getInnerHTMLElement();

public void setHTMLElementStyle(String d_style);
public void getHTMLElementStyle();


}
