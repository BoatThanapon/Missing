package Missing.farmapp.controller;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.controller.TimeController;
import Missing.farmapp.gardenbed.GardenBed;
import Missing.farmapp.model.Plant.Plant;

public class GameController {
	static GardenBed gardenBed = new GardenBed();
	static TimeController timeController = new TimeController();
	
<<<<<<< HEAD

	public void NextDay() {
		timeController.setDay(timeController.getDay() + 1);
		for (int i = 0; i < gardenBed.getPlantList().size(); i++) {
			gardenBed.getPlantList().get(i).setAge(gardenBed.getPlantList().get(i).getAge() + 1);
			RemovePlant(gardenBed.getPlantList());
=======
	public static Seed getSeed(String name){
		for(int i=0; i<seeds.size(); i++){
			Seed seed = seeds.get(i);
			if(seed.getName().equals(name)){
				return new Seed(seed.getName(),seed.getPrice());
			}
>>>>>>> parent of fc29180... Fixed model and controller class
		}

	}

	public void AddPlant(Plant plant) { 
		gardenBed.setPlantList(plant);
	}

	

	public List<Plant> GetPlantList() {
		List<Plant> plantList = new ArrayList<Plant>();
		plantList = gardenBed.getPlantList();
		return plantList;
	}

	public boolean RemovePlant(List<Plant> plantList) {
		for (int i = 0; i < plantList.size(); i++) {
			if (plantList.get(i).getAge() > plantList.get(i).getLifeCycle()) {
				plantList.remove(i);
				return true;
			}
			
		}
		return false;
	}

	public int GetDay() {
		return timeController.getDay();
	}
}
