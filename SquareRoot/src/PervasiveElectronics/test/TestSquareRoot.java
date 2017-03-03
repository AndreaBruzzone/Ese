package PervasiveElectronics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import PervasiveElectronics.SquareRoot;

public class TestSquareRoot {

	@Test(expected = SquareRoot.NegativeNumException.class)
	public void testNegNum() throws Exception{
		SquareRoot.sqrt(-4);
	}
	@Test
	public void testSquareRoot() throws Exception{
		assertTrue(67 == SquareRoot.sqrt(67) * SquareRoot.sqrt(67));
	}
	@Test
	public void testSquareRootPrecision() throws Exception{
		assertEquals("SquareRoot precision error", Math.sqrt(67), SquareRoot.sqrt(67), 0.0001);
		
	}
}
