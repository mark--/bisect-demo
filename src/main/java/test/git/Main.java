package test.git;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		if (args.length >= 1) {
			if (args[0].trim()
			        .equals("-h")) {
				System.out.println("Aufruf mit java -jar .. <MAX> <MUL>");
				return;
			}
		}

		String maxArgument = args.length > 0 ? args[0] : "100";
		BigInteger max;
		try {
			max = new BigInteger(maxArgument);
		} catch (NumberFormatException e) {
			System.err.println("Wrong Argument, number exptected: " + args[0]);
			return;
		}
		new Fibbonaci().fibbonaci(max)
		        .stream()
		        .forEach(System.out::println);
	}

	static void printHelp() {
		System.out.println("Aufruf mit java -jar <jarfile> <zahl>");
	}

}
