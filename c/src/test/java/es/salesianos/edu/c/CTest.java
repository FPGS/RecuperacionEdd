package es.salesianos.edu.c;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CTest {

	C clase = new C();

	@Test
	public void test() {
		Integer n1 = new Integer(5);
		Integer n2 = new Integer(6);
		assertEquals(11, clase.sumTwoNumbers2(n1, n2));
	}

	@Test
	public void testException() {
		Integer n1 = null;
		Integer n2 = new Integer(6);
		try {
			clase.sumTwoNumbers2(n1, n2);
			fail();
		} catch (Exception e) {
			System.out.println("tiene que entrar aqui");
		}
	}

	@Test
	public void testIfException2() {
		Integer n1 = new Integer(5);
		Integer n2 = new Integer(6);
		try {
			clase.sumTwoNumbers2(n1, n2);
			System.out.println("tiene que entrar aqui");
		} catch (Exception e) {
			fail();
		}
	}

}
