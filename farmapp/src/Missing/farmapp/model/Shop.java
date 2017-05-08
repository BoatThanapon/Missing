package Missing.farmapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Missing.farmapp.controller.GameController;
import Missing.farmapp.controller.PlayerController;
import Missing.farmapp.model.Seed.Seed;
import Missing.farmapp.view.promt;

public class Shop {
	private List<Seed> itemList = new ArrayList<Seed>();
	private static Scanner reader = new Scanner(System.in);
	
	public Shop(){
		itemList.add(GameController.getSeed("Apple"));
		itemList.add(GameController.getSeed("Mango"));
		itemList.add(GameController.getSeed("Strawberry"));
	}
	
	public void visitShop(PlayerController player){
		System.out.println("1> Buy Item");
		System.out.println("2> Leave Shop");
		System.out.print("Input number>>");
		int shop = reader.nextInt();
		if(shop==1){
			buyItem(player);
		}else if(shop==2){
			System.out.println("We hope meet you again!");
			promt.showMenu();
		}
	}
	
	public void showItemList(){
		System.out.println("========== Seed ============");
		for(int i=0; i<itemList.size(); i++){
			System.out.println("["+(i+1)+"] "+itemList.get(i).getName()+"\t"+itemList.get(i).getPrice()+" bath");
		}
	}
	
	public boolean buyItem(PlayerController player){
		showItemList();
		System.out.println("Which item you want to buy?");
		System.out.print("Input number>>");
		int buy = reader.nextInt();
		Item item = itemList.get(buy-1);
		System.out.println("How many items do you want?");
		int amount = reader.nextInt();
		int price = item.getPrice()*amount;
		if(player.getMoney()>=price){
			player.buyItem(item, amount, price);
			System.out.println("Buying Success");
			System.out.println(player.getName()+", you have "+player.getMoney()+"bath left.");
			return true;
		}else{
			System.out.println("Not enough money");
			return false;
		}
	}
	
	public void reStock(){
		itemList.clear();
		
	}
}
