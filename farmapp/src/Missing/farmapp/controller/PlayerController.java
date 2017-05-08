package Missing.farmapp.controller;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.model.GardenBed;
import Missing.farmapp.model.Item;
import Missing.farmapp.model.Fruit.Fruit;

public class PlayerController {

	private String name;
	private double power;
	private int money;
	private List<Item> inventory = new ArrayList<Item>();
	
	public PlayerController(){
		name = "Doraemon";
		money = 6000;
	}

	public String getName(){
		return name;
	}
	
	public double getMoney(){
		return money;
	}	

	public boolean sellItem(){
		if(inventory.size()==0){
			System.out.println("Empty Item");
		}else{
			showInventory();
		}
		return true;
	}
	
	public List<Item> getSeeds(){
		List<Item> seeds = new ArrayList<Item>();
		for (Item item : this.inventory) {
				seeds.add(item);
		}
		return seeds;
	}
	
	public void showInventory(){
		if(inventory.size()==0){
			System.out.println("Your inventory is empty.");
		}else{
		int index = 0;
			for (Item item : inventory) {
				index++;
				System.out.println("[" + index + "] : "+ item.getName() +" has "+item.getAmount());
			}
		}
	}
	
	public boolean buyItem(Item item, int amount,int price){
		addItemToInventory(item,amount);
		money-=price;
		return true;
	}
	
	public boolean addItemToInventory(Item item, int amount){
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==item.getName()){
				inventory.get(i).addAmount(amount);
				return true;
			}
		}
		item.setAmount(amount);
		inventory.add(item);
		return true;
	}
	
	public boolean useItem(int index) {
		return true;
	}
	
	public boolean useSeed(String name){
		for(int i=0; i<inventory.size(); i++){
			if(inventory.get(i).getName()==name){
				if(inventory.get(i).getAmount()>0){
					inventory.get(i).use();
					if(inventory.get(i).getAmount()==0){
						inventory.remove(i);
					}
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean harvestPlant(GardenBed gardenbed){
		boolean harvestSomething = false;
		for(int i=0; i<gardenbed.size(); i++){
			if(gardenbed.getPlant(i)!=null){
				Fruit fruit = gardenbed.getPlant(i).isHarvested();
				if(fruit!=null){
					addItemToInventory(fruit,fruit.getAmount());
					System.out.println("You got "+fruit.getAmount()+" of "+fruit.getName());
					harvestSomething = true;
				}
			}
		}
		if(!harvestSomething){
			System.out.println("Empty to harvest.");
		}
		return true;
	}

}
