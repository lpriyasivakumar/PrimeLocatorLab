package PrimeLocator;

import static PrimeLocator.PrimeLocator.locate;
import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeLocatorTest {

	@Test
	public void testWith1() {
		assertEquals(2,locate(1));
	}
	@Test
	public void testWith2() {
		assertEquals(3,locate(2));
	}
	@Test
	public void testWith3() {
		assertEquals(5,locate(3));
	}
	
	@Test
	public void testWith4(){
		assertEquals(7,locate(4));
	}
	
	@Test
	public void testWith10() throws Exception {
		assertEquals(29,locate(10));		
	}
	
	@Test
	public void testWith15() throws Exception {
		assertEquals(47, locate(15));
	}
	
	@Test
	public void testWith25() throws Exception {
		assertEquals(97, locate(25));
	}
	@Test
	public void testWith50() throws Exception {
		assertEquals(229, locate(50));
	}
	@Test
	public void testWith100() throws Exception {
		assertEquals(541, locate(100));
	}
	@Test (expected=IndexOutOfBoundsException.class)
	public void whenInputIsZeroExceptionIsThrown() {
		locate(0);
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void whenInputIsNegativeExceptionIsThrown() {
		locate(-10);
	}
	

}
