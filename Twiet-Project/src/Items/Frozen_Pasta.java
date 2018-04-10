package Items;

public class Frozen_Pasta extends Item{

	public Frozen_Pasta(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "Frozen Pasta Meal";
		itemType = "frozen meal";
	}

}
