package test.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Main().fibbonaci(Integer.parseInt(args[0])));
	}

	public List<Integer> fibbonaci(int n) {
		LinkedList<Integer> result = new LinkedList<Integer>();

		int a = 1, b = 1;

		result.add(a);
		while (b <= n) {
			result.add(b);

			int c = a + b;
			a = b;
			b = c;

		}
		return result;
	}

	static void printHelp() {
		System.out.println("Aufruf mit java -jar <jarfile> <zahl>");
	}

}
