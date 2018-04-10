package Items;

public class Ham extends Item{

	public Ham(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 6.00;
		itemAmount = 0;
		itemName = "Ham";
		itemType = "deli meat";
	}

}
