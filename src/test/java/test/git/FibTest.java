package test.git;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibTest {

	@Test
	public void fibbonaciUpto20IsCorrect() {
		assertEquals(List.of(1, 1, 2, 3, 5, 8, 13)
		        .stream()
		        .map(BigInteger::valueOf)
		        .collect(toList()), new Main().fibbonaci(BigInteger.valueOf(20)));
	}

	@Test
	public void fib2() {
		assertEquals(List.of(1, 1, 2, 3, 5, 8)
		        .stream()
		        .map(BigInteger::valueOf)
		        .collect(toList()), new Main().fibbonaci(BigInteger.valueOf(10)));
	}

	@Test
	public void fib3() {
		assertEquals(List.of(), new Main().fibbonaci(BigInteger.valueOf(0)));
	}

	@Test
	public void fib4() {
		assertEquals(List.of(1)
		        .stream()
		        .map(BigInteger::valueOf)
		        .collect(toList()), new Main().fibbonaci(BigInteger.valueOf(1)));
	}

	public void noArgumentRaisesNoException() {
		Main.main(new String[] {});
	}

	@Test
	public void invalidArgumentRaisesNoException() {
		Main.main(new String[] { "foo" });
	}

}
