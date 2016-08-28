package test;

import static org.junit.Assert.*;

import org.junit.Test;

import elements.HTMLElement;

public class HTMLElementTest {
HTMLElement element = new HTMLElement();
String test  = "<Name id=\"test\" class=\"test\">\n</Name>";
	@Test
	public void test() {
		element.setName("Name");
		element.setAtrribute("id", "test");
		element.setAtrribute("class", "test");
		assertEquals(test, element.toString());
	}

}
