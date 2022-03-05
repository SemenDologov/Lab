package Laba2;

import java.util.Random;

public class randomNum {
	private int Numer;
	public randomNum() {
		
	}
	
	
	public int getrandom() {	
        Random rnd = new Random();
        Numer = rnd.nextInt(700) + 1;
		return Numer;
		
	}
	
}
