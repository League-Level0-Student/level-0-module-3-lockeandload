package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy_about_not_makeing_a_class_you_lazy_peice_of_sh {
	public static void main (String[] args) {

		String  [] areYouHappy = {"No", "Yes"};
		String  [] areYouHappy_No = {"No", "Yes"};
		String  [] areYouHappy_Yes = {"No", "Yes"};
		//String  [] areYouHappy = {"No", "Yes"};
		//String  [] areYouHappy = {"No", "Yes"};
		int areYouhappy = JOptionPane.showOptionDialog(null, "are you happy?", null, 0, 1, null, areYouHappy, null);		
		System.out.println(areYouhappy);
		int areYouhappy_no = 7;
		if(areYouhappy == 0) {
			areYouhappy_no = JOptionPane.showOptionDialog(null, "is it becase you haven't eaten?", null, 0, 1, null, areYouHappy_No, null);		
			System.out.println(areYouhappy);
		}
		if(areYouhappy_no == 0) {
			JOptionPane.showMessageDialog(null, "go eat");
		}
		if(areYouhappy_no == 1) {
			JOptionPane.showMessageDialog(null, "go eat");
		}
		int areYouhappy_yes = 9;
		if(areYouhappy == 1) {
		areYouhappy_yes = JOptionPane.showOptionDialog(null, "are you coding?", null, 0, 1, null, areYouHappy_Yes, null);		
			System.out.println(areYouhappy);
		}
if (areYouhappy_yes == 1) {
	JOptionPane.showMessageDialog(null, "keep coding");
	}

if (areYouhappy_yes == 0) {
	JOptionPane.showMessageDialog(null, "your happyness is a lie, keep coding bozo");
	}








	}
	}
