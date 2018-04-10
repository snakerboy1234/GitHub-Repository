package Items;

public class Grain_Bread extends Item{

	public Grain_Bread(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 4.00;
		itemAmount = 0;
		itemName = "Grain Bread";
		itemType = "baked good";
	}

}
