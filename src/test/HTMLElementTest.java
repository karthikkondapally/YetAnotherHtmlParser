package test;

import static org.junit.Assert.*;

import org.junit.Test;

import elements.HTMLElement;

public class HTMLElementTest {
HTMLElement element = new HTMLElement();
HTMLElement element2 = new HTMLElement();

String test  = "<Name id=\"test\" class=\"test\">\n</Name>";
	@Test
	public void test() {
		element.setName("Name");
		element.setAtrribute("id", "test");
		element.setAtrribute("class", "test");
		assertEquals(test, element.toString());
		element.appendText("test Text");
		assertEquals("test Text",element.getInnerText());
		element2.setName("name2");
		element2.setAtrribute("id", "test2");
		element2.setAtrribute("class", "test2");
		element.appendInnerHTMLElement(element2);
		System.out.println(element.toString());
		
	}

}
