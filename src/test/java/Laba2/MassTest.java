package Laba2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MassTest {

	static int[] arr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	arr = new int[5] ;
	
	for (int i =0 ;i<5;i++) {
	arr[i] = randomizer.rand();  
	}
	}
	

	@Test
	public void test() {
		for (int i = 0; i < 5; i++ ){
		assertNotNull (arr[i]);
		}
	}

}
