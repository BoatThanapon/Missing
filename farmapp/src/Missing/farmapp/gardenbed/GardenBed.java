package Missing.farmapp.gardenbed;

import java.util.ArrayList;
import java.util.List;

import Missing.farmapp.model.Plant.Plant;


public class GardenBed {
	int size = 4;
	private Plant[] gardenbeds = new Plant[size];
	
		public boolean plant(Plant plant){
			for(int i=0; i<size(); i++){
				if(gardenbeds[i]==null){
					gardenbeds[i] = plant;
					return true;
				}
			}
			return false;
		
		}
	
		public Plant getPlant(int index){
			return gardenbeds[index];
		}
	
		public int size(){
			return size;
		}
		
		public void increaseDay() {
			for (int i = 0; i < 4; i++) {
				if (gardenbeds[i] != null) {
					if (gardenbeds[i].getState().equals("dead")) {
						gardenbeds[i] = null;
					} else {
						gardenbeds[i].increaseAge();
					}
				}
			}
		}

}
