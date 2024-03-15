
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 1a. Change this line to give you a random number between 1 - 100. 

		int randomnum = new Random().nextInt(101);
		//System.out.println(randomnum);
		

		int randomNumTwo = new Random().nextInt(41)-20;
		//System.out.println(randomNumTwo);

	
	
		// 2a. Print out the random variable above

		// 11. Repeat steps 1 to 10 ten times
		JOptionPane.showMessageDialog(null, "Wellcome to the game HighLow, In this game you have 10 tries to gess what the random number is \n It has to be a number 1-100 \n If you guess too low it says higher \n if you gess too high it says lower \n you can also try (help) for a hint but it cost 5 turns out of 10 \n DO NOT NOT PUT IN AN INTERGER");
		for(int tries=0;tries<11;tries++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			String guess = JOptionPane.showInputDialog("Try count (" + tries+ ")" + "\n Guess a numeber 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		
			if(guess.equals("help")){ 
				JOptionPane.showMessageDialog(null, Integer.toString(randomnum+randomNumTwo));	
				tries += 4;
				continue;
			}
			int guessInt = Integer.parseInt(guess);	
			if(guessInt < randomnum){ 
				JOptionPane.showMessageDialog(null, "higher");	
				continue;
			}
			if(guessInt == randomnum){ 
				JOptionPane.showMessageDialog(null, "WINNER");	
				System.exit(0);
			}
			if(guessInt > randomnum){ 
				JOptionPane.showMessageDialog(null, "Lower");	
				continue;
		}
		}
		JOptionPane.showMessageDialog(null, "You lost \n lozer");
		System.exit(0);
		// 5. if the guess is correct
		// 6. Win
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		// 8. Tell them it's too high
		// 9. if the guess is low
		// 10. Tell them it's too low


		// 13. Tell them they lose

	}

}


