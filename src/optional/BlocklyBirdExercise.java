package optional;

/* This is an online puzzle from Google to practice if/else logic. 
*			bit.ly/bird-puzzle
*/

public class BlocklyBirdExercise {
	//level one
	heading(45);
	
	//level two
	if (noWorm()) {
		  heading(0);
		} else {
		  heading(90);
		}
	//level three
	if (noWorm()) {
		  heading(300);
		} else {
		  heading(60);
		}
	
	//level four
	if (getX() < 80) {
		  heading(0);
		} else {
		  heading(270);
		}
	
	//level five
	if (getY() > 20) {
		  heading(270);
		} else {
		  heading(180);
		}
	
	//level six
	
	if (noWorm()) {
		  heading(330);
		} else if (getY() < 80) {
		  heading(90);
		} else {
		  heading(180);
		}
	//level seven
	if (getY() > 50) {
		  heading(225);
		} else if (noWorm()) {
		  heading(330);
		} else {
		  heading(180);
		}
	//level eight
	if (getX() < 50) {
		  heading(45);
		} else if (noWorm()) {
		  heading(315);
		} else if (getX() > 70 && getY() < 30) {
		  heading(180);
		} else if (getX() > 50 && getY() < 50) {
		  heading(135);
		} else {
		  heading(45);
		}
	//level nine
	if (getX() > 20 && noWorm()) {
		  heading(180);
		} else if (getY() > 20 && noWorm()) {
		  heading(270);
		} else if (getY() < 70 && getX() < 40) {
		  heading(90);
		} else {
		  heading(315);
		}
	
	//level ten
	if (getX() < 30 && getY() < 90) {
		  heading(90);
		} else if (getX() < 80 && noWorm()) {
		  heading(0);
		} else if (getY() > 30 && noWorm()) {
		  heading(270);
		} else if (getX() > 20 && getY() < 80) {
		  heading(90);
		} else if (getX() > 20) {
			heading(180);
		}else if (getY() > 20) {
			heading(270);
		} 
	
	
}
