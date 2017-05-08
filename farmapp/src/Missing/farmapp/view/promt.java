package Missing.farmapp.view;

import java.util.Scanner;

import Missing.farmapp.controller.GameController;
import Missing.farmapp.inventory.Inventory;

public class promt {

	static Scanner reader = new Scanner(System.in);
	static GameController gameController = new GameController();
	static Inventory inventory = new Inventory();

	public static void showMenu() {

		System.out.println("=======================\n" + "### Day: " + gameController.GetDay() + " ###"
				+ "\n(1) View Plants\n" + "(2) Plant Seed\n" + "(3) Water Plant\n" + "(4) Harvest Plant\n"
				+ "(5) View Inventory\n" + "(6) Visit Shop\n" + "(7) Sleep 1 Day" + "\n=======================");
		System.out.print("Input: ");
		int chooseMenu = reader.nextInt();
		if (chooseMenu == 1) {
			ViewPlants();
		} else if (chooseMenu == 2) {
			PlantSeed();
		} else if (chooseMenu == 3) {
			WaterPlant();
		} else if (chooseMenu == 4) {
			HarvestPlant();
		} else if (chooseMenu == 5) {
			ViewInventory();
		} else if (chooseMenu == 6) {
			VisitShop();
		} else if (chooseMenu == 7) {
			Sleep();
		} else {
			System.out.println("Input only 1-7.");
			showMenu();
		}
	}

	static void ViewPlants() {
		if (gameController.GetPlantList().size() == 0) { // view plant in garden
															// bed.
			System.out.println("No plant in garden bed.");
		} else if (gameController.GetPlantList().size() > 0) {
			for (int i = 0; i < gameController.GetPlantList().size(); i++) {
				System.out.println(i + 1 + ") " + gameController.GetPlantList().get(i).getName() + " Tree\n" + "Age: "
						+ gameController.GetPlantList().get(i).getAge() + "\n" + "Health: "
						+ gameController.GetPlantList().get(i).getHealth() + "\n" + "Water: "
						+ gameController.GetPlantList().get(i).getWaterContainer() + "\n" + "Fruit: " + "\n" + "Type :"
						+ gameController.GetPlantList().get(i).gettype());
			}
		}

		showMenu();
	}

	static void PlantSeed() {
		
		System.out.println("Please select what you want to plant.");
		System.out.println("Choose from invenory");
		inventory.viewPlant();
		System.out.print("Input : ");
		String selectSeed = reader.next();
		for (int i = 0; i < Inventory.plantWarehouse.size(); i++) {
			if (Inventory.plantWarehouse.get(i).getName().equalsIgnoreCase(selectSeed)) {
				Inventory.plantWarehouse.get(i).settype("Tree");
				gameController.AddPlant(Inventory.plantWarehouse.get(i));
				System.out.println("Add " + selectSeed + " into gardenbed success.");
				break;
			}
			else{
				System.out.println("Your plant dosen't have in inventory.");
				break;
			}
		}
		// Add seed to garden bed and remove seed out of inventory.
		showMenu();
	}

	static void WaterPlant() {

	}

	static void HarvestPlant() {

	}

	static void ViewInventory() {
		System.out.println("#####Inventory#####");
		System.out.println("***Plant***");
		inventory.viewPlant();
		System.out.println("***Fruit***");
		System.out.println(" ");//fruit
		System.out.println("Money: "+inventory.viewMoney());

	}

	static void VisitShop() {

	}

	static void Sleep() {
		System.out.println("Do you want to sleep? (Y/N)");
		System.out.print("Input : ");
		String sleepOrNot = reader.next();
		if (sleepOrNot.equalsIgnoreCase("Y")) {
			GameController gameController = new GameController();
			gameController.NextDay();
			showMenu();
		} else if (sleepOrNot.equalsIgnoreCase("N")) {
			showMenu();
		} else {
			System.out.println("Input only Y or N.");
			Sleep();
		}

	}
}
