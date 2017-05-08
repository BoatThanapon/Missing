package Missing.farmapp.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Missing.farmapp.controller.PlayerController;
import Missing.farmapp.model.Seed.Seed;

public class ShopTest {

	Shop shop = new Shop();
	private List<Seed> itemList = new ArrayList<Seed>();
	Seed seed = new Seed("Apple",100);
	PlayerController player = new PlayerController();
	
	@Test
	public void buyItemTest(){
		player.buyItem(new Seed("Apple"), 100, 2);
		assertEquals(player.getName(),"Apple");
		assertEquals(player.getMoney(),200);
	}
	
	@Test
	public void reStockTest(){
		shop.reStock();
		assertEquals(shop.showItemList(),itemList);
	}
}
