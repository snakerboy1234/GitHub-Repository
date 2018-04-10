package Items;

import java.util.ArrayList;
import Items.ItemSetUp;

public interface aisles {
	String callAisleName();
	int callAisleNumber();
	void editAnAisleName(String Aisle);
	void changeAisle(int changedAisle);
	void placeInAisle();
	int callAisleLength();
	
}

class aisleBakery implements aisles{
	
	public static int lengthOfAisle = 0;
	public static Item[] bakery;
	private static int counter = 0;
	private static int aisle_Number = 0;
	private static String aisle_Name = "Bakery";
	private static int holding_Original;
	private static int array_Length;
	
	@Override
	public String callAisleName() {
		return aisle_Name;
	}
	
	@Override
	public int callAisleNumber() {
		return aisle_Number;
	}

	@Override
	public void editAnAisleName(String Name) {
		aisle_Name = Name;
	}
	
	@Override
	public void changeAisle(int aisle_Changed_To) {
		aisle_Number = aisle_Changed_To;
		//do more
	}

	@Override
	public int callAisleLength() {
		
		bakery = new Item[lengthOfAisle];
		
		return lengthOfAisle;
	}

	@Override
	public void placeInAisle() {
		aisle.add(bakery);
		
	}
 class aisle
	
}