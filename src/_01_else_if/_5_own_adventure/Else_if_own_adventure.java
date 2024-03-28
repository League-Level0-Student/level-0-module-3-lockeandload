package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Else_if_own_adventure {

	public static void main(String[] args) {
//*******ID things*******\\
String  [] yesNo = {"Yes", "No"};
String  [] working = {"Hardly", "Hard", "Very Hard"};
//***********************\\		
int Game = JOptionPane.showOptionDialog(null, "Do you want to make a game?", null, 0, 1, null, yesNo, null);	
//No
if(Game == 1){
	JOptionPane.showMessageDialog(null, "You don't make a game");
	System.exit(0);		
}
//Yes
if(Game == 0){
	JOptionPane.showMessageDialog(null, "You you decide to make a game");
}
//Yes
int work = JOptionPane.showOptionDialog(null, "How hard do you want to work??", null, 0, 2,  null, working, null);
		
		
		
		
		
		
		
		
		
		
		
		
//***do not touch***\\		
	}

}
