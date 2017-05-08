package Missing.farmapp.model;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.model.Fruit.Fruit;

public interface Plantable {
	String name = "";
	int age = 0;
	
	String state = "";
	int dead = 7; 
	int muture = 3;
	int seedling = 1; 
	
	int maxHealth = 3;
	int currentHealth = 3;
	int maxWater = 5;
	int currentWater = 5;
	
	List<Fruit> product = new ArrayList<Fruit>();
	
	String getState();
	void increaseAge();
}
