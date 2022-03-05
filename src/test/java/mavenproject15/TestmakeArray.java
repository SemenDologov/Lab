package mavenproject15;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.makeArray;

public class TestmakeArray {
	static int[] asd;
	@BeforeClass
	public static void runBeforeClass() {
		
		makeArray zxcursed = new makeArray();
		asd = zxcursed.newArray();
		
	}
	@Test
	public void testLength() {
	assertEquals(8, asd.length);
	}
	@Test
	public void testIsNull() {
		for(int i = 0; i < asd.length; i++) {
			assertNotNull(asd[i]);

        }
	}
	
}
