package Laba;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Sort;

public class SortTest {

	static int[] testArray;
	static int[] rightArray;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testArray = new int [] {5,3,2,1,4};
		rightArray = new int []{1,2,3,4,5};
	}

	

	@Test
	public void test() {
		assertArrayEquals(rightArray,Sort.sorter(testArray));
		
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testArray = null;
		
	}

}
