package Items;

public class FrozenFoodDesert extends Item{

	public FrozenFoodDesert(String itemTypeC, String itemNameC, int aisleNum, int itemAmountC, double itemCostC,
			long timeTillExpirationC, boolean itemOnGroundC, boolean itemPerishableC) {
		super(itemTypeC, itemNameC, aisleNum, itemAmountC, itemCostC, timeTillExpirationC, itemOnGroundC, itemPerishableC);
		setAisleStartUp();
		aisleNum = aisle;
		itemTypeC = itemType;

	}
	
	private static void setAisleStartUp() {
		aisle = 2;
		itemType = "Frozen Food that is a desert.";
	}
}
