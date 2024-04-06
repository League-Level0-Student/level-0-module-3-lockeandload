
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {

public static void main(String[] args) {
	
	int baseSize = 200;
	Robot rob = new Robot();
	 rob.setWindowSize (1000,1000);
		rob.setX(0);
	
		rob.setSpeed(500);
		rob.setPenColor(245,55,0);
		rob.turn(90);
		rob.move(400);
		rob.penDown();
		
	
		rob.move(100);
		rob.turn(144);
		rob.move(100);
		rob.turn(-90);
		rob.move(100);
		//rob.turn(144);
		//rob.move(100);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		// 2. Make the robot draw a star shape. Hint: angle]=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
