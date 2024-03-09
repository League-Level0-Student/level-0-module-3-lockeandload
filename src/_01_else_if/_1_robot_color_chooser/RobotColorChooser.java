
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		int baseSize = 200;		
		int flameSize = 130;
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(9);

		
		for(int ick = 0;ick<3000;ick++) { 

			String  [] robPaintColor = {"Red", "Green", "Blue", "I'm felling lucky"};
			int robPaintColorChooser = JOptionPane.showOptionDialog(null, "Chose what color you want Rob.exe to use", null, 0, 3, null, robPaintColor, null);
			if (robPaintColorChooser==0) {
				rob.setPenColor(255,0,0);
			}
			if (robPaintColorChooser==1) {
				rob.setPenColor(0,255,0);
			}
			if (robPaintColorChooser==2) {
				rob.setPenColor(0,0,255);
			}
			if (robPaintColorChooser==3) {
				rob.setRandomPenColor();
			}
			rob.turn(45);
			rob.move(64);


			rob.turn(-40);
			rob.move(flameSize);
			rob.turn(170);
			rob.move(flameSize);
			rob.turn(64);
			rob.move(baseSize);
		}






	}
}
