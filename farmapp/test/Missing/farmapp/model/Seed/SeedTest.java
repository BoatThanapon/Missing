package Missing.farmapp.model.Seed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SeedTest {

	Seed seed = new Seed("Apple");
	Seed seedA = new Seed("Papaya",300);
	
	@Test
	public void getNameTest(){
		assertEquals(seed.getName(),"Mango");
	}
	
	@Test
	public void getPriceTest(){
		assertEquals(seedA.getPrice(),500);
	}
	
	@Test
	public void getAmountTest(){
		assertEquals(seedA.getAmount(),0);
	}
	
	@Test
	public void addAmountTest(){
		seedA.addAmount(2);
		assertEquals(seedA.getAmount(),2);
	}
	
	@Test
	public void setAmountTest(){
		assertEquals(seedA.setAmount(1),true);
	}
	
	@Test
	public void useTest(){
		assertEquals(seedA.use(),false);
	}
}
