package optional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		String momsBirthday = "July 12th";
		String dadsBirthday = "Februar 15th";
		String myBirthday = "June 8th";

		//putting user's answer to a variable
		String birthDayRespons = JOptionPane.showInputDialog("Whose birthday would you like? moms/dads/myBirthday");
		
		//displaying user's response
		 JOptionPane.showMessageDialog(null,"You have chosen " + birthDayRespons);
		
		 //going into if else statement
		 if (birthDayRespons.equals("momsBirthday")){
				JOptionPane.showMessageDialog(null, "Mom's birthday is on " + momsBirthday);
		 	}else if (birthDayRespons.equals("dadsBirthday")){			 		
				JOptionPane.showMessageDialog(null, "Dad's birthday is on " + dadsBirthday);
		 	}else if (birthDayRespons.equals("myBirthday")){			 		
				JOptionPane.showMessageDialog(null, "My birthday is on " + myBirthday);
		 	}else {			 		
				JOptionPane.showMessageDialog(null, "Sorry, I do  not remeber that person's b-day. " );
		 	}

	}
}
