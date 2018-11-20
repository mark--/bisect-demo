package test.git;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String maxArgument = args.length > 0 ? args[0] : "100";
		BigInteger max;
		try {
			max = new BigInteger(maxArgument);
		} catch (NumberFormatException e) {
			System.err.println("Wrong Argument, number exptected: " + args[0]);
			return;
		}
		new Main().fibbonaci(max)
		        .stream()
		        .forEach(System.out::println);
	}

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

	static void printHelp() {
		System.out.println("Aufruf mit java -jar <jarfile> <zahl>");
	}

}
