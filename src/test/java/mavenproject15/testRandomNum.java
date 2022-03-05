package mavenproject15;
import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.randomNum;

public class testRandomNum {

	
	@Test
	public void test() {
		int i;
		randomNum gas = new randomNum();
		i=gas.getrandom();
		assertTrue((i <= 700) && (i>=1));
		
	}

}