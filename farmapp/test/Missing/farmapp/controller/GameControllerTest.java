package Missing.farmapp.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import Missing.farmapp.controller.GameController;
import Missing.farmapp.model.Plant.Mango;
import Missing.farmapp.model.Plant.Papaya;
import Missing.farmapp.model.Plant.Plant;
import Missing.farmapp.model.Plant.Strawberry;


public class GameControllerTest {
	static GameController gameController = new GameController();
	@Test
	public void testNextday() {
		gameController.NextDay();
		assertEquals(gameController.GetDay(),2);
	}

	@Test
	public void AddPlant() {
		List<Plant> pl = new ArrayList<Plant>();
		Plant p = new Papaya();
		Plant s = new Strawberry();
		pl.add(p);
		pl.add(s);
		gameController.AddPlant(p);
		gameController.AddPlant(s);
		assertEquals(gameController.GetPlantList(), pl);
	}

	@Test
	public void testGetPlantList() {
		List<Plant> pl= new ArrayList<Plant>();
		pl = gameController.GetPlantList();
		assertEquals(gameController.GetPlantList(), pl);
	}

	@Test
	public void testRemovePlant() {
		List<Plant> pl = new ArrayList<Plant>();
		Plant p = new Papaya();
		Plant s = new Strawberry();
		p.setAge(5);
		p.setLifeCycle(3);
		s.setAge(6);
		s.setLifeCycle(5);
		pl.add(p);
		pl.add(s);
		gameController.RemovePlant(pl);
		assertEquals(gameController.RemovePlant(pl), true);
		
	}

	@Test
	public void testGetDay() {
		assertEquals(gameController.GetDay(), 1);
	}

}
