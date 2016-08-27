package test;

import static org.junit.Assert.*;

import org.junit.Test;

import elements.HTMLElement;

public class HTMLElementTest {
HTMLElement element = new HTMLElement();
	@Test
	public void test() {
		element.setName("Name");
		element.setAtrribute("id", "test");
		element.setAtrribute("class", "test");
		System.out.println(element.toString());
	}

}
