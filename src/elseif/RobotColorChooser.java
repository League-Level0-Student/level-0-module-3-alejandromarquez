//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot color = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String pen = JOptionPane.showInputDialog("what colors do you want choose one (red,blue,or green)");
		//5. Use an if/else statement to set the pen color that the user requested
if (pen.equals("red")) {
	color.setPenColor(Color.red);
}
if (pen.equals("blue")) {
color.setPenColor(Color.blue);	
}
if (pen.equals("green")) {
color.setPenColor(Color.green);	
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	color.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		color.setPenWidth(100);
	    //2. Make the robot draw a shape (this will take more than one line of code)
  color.penDown();
  color.move(200);
color.turn(90);
color.move(50);
color.turn(90);
color.move(200);
color.turn(90);
color.move(90);
	}
}
