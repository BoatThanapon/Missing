package Missing.farmapp.model.Fruit;

import Missing.farmapp.model.Item;

public class Fruit implements Item{

	private String name;
	private int amount=0;
	
	public Fruit(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
		
	public int getAmount() {
		return amount;
	}
	
	public boolean addAmount(int amount) {
		this.amount += amount;
		return true;
	}
	
	public boolean use() {
		return false;
	}

	public boolean setAmount(int i) {
		return false;
	}

	
}