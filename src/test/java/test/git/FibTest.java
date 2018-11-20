package test.git;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FibTest {

	@Test
	public void fib() {
		assertEquals(List.of(1, 1, 2, 3), new Main().fibbonaci(3));
	}
}
