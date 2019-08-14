package co.grandcircus;

public class Speller {

	public static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static String[] tens = { "", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			" ninety" };

	public static String moneyToWords(double money) {
		long dollars = (long) money;
		long cents = Math.round((money - dollars) * 100);
		String dollarsTotal = "";
		String centsTotal = "";
		
		dollarsTotal = dollarsConvert(dollars);
		centsTotal = centsConvert(cents);
		
		if (dollars > 0) {
			dollarsTotal += " dollar" + (dollars == 1 ? "" : "s");
		}
		
		if (cents > 0) {
			centsTotal = " and" + centsTotal;
			centsTotal += " cent" + (cents == 1 ? "" : "s");
		}
		return dollarsTotal + centsTotal;
	}
	
	public static String dollarsConvert(long dollars) {
		String dollarsTotal = "";
		if (dollars < 20) {
			 return dollarsTotal = ones[(int) dollars];
		}
		if (dollars < 100) {
			return dollarsTotal = tens[(int) dollars / 10] + ((dollars % 10 != 0) ? " " : "") + ones[(int) dollars % 10];
		}
		
		if (dollars < 1000) {
			return dollarsTotal = ones[(int) dollars / 100] 
			+ " hundred" + tens[(int) (dollars % 100) / 10] 
		      + ((dollars % 20 != 0) ? " " : "") 
		      + ones[(int) dollars % 20];
		}
		return dollarsTotal;
	}
		
		public static String centsConvert(long cents) {
			String centsTotal = "";
			if (cents < 20) {
				 return centsTotal = ones[(int) cents];
			}
			if (cents < 100) {
				return centsTotal = tens[(int) cents / 10] + ((cents % 10 != 0) ? " " : "") + ones[(int) cents % 10];
			}
		
			return centsTotal;
	}
}
