package test.git;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FibTest {

	@Test
	public void fib() {
		assertEquals(List.of(1, 1, 2, 3), new Main().fibbonaci(3));
	}

	@Test
	public void fib2() {
		assertEquals(List.of(1, 1, 2, 3, 5, 8), new Main().fibbonaci(10));
	}

	@Test
	public void fib3() {
		assertEquals(List.of(), new Main().fibbonaci(0));
	}

	@Test
	public void fib4() {
		assertEquals(List.of(1, 1), new Main().fibbonaci(1));
	}
}
