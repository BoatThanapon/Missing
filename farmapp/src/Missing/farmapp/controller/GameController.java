package Missing.farmapp.controller;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.model.Fruit.Fruit;
import Missing.farmapp.model.Plant.Plant;
import Missing.farmapp.model.Seed.Seed;

public class GameController {
	private static List<Seed> seeds = new ArrayList<Seed>();
	private static List<Plant> plants = new ArrayList<Plant>();
	private static List<Fruit> fruits = new ArrayList<Fruit>();
	
	public GameController(){
		//Add data
		
		//Seed(name,price)
		seeds.add(new Seed("Papaya"));
		seeds.add(new Seed("Mango"));
		seeds.add(new Seed("Strawberry"));
		
		//Plant(name,health,water,seedling,mature,dead)
		plants.add(new Plant("Papaya",6,2,1,3,7));
		plants.add(new Plant("Mango",4,3,1,3,7));
		plants.add(new Plant("Strawberry",2,2,1,3,10));
		
		//Fruit(name,price)
		fruits.add(new Fruit("Papaya"));
		fruits.add(new Fruit("Mango"));
		fruits.add(new Fruit("Strawberry"));
			
	}
	
	public static Seed getSeed(String name){
		for(int i=0; i<seeds.size(); i++){
			Seed seed = seeds.get(i);
			if(seed.getName().equals(name)){
				return new Seed(seed.getName(),seed.getPrice());
			}
		}
		return null;
	}
	
	
	public static Plant getPlant(String name){
		for(int i=0; i<plants.size(); i++){
			Plant plant = plants.get(i);
			if(plant.getName()== name){
				return new Plant(plant.getName(),plant.getHealth(),
						plant.getWater(),plant.getSeedling(),
						plant.getMature(),plant.getDead());
			}
		}
		return null;
	}
	
	public static Fruit getFruit(String name){
		for(int i=0; i<fruits.size(); i++){
			Fruit fruit = fruits.get(i);
			if(fruit.getName()== name){
				return new Fruit(fruit.getName());
			}
		}
		return null;
	}
	
}
