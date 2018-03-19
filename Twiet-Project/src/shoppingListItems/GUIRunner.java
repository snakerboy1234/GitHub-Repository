package shoppingListItems;

import javax.swing.*;

public class GUIRunner {
	public static void createAndShowGUI() {
		JFrame firstFrame = new JFrame("Inventory Management");
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Inventory Manager");
		firstFrame.getContentPane().add(label);
		
		firstFrame.pack();
		firstFrame.setVisible(true);
	}
}
