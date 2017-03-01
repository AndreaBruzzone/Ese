package PervasiveElectronicExamples;

import java.util.Scanner;

public class JavaCalc {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter an expression of the form 3 * 5:");
			double n1 = scanner.nextDouble();
			String op = scanner.next();
			double n2 = scanner.nextDouble();

			switch (op) {
			case "+":
				System.out.println("Result = " + (n1 + n2));
				break;
			case "-":
				System.out.println("Result = " + (n1 - n2));
				break;
			case "/":
				System.out.println("Result = " + (n1 / n2));
				break;
			case "*":
				System.out.println("Result = " + (n1 * n2));
				break;
			default:
				break;
			}
		}
	}

}
