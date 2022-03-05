package Laba2;
public class makeArray {
	    public int[] newArray() {
	    	randomNum chislo = new randomNum();
	    int[] myArray = new int[8];
	    for(int i = 0; i < myArray.length; i++) {
            myArray[i] = chislo.getrandom();
       }       
	 return myArray;  
	}
}
