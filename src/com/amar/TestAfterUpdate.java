package com.amar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAfterUpdate {

	@Test
	public void test() {
		HelloWorld a=new HelloWorld();
		String Result=a.getPrope();
		System.out.println(Result);
		assertEquals(Result, "Masote");
	}

}
