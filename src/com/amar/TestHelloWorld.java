package com.amar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void test() {
		String result = System.getProperty("user.name");
		//System.out.println(result);
		assertEquals(result, "Amar");
	}

}
