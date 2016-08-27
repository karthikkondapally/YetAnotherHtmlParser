package elements;

import java.util.HashMap;

public class AttributeStorage extends HashMap<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void putAttribute(String key, String value) {
		this.put(key,value);
	}

}
