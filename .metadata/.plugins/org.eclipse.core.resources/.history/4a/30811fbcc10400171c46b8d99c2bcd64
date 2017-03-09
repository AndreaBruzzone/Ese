package Pervasive.Sample;

public class Money implements IMoney {

	private int iAmount;
	private String sCurrency;

	public Money(int amount, String currency) {
		iAmount = amount;
		sCurrency = currency;
	}

	public int amount() {
		return iAmount;
	}

	public String currency() {
		return sCurrency;
	}

	/*public Money add(Money m) {
		if(m.currency().equals(currency()))
			return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);		
	}*/
	
	public boolean equals (Object anObject)
	{
		if(anObject instanceof Money)
		{
			Money aMoney = (Money)anObject;
			return aMoney.currency().equals(currency()) && amount() == aMoney.amount();
		}
		return false;
	}

	@Override
	public IMoney add(IMoney m) {	
		return m.addMoney(this);
	}

	@Override
	public IMoney addMoneyBag(MoneyBag s) {
		// TODO Auto-generated method stub
		return s.addMoney(this);
	}

	@Override
	public IMoney addMoney(Money m) {
		if(m.currency().equals(currency()))
			return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);

	}
}
