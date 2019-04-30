package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. 
 * It was my favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// 2. Catch the user's answer in a String
		// 3. If the user spelled the word correctly, speak "correct"
		// 4. Otherwise say "wrong"
		// 5. Repeat the process for other word
		// 6. Calculate the user's score and give it to them at the end of the game 
		
		//introducing score variable needed for calculating a score of positive spelling
		int score = 0;
		
		//first word
		speak("mandlebrot");
				String answer = JOptionPane.showInputDialog("Spell the word correctly : ");
				if (answer.equalsIgnoreCase("mandlebrot")) {
					JOptionPane.showMessageDialog(null, "Bravo amigo, correctly spelt!");
					score +=1;
				}else {	
					JOptionPane.showMessageDialog(null, "Wrongly spelt");
					
				}
				System.out.println(score);
			//second word	
				speak("integrate");
				String answer1 = JOptionPane.showInputDialog("Spell the word correctly : ");
				
				if (answer1.equalsIgnoreCase("integrate")) {
					JOptionPane.showMessageDialog(null, "Bravo amigo, correctly spelt!");
					score +=1;
				}else {	
					JOptionPane.showMessageDialog(null, "Wrongly spelt");
					
				}
				System.out.println(score);
			//third word	
				speak("unimaginable");
				String answer2 = JOptionPane.showInputDialog("Spell the word correctly : ");
				
				if (answer2.equalsIgnoreCase("unimaginable")) {
					JOptionPane.showMessageDialog(null, "Bravo amigo, correctly spelt!");
					score +=1;
				}else {	
					JOptionPane.showMessageDialog(null, "Wrongly spelt");
					
				}
				System.out.println(score);
			//forth word	
				speak("recyclable");
				String answer3 = JOptionPane.showInputDialog("Spell the word correctly : ");
				
				if (answer3.equalsIgnoreCase("recyclable")) {
					JOptionPane.showMessageDialog(null, "Bravo amigo, correctly spelt!");
					score +=1;
				}else {	
					JOptionPane.showMessageDialog(null, "Wrongly spelt");
					
				}
				System.out.println(score);
			//fifth word	
				speak("biodegradable");
				String answer4 = JOptionPane.showInputDialog("Spell the word correctly : ");
				
				if (answer4.equalsIgnoreCase("biodegradable")) {
					JOptionPane.showMessageDialog(null, "Bravo amigo, correctly spelt!");
					score +=1;
				}else {	
					JOptionPane.showMessageDialog(null, "Wrongly spelt");
					
				}
				JOptionPane.showMessageDialog(null, "Total score or correct spelling is " + score);	
		
		
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
