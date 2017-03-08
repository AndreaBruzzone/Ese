package Pervasive.Sample;

public interface IMoney {
	public abstract IMoney add(IMoney aMoney);

	public abstract IMoney addMoneyBag(MoneyBag aMoneyBag);

	public abstract IMoney addMoney(Money aMoney);
	
}
