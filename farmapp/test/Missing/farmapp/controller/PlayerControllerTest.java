package Missing.farmapp.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Missing.farmapp.model.GardenBed;
import Missing.farmapp.model.Item;
import Missing.farmapp.model.Plant.Plant;
import Missing.farmapp.model.Seed.Seed;

public class PlayerControllerTest {

	PlayerController player = new PlayerController();
	private List<Item> inventory = new ArrayList<Item>();
	Seed seed = new Seed("Apple");
	GardenBed gardenbed = new GardenBed();
	Plant plant = new Plant("Papaya",6,2,1,3,7);
	
	@Test
	public void PlayControllerTest(){		
		assertEquals(player.getName(),"Doraemon");
		assertEquals(player.getMoney(),6000);
	}

	
	@Test
	public void getSeedsTest(){	
		player.addItemToInventory(new Seed("Apple"),1);
		assertEquals(player.getSeeds().get(0).getName(),"Apple");
	}
	
	@Test
	public void buyItemTest(){	
		player.buyItem(new Seed("Apple"), 100, 2);
		assertEquals(player.getSeeds().get(0).getName(),"Apple");
	}
	
	@Test
	public void showInventoryTest(){
		player.buyItem(new Seed("Apple"), 100,2);
		player.showInventory();
		assertEquals(inventory.size(),0);
	}

	@Test
	public void useItemTest(){
		assertEquals(player.useItem(0),true);
	}
	
	@Test
	public void useSeedTest(){
		player.addItemToInventory(new Seed("Apple"),1);
		assertEquals(player.useSeed("Apple"),true);
		assertEquals(player.useSeed("Mango"),false);
	}
	
	@Test
	public void harvestPlantTest(){	
		gardenbed.plant(plant);
		gardenbed.increaseDay();
		gardenbed.increaseDay();
		player.harvestPlant(gardenbed);
		assertEquals(player.getSeeds().get(0).getName(),"Papaya");
	}
}
