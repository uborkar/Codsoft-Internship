// Java Program for Currency Conversion.
package currencyConvertor;

import java.util.*;

public class CurrencyConvertor {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Currency Selection
	        System.out.print("Enter the base currency (e.g., USD): ");
	        String baseCurrency = sc.nextLine().toUpperCase();

	        System.out.print("Enter the target currency (e.g., EUR): ");
	        String targetCurrency = sc.nextLine().toUpperCase();

	        // Dummy exchange rates for simplicity
	        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

	        if (exchangeRate == -1) {
	            System.out.println("Invalid currency or data not available.");
	            return;
	        }

	        // Step 2: Amount Input
	        System.out.print("Enter the amount in " + baseCurrency + ": ");
	        double amount = sc.nextDouble();

	        // Step 3: Currency Conversion
	        double convertedAmount = amount * exchangeRate;

	        // Step 4: Display Result
	        System.out.printf("%.2f %s is equivalent to %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

	        sc.close();
	    }

	    // Method to simulate fetching exchange rates
	    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
	        // Predefined exchange rates for beginner-friendly code
	        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
	            return 0.85;
	        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
	            return 74.5;
	        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
	            return 1.18;
	        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
	            return 0.013;
	        } else {
	            return -1; // Invalid currency combination
	        }
	    }
}
