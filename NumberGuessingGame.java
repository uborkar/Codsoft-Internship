/* Simple Java program to create a Number Guessing Game where System  will generate a random number 
 * And user need to guess the number correct in 5 chances if fails,
 * Can get another round to play. (Just 5 rounds)50  
 * Lastly Score will be displayed.
 */
package numbergame;

import java.util.*;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int roundCount = 1;
		
		while(true) {
			System.out.println("\nRound "+ roundCount);
			int lowerBound = 1;
			int upperBound = 100;
			int maxAttempts = 5;
			int attempts = 0;
			
			int secretNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
			
			while(attempts < maxAttempts) {
				System.out.println("Guess a Number Between  " + lowerBound + " and " + upperBound + ": ");
				int guess;
				 try {
	                    guess = Integer.parseInt(sc.nextLine());
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. Please enter a number.");
	                    continue;
	                }
				 	
				 	attempts++;
				 	
				 	if(guess == secretNumber) {
				 		System.out.println("Congratulations! You Guessed the number in " + attempts + "attempts.");
				 		score++;
				 		break;
				 	}
				 	else if(guess < secretNumber) {
				 		System.out.println("Too low. Try Again.");
				 	}else {
				 		System.out.println("Too high. Try Again.");
				 	}
			}
			if(attempts == maxAttempts) {
				System.out.println("You've reached the maximum number of attempts. The Secret number was " + secretNumber);
			}
			
			roundCount++;
			
			System.out.println("Do you want to play another round? (yes/No): ");
			String playAgain = sc.nextLine().toLowerCase();
			if(!playAgain.equals("yes")) {
				break;
			}
		}
		System.out.println("\nGame over! Your final score is " + score);
        sc.close();
	}
}


