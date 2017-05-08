package Missing.farmapp.controller;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.controller.TimeController;
import Missing.farmapp.gardenbed.GardenBed;
import Missing.farmapp.model.Plant.Plant;

public class GameController {
	static GardenBed gardenBed = new GardenBed();
	static TimeController timeController = new TimeController();
	

	public void NextDay() {
		timeController.setDay(timeController.getDay() + 1);
		for (int i = 0; i < gardenBed.getPlantList().size(); i++) {
			gardenBed.getPlantList().get(i).setAge(gardenBed.getPlantList().get(i).getAge() + 1);
			RemovePlant(gardenBed.getPlantList());
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
