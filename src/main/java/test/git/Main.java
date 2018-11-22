package test.git;

import java.math.BigInteger;

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

		int mul = 1;
		if (args.length >= 2) {
			mul = Integer.parseInt(args[1]);
		}

		BigInteger m = BigInteger.valueOf(mul);

		new Fibbonaci().fibbonaci(max)
		        .stream()
		        .map(n -> n.multiply(m))
		        .forEach(System.out::println);
	}

	static void printHelp() {
		System.out.println("Aufruf mit java -jar <jarfile> <zahl>");
	}

}
