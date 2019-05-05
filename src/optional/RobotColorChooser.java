package optional;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot robot = new Robot();

		robot.penDown();
		robot.setSpeed(10);

		//making a square shape
		for (int j = 0; j < 4; j++) 
		{
			robot.setPenWidth(10);
			robot.setRandomPenColor();
			robot.move(50);
			robot.turn(90);
		}

		robot.turn(-30);
		
		
		for (int i = 0; i < 2; i++)
		{

			String answerColor = JOptionPane
					.showInputDialog("What color would you like the robot to draw(red/green/blue)??");

			if (answerColor.equals("red")) {
				robot.setPenColor(255, 0, 0);
			} else if (answerColor.equals("green")) {
				robot.setPenColor(0, 255, 0);
			} else if (answerColor.equals("blue")) {
				robot.setPenColor(0, 0, 255);
			} else {
				robot.setRandomPenColor();
			}
			
			//making a hexagon shape
			for (int j = 0; j < 6; j++) 
			{
				robot.setPenWidth(20);
				robot.move(60);
				robot.turn(60);
			}

			robot.move(8);

		}

		String answerColor = JOptionPane
				.showInputDialog("What color would you like the robot to draw(red/green/blue)??");

		if (answerColor.equals("red")) {
			robot.setPenColor(255, 0, 0);
		} else if (answerColor.equals("green")) {
			robot.setPenColor(0, 255, 0);
		} else if (answerColor.equals("blue")) {
			robot.setPenColor(0, 0, 255);
		} else {
			robot.setRandomPenColor();

		}
		robot.move(-5);

		//making a bigger hexagon
		for (int j = 0; j < 6; j++) {
			robot.setPenWidth(20);
			robot.move(70);
			robot.turn(60);
		}

	}
}
