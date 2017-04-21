package Missing.farmapp.gardenbed;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import Missing.farmapp.gardenbed.GardenBed;
import Missing.farmapp.model.Plant.Mango;
import Missing.farmapp.model.Plant.Plant;

public class GardenBedTest {
	static GardenBed gardenbed = new GardenBed();
	@Test
	public void TestgetPlantList() throws Exception {
		List<Plant> pl = new ArrayList<Plant>();
		Plant p = new Mango();
		pl = gardenbed.getPlantList();
		assertEquals(gardenbed.getPlantList(), pl);
	}
	
	@Test
	public void TestsetPlantList() throws Exception {
		List<Plant> pl = new ArrayList<Plant>();
		Plant p = new Mango();
		p.setName("Mango");
		pl.add(p);
		assertEquals(gardenbed.setPlantList(p), true);
	}
			
}
