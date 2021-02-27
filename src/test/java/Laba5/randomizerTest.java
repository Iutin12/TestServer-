package Laba5;

import static org.junit.Assert.*;

import org.junit.Test;

public class randomizerTest {

	@Test
	public void test() {
		assertTrue(Laba2.randomizer.rand() <= 80 && Laba2.randomizer.rand() >= 40 );
		

}
}