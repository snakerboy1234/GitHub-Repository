package shoppingListItems;

import java.util.ArrayList;
import java.util.Arrays;

import Items.*;

public class StartUpProcedure {
	public static boolean firstTime;
	public static int storageCount = -1;
	private static Item[] tempArray;
	public static Item[] frozenFoodDesert;
	public static Item[] frozenFoodMicrowaveMeals;
	public static Item[] produce;
	public static Item[] dairyProducts;
	public static Item[] cannedGoods;
	public static Item[] deliMeat;
	public static Item[] grainProducts;
	public static Item[][] Storage = new Item[99][99];
	public static Item[][] array = new Item[][] {frozenFoodDesert, frozenFoodMicrowaveMeals, produce, dairyProducts, 
											  cannedGoods, deliMeat, grainProducts};
	public static ArrayList<Item[]> aisle = new ArrayList<Item[]>(Arrays.asList(array));
	public static void startUp () {
		if(firstTime) {
			
			tempArray = aisle.get(0);
		}
	}
	
}
