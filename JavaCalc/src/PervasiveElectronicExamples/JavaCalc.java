package PervasiveElectronicExamples;

import java.util.Scanner;

public class JavaCalc {

	public static void main(String[] args) {
		double n1, n2;
		String op;
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter first number:");
		n1 = scannerObject.nextDouble();
		System.out.println("Enter second number:");
		n2 = scannerObject.nextDouble();
		Scanner scannerOp = new Scanner(System.in);
		System.out.println("Enter operation:");
		op = scannerOp.next();

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
