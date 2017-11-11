package es.salesianos.edu.c;

public class C {

	public int sumTwoNumbers2(Integer n1, Integer n2) {
		if (null == n1 || null == n2) {
			throw new RuntimeException();
		}
		return n1 + n2;
	}
}
