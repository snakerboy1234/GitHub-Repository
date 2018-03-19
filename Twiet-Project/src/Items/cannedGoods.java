package Items;

public class cannedGoods extends Item{

	public cannedGoods(String itemTypeC, String itemNameC, int aisleNum, int itemAmountC, double itemCostC,
			long timeTillExpirationC, boolean itemOnGroundC, boolean itemPerishableC) {
		super(itemTypeC, itemNameC, aisleNum, itemAmountC, itemCostC, timeTillExpirationC, itemOnGroundC, itemPerishableC);
		setAisleStartUp();
		aisleNum = aisle;
		itemTypeC = itemType;	
	}

	private static void setAisleStartUp() {
		aisle = 6;
		itemType = "Canned goods";
	}
}
