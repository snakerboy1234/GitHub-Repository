package Items;

import java.util.ArrayList;

public class ItemSetUp {
	public static int[][] sportingGoods;
	public static int[][] frozenFoodDesert;
	public static int[][] frozenFoodMicrowaveMeals;
	public static int[][] produce;
	public static int[][] dairyProducts;
	public static int[][] cannedGoods;
	public static int[][] deliMeat;
	public static int[][] toys;
	public static int[][] grainProducts;
	public static int[][] pharmacy;
	public static int[][] furniture;
	public static int[][] bakery;
	
	public static String[][] Storage;
	
	public static ArrayList<int[][]> aisle = new ArrayList<int[][]>();
	
	public static void addArrays() {
		aisle.add(sportingGoods);
		aisle.add(frozenFoodDesert);
		aisle.add(frozenFoodMicrowaveMeals);
		aisle.add(produce);
		aisle.add(dairyProducts);
		aisle.add(cannedGoods);
		aisle.add(deliMeat);
		aisle.add(toys);
		aisle.add(grainProducts);
		aisle.add(pharmacy);
		aisle.add(furniture);
		aisle.add(bakery);
	}
}
