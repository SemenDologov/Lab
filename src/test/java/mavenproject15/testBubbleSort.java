package mavenproject15;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.BubbleSort;

public class testBubbleSort {
	static int[] nums;
	
	@BeforeClass
	public static void runBeforeClass() {
		nums = new int[8];
		nums[0] = 1;
		nums[1] = 300;
		nums[2] = 50;
		nums[3] = 100;
		nums[4] = 200;
		nums[5] = 600;
		nums[6] = 30;
		nums[7] = 700;
	}
	
					
	@Test
	public void test() {
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(nums);
		for(int i = 0; i < nums.length - 1; i++) {
		assertTrue(nums[i] < nums[i+1]);
        }
	
		
	}

	@AfterClass
	public static void runAfterClass() {
		nums = null;
	}
	
	
	
}
