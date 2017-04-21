package Missing.farmapp.inventory;
import java.util.ArrayList;
import Missing.farmapp.model.Fruit.Fruit;
import Missing.farmapp.model.Plant.Mango;
import Missing.farmapp.model.Plant.Papaya;
import Missing.farmapp.model.Plant.Plant;
import Missing.farmapp.model.Plant.Strawberry;


public class Inventory {

	public static ArrayList<Plant> plantWarehouse = new ArrayList<Plant>();
	public static ArrayList<Fruit> fruitWarehouse = new ArrayList<Fruit>();
	
	static double money = 0;
	
	
	public Inventory(){
		Papaya papaya = new Papaya();
		Mango mango = new Mango();
		Strawberry straw = new Strawberry();
		plantWarehouse.add(papaya);
		plantWarehouse.add(mango);
		plantWarehouse.add(straw);
	
	}

	public void addPlant(Plant plant) {
		plantWarehouse.add(plant);
	}



	public void addFruit(Fruit fruit) {
		fruitWarehouse.add(fruit);
	}

	public void addMoney(double money) {
		this.money += money;
	}

	public void removePlant(Plant plant) {
		
	}



	public void removeFruit(Fruit fruit) {
	}

	public void removeMoney(double money) {
		this.money -= money;
	}

	public void viewPlant() {
		for (int i = 0; i < plantWarehouse.size(); i++) {
			System.out.print("-");
			System.out.println(plantWarehouse.get(i).getName());
		}
	}


	public void viewFruit() {
		for (int i = 0; i < fruitWarehouse.size(); i++) {
			//System.out.println(fruitWarehouse.get(i).getName());
		}
	}
	public double viewMoney() {
		return this.money;
	}
}