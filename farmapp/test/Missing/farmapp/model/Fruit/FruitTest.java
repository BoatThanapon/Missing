package Missing.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FruitTest {

	Fruit fruit = new Fruit("Apple", 500);
	
	@Test
	public void getNameTest(){
		assertEquals(fruit.getName(),"Apple");
	}
	
	@Test
	public void getPriceTest(){
		assertEquals(fruit.getPrice(),500);
	}
	
	@Test
	public void getAmountTest(){
		assertEquals(fruit.getAmount(),0);
	}
	
	@Test
	public void addAmountTest(){
		fruit.addAmount(2);
		assertEquals(fruit.getAmount(),2);
	}
	
	@Test
	public void setAmountTest(){
		assertEquals(fruit.setAmount(1),false);
	}
	
	@Test
	public void useTest(){
		assertEquals(fruit.use(),false);
	}
		
}
