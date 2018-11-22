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
			} else if (args[0].trim()
			        .equals("-hf")) {
				System.out.println("Hallo Fibonacci");
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

		int add = 0;
		if (args.length >= 3) {
			add = Integer.parseInt(args[2]);
		}

		BigInteger a = BigInteger.valueOf(add);

		Fibbonaci fib = new Fibbonaci();

		fib.banner("Anfang");

		new Fibbonaci().fibbonaci(max)
		        .stream()
		        .map(n -> n.multiply(m))
		        .map(n -> n.add(a))
		        .forEach(System.out::println);

		fib.banner("Ende");
	}

	static void printHelp() {
		System.out.println(CALL);
	}

}
