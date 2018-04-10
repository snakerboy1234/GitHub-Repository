package Items;

import java.util.ArrayList;
import java.util.Arrays;

	
public class ItemSetUp {
	public static int storageCount = -1;
	
	public static int[] frozenFoodDesert;
	public static int[] frozenFoodMicrowaveMeals;
	public static int[] produce;
	public static int[] dairyProducts;
	public static int[] cannedGoods;
	public static int[] deliMeat;
	public static int[] grainProducts;
	
	public static int[][] Storage = new int[99][99];
	
	public static int[][] array = new int[][] { frozenFoodDesert, frozenFoodMicrowaveMeals, produce, dairyProducts, 
											  cannedGoods, deliMeat, grainProducts};
	
	public static ArrayList<int[]> aisle = new ArrayList<int[]>(Arrays.asList(array));
	
	public static void to_Storage(String array_Name) {
		int indexof = aisle.indexOf(array_Name);
		if(indexof < 0) {
			System.out.println("Not an aisle to switch.");
		}
		else {
			storageCount++;
			Storage[storageCount] = aisle.get(indexof);
		}
	}
}
