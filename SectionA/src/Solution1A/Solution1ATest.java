package Solution1A;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;



public class Solution1ATest {

	@Test
	public void testSing() {
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 
        System.setOut(new PrintStream(outContent));
		 
		Bird bird = new Bird();
		bird.sing();
		assertEquals("I am singing", outContent.toString() );		
	}

}
