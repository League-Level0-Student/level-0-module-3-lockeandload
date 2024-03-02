
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(9);
		
		//2. Make the robot draw a shape (this will take more than one line of code)	rob.turn(45);
		for(int ick = 0;ick<3000;ick++) { 
			String  [] adventures = {"low lv Doge", "low lv Hit", "Low lv Health", "Low lv Damage", "Medium lv Doge", "Medium lv Hit", "Medium lv Health", "Medium lv Damage", "High lv Doge", "High lv Hit", "High lv Health", "High lv Damage"};
			String  [] adventuresLvOne = {"low lv Doge", "low lv Hit", "Low lv Health", "Low lv Damage"};
			String  [] leftOrRight = {"Left", "Right"};
			String  [] roughOrSoft = {"Rough(lot of loot, DoT, and harder enemys)", "Smoth path(less loot, no DoT, easyer enemys)"};
			int Adventures = JOptionPane.showOptionDialog(null, "Chose an adventure to go on", null, 0, 3, null, adventuresLvOne, null);
rob.turn(45);
		 rob.move(64);
			

			rob.turn(-40);
			rob.move(flameSize);
			rob.turn(170);
			rob.move(flameSize);
			rob.turn(64);
			rob.move(baseSize);
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
