package Missing.farmapp.model.Plant;

import static org.junit.Assert.*;
import org.junit.Test;
import Missing.farmapp.model.Plant.Mango;

public class MangoTest {
	
	@Test
	public void TestGetName() throws Exception {
		Mango m = new Mango();
		assertEquals(m.getName(),"Mango");		
	}
	
	@Test
	public void TestSetName() throws Exception {
		Mango m = new Mango();
		m.setName("Mango");
		assertEquals(m.getName(),"Mango");
	}
	
	@Test
	public void TestGetHealth() throws Exception {
		Mango m = new Mango();
		assertEquals(m.getHealth(),5);		
	}
	
	@Test
	public void TestSetHealth() throws Exception {
		Mango m = new Mango();
		m.setHealth(5);
		assertEquals(m.getHealth(),5);
	}

	@Test
	public void TestgetWaterContainer() throws Exception{
		Mango m = new Mango();
		assertEquals(m.getWaterContainer(),7);
	}
	@Test
	public void TestsetWaterContainer() throws Exception{
		Mango m = new Mango();
		m.setWaterContainer(7);
		assertEquals(m.getWaterContainer(),7);
	}

	@Test
	public void TestgetAge() throws Exception{
		Mango m = new Mango();
		assertEquals(m.getAge(),0);
	}
	@Test
	public void TestsetAge() throws Exception{
		Mango m = new Mango();
		m.setAge(1);
		assertEquals(m.getAge(),1);
	}

	@Test
	public void TestgetLifeCycle() throws Exception{
		Mango m = new Mango();
		assertEquals(m.getLifeCycle(),5);
	}
	@Test
	public void TestsetLifeCycle() throws Exception{
		Mango m = new Mango();
		m.setLifeCycle(1);
		assertEquals(m.getLifeCycle(),1);
	}
	
	@Test
	public void Testgettype() throws Exception{
		Mango m = new Mango();
		assertEquals(m.gettype(),null);
	}
	@Test
	public void Testsettype() throws Exception{
		Mango m = new Mango();
		m.settype(null);
		assertEquals(m.gettype(),null);
	}	
	
}
