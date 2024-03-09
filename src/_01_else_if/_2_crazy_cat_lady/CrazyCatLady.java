
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("how many cats do you have");

		int catsInt = Integer.parseInt(cats);	
		if(catsInt > 3 ){ 
			playVideo("https://www.youtube.com/shorts/xHEgHjJvR94");
			}
		if(catsInt <= 0 ){ 
			playVideo("https://www.youtube.com/watch?v=DZh90eBERt0");
			}
		if(catsInt <= 3 && catsInt > 0){ 
			playVideo("https://www.youtube.com/watch?v=q4vy7BcAVJg");
			}
	
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

