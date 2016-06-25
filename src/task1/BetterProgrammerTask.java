package task1;

public class BetterProgrammerTask {

	public static Change getCorrectChange(int cents) {
        /*
          Please implement this method to
          take cents as a parameter
          and return an equal amount in dollars and coins using the minimum number of
          coins possible.
          For example: 164 cents = 1 dollar, 2 quarters, 1 dime and 4 cents.
          Return null if the parameter is negative.

         */

		if (cents < 0) return null;

		int dollars = cents / 100;
		int quarters = (cents % 100) / 25;
		int dimes = (cents % 25) / 10;
		int nickels = (cents % 10) / 5;
		cents = cents % 5;

		return new Change(dollars, quarters, dimes, nickels, cents);
	}


	// Please do not change this class
	static class Change {
		private final int _dollars;
		private final int _quarters; //25 cents
		private final int _dimes; // 10 cents
		private final int _nickels; // 5 cents
		private final int _cents; // 1 cent


		public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
			_dollars = dollars;
			_quarters = quarters;
			_dimes = dimes;
			_nickels = nickels;
			_cents = cents;
		}


		public int getDollars() {
			return _dollars;
		}


		public int getQuarters() {
			return _quarters;
		}


		public int getDimes() {
			return _dimes;
		}


		public int getNickels() {
			return _nickels;
		}


		public int getCents() {
			return _cents;
		}
	}
}




