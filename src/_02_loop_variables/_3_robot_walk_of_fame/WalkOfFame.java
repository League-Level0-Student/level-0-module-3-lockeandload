
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {

public static void main(String[] args) {
	
	
	Robot rob = new Robot();
	 rob.setWindowSize (1000,1000);
	 int robY =17;
		rob.setX(0);
		rob.setY(robY);
	
		rob.setSpeed(1000);
		rob.setPenColor(245,55,0);
		rob.turn(90);
		
		rob.penDown();
		for(int z=0;z<20;z++) {
		for(int y=0;y<20;y++) {
		for(int x=0; x<6;x++) {
		rob.move(15);
		rob.penUp();
		rob.move (10);
		rob.penDown();
		rob.move(15);
		rob.turn(144);
		}
rob.penUp();
rob.turn(-144);
rob.move(10);
		}
		robY += 40;
		rob.setX(0);
		rob.setY(robY);
		}
		rob.penUp();
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
