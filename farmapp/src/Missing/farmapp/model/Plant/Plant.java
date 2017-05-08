package Missing.farmapp.model.Plant;

import Missing.farmapp.controller.GameController;
import Missing.farmapp.model.Plantable;
import Missing.farmapp.model.Fruit.Fruit;

public class Plant implements Plantable{

	private String name;
	private int age;
	private int maxHealth;
	private int currentHealth;
	private int maxWater;
	private int currentWater;
	private int seedling;
	private int mature;
	private int dead;
	private String state = "Seedling";
	private Fruit fruit = null;
	
	public Plant(String name, int health, int water, int seedling, int mature, int dead){
		this.name = name;
		this.maxHealth = health;
		this.currentHealth = health;
		this.maxWater = water;
		this.currentWater = water;
		this.seedling = seedling;
		this.mature = mature;
		this.dead = dead;
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getState() {
		return state;
	}
	
	public int getHealth(){
		return maxHealth;
	}
	
	public int getCurrentHealth(){
		return currentHealth;
	}
	
	public int getWater(){
		return maxWater;
	}
	
	public int getCurrentWater(){
		return currentWater;
	}
	
	public int getSeedling(){
		return seedling;
	}
	
	public int getMature(){
		return mature;
	}
	
	public int getDead(){
		return dead;
	}
	
	private void increaseCurrentWater(){
		if(currentWater < maxWater){
			currentWater++;
		}
	}
	
	private void decreaseCurrentWater(){
		if(currentWater > 0){
			currentWater--;
		}
	}
	private void increaseCurrentHealth(){
		if(currentHealth < maxHealth){
			currentHealth++;
		}
	}
	
	private void decreaseCurrentHealth(){
		if(currentHealth > 0){
			currentHealth--;
		}
	}
	
	public void isWatered(){
		increaseCurrentWater();
	}
	
	public void getInfo(){
		System.out.println("Age : " + this.state + " ("+ this.age + "/" + this.seedling + " Days)");
		System.out.print("Health : ");
		for (int j = 0; j < this.currentHealth; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.currentHealth + "/"+ this.maxHealth + ")");
		System.out.print("Water : ");
		for (int j = 0; j < this.currentWater; j++) {
			System.out.print("<3 ");
		}
		System.out.println("(" + this.currentWater + "/"+ this.maxWater + ")");
		System.out.println("Fruit :");
		if (this.fruit == null) {
			System.out.println("empty");
		} else {
				System.out.println(" " + fruit.getAmount() + " " + fruit.getName());
		}
		System.out.println();
	}

	public void increaseAge() {
		age++;

		if (age > seedling) {
			state = "seedling";
		}
		if (age > mature) {
			state = "mature";
		}
		if (age > dead) {
			state = "dead";
		}
		
		if (state.equals("mature")){ 
			int numberOfFruit=0;
			if(fruit==null){
				fruit = GameController.getFruit(name);
				numberOfFruit++;
			}else{
				if(currentHealth == maxHealth){
					numberOfFruit++;
				}
				if(currentWater == maxWater){
					numberOfFruit++;
				}
			}
			fruit.addAmount(numberOfFruit);
			System.out.println("Your " + name + " has produced " + numberOfFruit);
			
		}
		
		if(currentWater == maxWater){
			increaseCurrentHealth();
		}
		decreaseCurrentWater();
		if (currentWater == 0) {
			decreaseCurrentHealth();
		}
		
		if (currentHealth == 0) {
			state = "dead";
			System.out.println("Your " + name + " has dead.");
			if(fruit!=null){
				fruit=null;
				System.out.println("Your " + name + "'s fruit has dead");
			}
		}
	}
	
	public Fruit isHarvested(){
		if(fruit!=null){
			Fruit temp = fruit;
			fruit = null;
			return temp;
		}
		return null;
	}
	
}

