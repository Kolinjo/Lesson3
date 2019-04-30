package exercises;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// introducing variable random number
		int randomNumber = new Random().nextInt(100);
		System.out.println(randomNumber);

		System.out.println("Enter one number in range form 0 to 100.");
		// going into for loop for 5 consecutive times
		for (int i = 1; i <= 5; i++) {
			// variable which store user's input
			int enteredNumber = input.nextInt();
			//going through if-else stage 
			if (enteredNumber > randomNumber) {
				System.out.println(
						enteredNumber + " is higher than guessed number. You have " + (5 - i) + " tries more.");
			} else if (enteredNumber < randomNumber) {
				System.out.println(
						enteredNumber + " is smaller than guessed number. You have " + (5 - i) + " tries more.");
			} else {
				System.out.println(enteredNumber + " is right number , great!!!.");
			}
		}
		System.out.println("More luck next time!!");
		input.close();

	}

}
