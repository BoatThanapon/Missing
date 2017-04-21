package Missing.farmapp.gardenbed;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.model.Plant.Plant;


public class GardenBed {
	private static ArrayList<Plant> plantList = new ArrayList<Plant>();

	public List<Plant> getPlantList() {
		return plantList;
	}

	public boolean setPlantList(Plant plant) {
		GardenBed.plantList.add(plant);
		return true;
	}

}
