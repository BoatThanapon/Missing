package Missing.farmapp.model.Seed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SeedTest {

	Seed seed = new Seed("Apple");
	
	@Test
	public void getNameTest(){
		assertEquals(seed.getName(),"Apple");
	}
	
	@Test
	public void getAmountTest(){
		assertEquals(seed.getAmount(),0);
	}
	
	@Test
	public void addAmountTest(){
		seed.addAmount(2);
		assertEquals(seed.getAmount(),2);
	}
	
	@Test
	public void setAmountTest(){
		assertEquals(seed.setAmount(1),true);
	}
	
	@Test
	public void useTest(){
		assertEquals(seed.use(),false);
	}
	
	@Test
	public void deductAmountTest(){
		assertEquals(seed.deductAmount(3),true);
	}
	
	
}
