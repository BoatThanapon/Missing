package Missing.farmapp.model.Seed;

import Missing.farmapp.model.Item;


public class Seed implements Item{
	
	private String name;
	private int price;
	private int amount=0;
	
	public Seed(String name){
		this.name = name;
	}
	
	public Seed(String name, int price){
		this.name = name;
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}
	
	public int getPrice(){
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public boolean setAmount(int amount) {
		this.amount = amount;
		return true;
	}
	
	public boolean addAmount(int amount) {
		this.amount+=amount;
		return true;
	}	

	public boolean use() {
		if(amount>0){
			amount--;
			return true;
		}
		return false;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean deductAmount(int amount) {
		this.amount-=amount;
		return true;
	}

}
