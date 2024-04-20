package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class Bottles99 {

	public static void main(String[] args) {
		String bottlecount = JOptionPane.showInputDialog("how many bottles of apple juice do you want?");

		int bottlecountInt = Integer.parseInt(bottlecount);

		//	for(bottlecountInt; x < bottlecountInt ;)



		//create new thing exe "x"
		//if "x" < other thing "y" then stop
		//	after every loop "x" incresses by "c"
		for (int x = (bottlecountInt); x > (bottlecountInt - bottlecountInt); x--) {
			if(x > 2 ){
			JOptionPane.showMessageDialog(null, x + " boxes of appple juice on the wall \n" + x + " boxes of apple juice \n" + "one comes off pass it around " + (x -1) + " boxes of apple juice on the wall" );
			}
			if(x == 2 ){
				JOptionPane.showMessageDialog(null, x + " boxes of appple juice on the wall \n" + x + " boxes of apple juice \n" + "one comes off pass it around " + (x -1) + " box of apple juice on the wall" );
			}
			if(x == 1 ){
				JOptionPane.showMessageDialog(null, x + " box of appple juice on the wall \n" + x + " box of apple juice \n" + "one comes off pass it around " + (x -1) + " boxes of apple juice on the wall" );
			}
			
			if(x <= 1 ){ 
				JOptionPane.showMessageDialog(null, "You drank all the apple juice");	

			}	
		}




















		////////////////////////////////////////////////////////////// Do not touch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	}
}
