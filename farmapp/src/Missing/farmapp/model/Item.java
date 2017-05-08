package Missing.farmapp.model;

public interface Item {
	int amount = 1;
	double price = 0;
	public boolean use();
	public String getName();
	public int getPrice();
	public int getAmount();
	public boolean setAmount(int i);
	public boolean addAmount(int i);
}
