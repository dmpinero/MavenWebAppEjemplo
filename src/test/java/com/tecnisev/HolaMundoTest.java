package com.tecnisev;

import junit.framework.TestCase;

public class HolaMundoTest extends TestCase 
{
	public void testObjeto()
	{
		HolaMundo hola = new HolaMundo();
		assertEquals(0, hola.getVar());
	}
}
