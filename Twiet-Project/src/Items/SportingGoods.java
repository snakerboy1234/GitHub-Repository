package Items;

public class SportingGoods extends Item{
	
	public SportingGoods(String itemTypeC, String itemNameC, int aisleNum, int itemAmountC, double itemCostC, long timeTillExpirationC, boolean itemOnGroundC, boolean itemPerishableC) {
		super(itemType, itemName, aisleNum, itemAmount, itemCost, timeTillExpiration, itemOnGround, itemPerishable);
		
		setAisleStartUp();
		aisleNum = aisle;
		itemTypeC = itemType;
	}

	private static void setAisleStartUp() {
		aisle = 1;
		itemType = "sporting good";
	}
}
