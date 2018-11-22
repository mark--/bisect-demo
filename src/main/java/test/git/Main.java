package test.git;

import java.math.BigInteger;

public class Main {

	public static final String CALL = "Call java -jar .. <MAX> <MUL>";

	public static void main(String[] args) {

		if (args.length >= 1) {
			if (args[0].trim()
			        .equals("-h")) {
				System.out.println(CALL);
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
		System.out.println(CALL);
	}

}
