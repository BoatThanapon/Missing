package Missing.farmapp.view;

import java.util.List;
import java.util.Scanner;

import Missing.farmapp.controller.GameController;
import Missing.farmapp.controller.PlayerController;
import Missing.farmapp.model.GardenBed;
import Missing.farmapp.model.Item;
import Missing.farmapp.model.Shop;
import Missing.farmapp.model.Plant.Plant;

public class promt {
	
	public static int day = 1;
	static Scanner reader = new Scanner(System.in);
	static GameController gameController = new GameController();
	static PlayerController playerController = new PlayerController();
	static GardenBed gardenbed = new GardenBed();
	static Shop shop = new Shop();
	
	public static void showMenu() {
		System.out.println("======================================");
		System.out.println("Welcome to Missing Farm Game"); 
		System.out.println("Day :" + day);
		System.out.println("Choose your option Press the number");
		System.out.println("1> View Plant");
		System.out.println("2> Plant Seed");
		System.out.println("3> Water Plant");
		System.out.println("4> Harvest Plant");
		System.out.println("5> View Inventory");
		System.out.println("6> Visit Shop");
		System.out.println("7> Sleep");
		System.out.print("Input number>>");
		int number = reader.nextInt();
		System.out.println("======================================");
		
		if(number==1){
			viewPlant();
		}else if (number==2){
			plantSeed();
		}else if (number==3){
			waterPlant();
		}else if (number==4) {
			harvestPlant();
		}else if (number==5) {
			viewInventory();
		}else if (number==6) {
			visitShop();
		}else if (number==7) {
			sleep();
		}else {
			System.out.println("Try again! Please choose number 1-7");
			showMenu();
		}
			
	}

	public static void viewPlant() {
		System.out.println("### Viewing Plants ###");
		for (int i = 0; i < gardenbed.size(); i++) {
			Plant plants = gardenbed.getPlant(i);
			if (plants == null) {
				System.out.println("["+ (i + 1) + "] : " + "empty");
			} else {
				System.out.println("["+ (i + 1) + "] : " + plants.getName() + " Tree");
				plants.getInfo();
			}
		}
		showMenu();
	}
	
	public static void plantSeed(){
		List<Item> seeds = playerController.getSeeds();
		if (seeds.isEmpty()) {
			System.out.println("Seed is Empty");
		} else {
			System.out.println("### Select a seed to plant ###");
			int count = 0;
			for (Item item : seeds) {
				count++;
				System.out.println("[" + count + "] : "+ item.getName() + " has " + item.getAmount() +" seed(s)");
			}
			System.out.println("Please select a seed to plant");
			System.out.print("Input number>>");
			int seed = reader.nextInt();
			String name = seeds.get(seed-1).getName();
			Plant plant = GameController.getPlant(name);
			if(gardenbed.plant(plant)){
				System.out.println("Planting Success!");
				playerController.useSeed(name);
			}else{
				System.out.println("Gardenbed is full.");
			}
		}
		showMenu();
	}
	
	public static void waterPlant(){
		System.out.println("### Select plant to water ###");
		for (int i = 0; i < gardenbed.size(); i++) {
			Plant plant = gardenbed.getPlant(i);
			if (plant == null) {
				System.out.println("[" + (i + 1) + "] : empty");
			} else {
				System.out.println("[" + (i + 1) + "] : " + plant.getName() + " tree");
				plant.getInfo();
			}
		}
		System.out.print("Input number>>");
		int input = reader.nextInt();
		Plant plant = gardenbed.getPlant(input-1);
		if(plant==null){
			System.out.println("Not has plant to water.");
		}else{
			plant.isWatered();
			System.out.println("[" + input + "] : " + plant.getName() + " tree");
			plant.getInfo();
		}
		showMenu();
	}

	public static void harvestPlant(){
		System.out.println("### Harvest Plant ###");
		playerController.harvestPlant(gardenbed);
		showMenu();

	}
	
	public static void viewInventory(){
		System.out.println("### Inventory ###");
		playerController.showInventory();
		showMenu();

	}
	
	public static void visitShop(){
		System.out.println("### Visit shop ###");
		shop.visitShop(playerController);
		showMenu();

	}
	
	public static void sleep(){
		++day;
		System.out.println("### Go to Sleep ###");
		System.out.println("Do you want to sleep?");
		System.out.println("Y/N");
		System.out.print(">>");
		String sleep = reader.next();
		if(sleep.equalsIgnoreCase("Y")){
			gardenbed.increaseDay();
			System.out.println("Have a good dream");
			System.out.println("Good morning "+"Day :"+day);
			showMenu();			
		}else if (sleep.equalsIgnoreCase("N")){
			showMenu();
		}else
			System.out.println("Input Y or N");
		showMenu();
	}
}
