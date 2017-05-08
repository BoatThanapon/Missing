package Missing.farmapp.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Missing.farmapp.controller.GameController;
import Missing.farmapp.model.Fruit.Fruit;
import Missing.farmapp.model.Plant.Plant;
import Missing.farmapp.model.Seed.Seed;

public class GameControllerTest {
	
	GameController gameController = new GameController();
	
	@Test
	public void getSeedTest(){
		assertEquals(gameController.getSeed("Papaya").getName(),"Papaya");
		assertEquals(gameController.getSeed("Apple"),null);
	}
	
	@Test
	public void getPlantTest(){
		assertEquals(gameController.getPlant("Papaya").getName(),"Papaya");
		assertEquals(gameController.getPlant("Apple"),null);
	}
	
	@Test
	public void getFruitTest(){
		assertEquals(gameController.getFruit("Papaya").getName(),"Papaya");
		assertEquals(gameController.getFruit("Apple"),null);
	}
}
