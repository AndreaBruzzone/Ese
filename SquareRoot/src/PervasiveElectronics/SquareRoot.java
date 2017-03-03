package PervasiveElectronics;

public class SquareRoot {

	public static class NegativeNumException extends Exception {

		public NegativeNumException(String message) {
			super(message);
		}

	}

	public static double sqrt(double n) throws NegativeNumException {
		if (n<0)
			throw new NegativeNumException("NO Negative number!");
		double guess = n/2;
		double r;
		int N = 100;
		for (int i = 0; i<N; i++) {
			r = n/guess;
			guess = (guess + r)/2;
		}
		return guess;
	}

}
