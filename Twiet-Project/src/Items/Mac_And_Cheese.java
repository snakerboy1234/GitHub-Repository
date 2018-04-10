package Items;

public class Mac_And_Cheese extends Item{

	public Mac_And_Cheese(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "Mac and Cheese";
		itemType = "frozen food";
	}
	
}
