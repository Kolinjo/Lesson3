package exercises;

import javax.swing.JOptionPane;

/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
 * numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
 * by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
 * 
 * So the rules are: Any number divisible by 3 is replaced by the word fizz Any
 * number divisible by 5 is replaced by the word buzz. Numbers divisible by both
 * 3 and 5 become fizzbuzz.
 * 
 * Print your results to the console, or using JOptionPane if you like.
 **/

public class FizzBuzz {

	public static void main(String[] args) {

		// asking user a question
		String question = JOptionPane.showInputDialog("Do you want to play a little game? (Yes or No)");

		// going into if - else stage
		if (question.equalsIgnoreCase("Yes")) {
			String enteredNumber = JOptionPane.showInputDialog("Enter one number in range from 1 to 20.");
			// changing string in integer
			int enteredNumberAsInt = Integer.parseInt(enteredNumber);
			// main if - else stage 
			if (enteredNumberAsInt % 3 == 0 && enteredNumberAsInt % 5 == 0) {
				JOptionPane.showMessageDialog(null, "FizzBuzz");
			} else if (enteredNumberAsInt % 3 == 0) {
				JOptionPane.showMessageDialog(null, "Fizz");
			} else if (enteredNumberAsInt % 5 == 0) {
				JOptionPane.showMessageDialog(null, "Buzz");
			}else {
				JOptionPane.showMessageDialog(null, enteredNumberAsInt + " isn't Fizz nor Buzz");
			}
			
		} else if (question.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "Be a child, play a game!");

		} else {
			JOptionPane.showMessageDialog(null, "Incorrect input.");
		}

	}
}
