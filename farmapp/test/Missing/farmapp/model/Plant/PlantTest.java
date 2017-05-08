package Missing.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlantTest {
	
	Plant plant = new Plant("Mango",5,4,1,3,10);

	@Test
	public void getNameTest(){
		assertEquals(plant.getName(),"Mango");
	}
	
	@Test
	public void getAgeTest(){
		assertEquals(plant.getAge(), 0);
	}
	
	@Test
	public void getStateTest(){
		assertEquals(plant.getState(), "Seedling");
	}
	
	@Test
	public void getHealthTest(){
		assertEquals(plant.getHealth(), 5);
	}
	
	@Test
	public void getCurrentHealthTest(){
		assertEquals(plant.getCurrentHealth(), 5);
	}
	
	@Test
	public void getWaterTest(){
		assertEquals(plant.getWater(), 4);
	}
	
	@Test
	public void getCurrentWaterTest(){
		assertEquals(plant.getCurrentWater(), 4);
	}
	
	@Test
	public void isWateredTest(){
		plant.isWatered();		
		assertEquals(plant.getCurrentWater(),4);
	}
	
	@Test
	public void decreaseCurrentWaterTest(){	
		assertEquals(plant.getCurrentWater(),4);	
		assertEquals(plant.getWater(),4);
		plant.isWatered();
		plant.increaseAge();
		assertEquals(plant.getCurrentWater(),4);		
	}
	
		
	@Test
	public void increaseAge(){
		assertEquals(1,plant.getAge());
		assertEquals(plant.getState(),"Seedling");
		plant.increaseAge();
		plant.increaseAge();
		plant.increaseAge();
		assertEquals(3,plant.getAge());
		assertEquals(plant.getState(),"Mature");
		plant.increaseAge();
		plant.increaseAge();
		

	}
}
