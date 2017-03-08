package Pervasive.Sample;

import java.util.Vector;

public class MoneyBag implements IMoney {
	private Vector fMonies = new Vector();

	public MoneyBag(Money m1, Money m2) {
		appendMoney(m1);
		appendMoney(m2);
	}

	public MoneyBag(Money bag[]) {
		for (int i = 0; i < bag.length; i++)
			appendMoney(bag[i]);
	}
	
	private void appendMoney(Money m1) {
		
	}

	@Override
	public IMoney add(IMoney m) {
		return m.addMoneyBag(this);
	}
	@Override
	public IMoney addMoney(Money m) {
		return new MoneyBag(this);
	}
	@Override
	public IMoney addMoneyBag(MoneyBag s) {
		return new MoneyBag(this);
	}
}
