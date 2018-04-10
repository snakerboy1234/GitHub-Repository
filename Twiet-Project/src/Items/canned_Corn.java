package Items;

public class Canned_Corn extends Item{

	public Canned_Corn(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "Canned Corn";
		itemType = "canned food";
	}

}
