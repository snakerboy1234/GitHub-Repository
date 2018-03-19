package shoppingListItems;

import Item.itemSetUp;

public class MainForProject {

	
	public static long startTime = 0;//change this
	
	public static void main (String[] arg) {
		ItemSetUp();
		StartUpProcedure.startUp();
		startTime = System.currentTimeMillis();
		GUIRunner.createAndShowGUI();
	}
	

}
