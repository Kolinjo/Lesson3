package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {

	public static void main(String[] args) {
		// put answer in a variable
		String answer = JOptionPane.showInputDialog("Are you happy ?? (yes/no) ");

		// depending on users answer, we are showing different possibilities
		if (answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		} else if (answer.equalsIgnoreCase("No")) {
			String answer1 = JOptionPane.showInputDialog("Do you want to be happy??");

			if (answer1.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "You need to change something!");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
			}
		}

	}

}
