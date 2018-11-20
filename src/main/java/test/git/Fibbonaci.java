package test.git;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Fibbonaci {
	public List<BigInteger> fibbonaci(BigInteger n) {
		LinkedList<BigInteger> result = new LinkedList<BigInteger>();

		if (n.compareTo(BigInteger.ONE) < 0) {
			return result;
		}

		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;

		result.add(a);
		while (b.compareTo(n) < 0) {
			result.add(b);

			BigInteger c = a.add(b);
			a = b;
			b = c;

		}
		return result;
	}
}
