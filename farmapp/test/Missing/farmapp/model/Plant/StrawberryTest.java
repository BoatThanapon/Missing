package Missing.farmapp.model.Plant;

import static org.junit.Assert.*;
import org.junit.Test;
import Missing.farmapp.model.Plant.Strawberry;

public class StrawberryTest {

	@Test
	public void TestGetName() throws Exception {
		Strawberry s = new Strawberry();
		assertEquals(s.getName(),"Strawberry");		
	}
	
	@Test
	public void TestSetName() throws Exception {
		Strawberry s = new Strawberry();
		s.setName("Papaya");
		assertEquals(s.getName(),"Papaya");
	}
	
	@Test
	public void TestGetHealth() throws Exception {
		Strawberry s = new Strawberry();
		assertEquals(s.getHealth(),5);		
	}
	
	@Test
	public void TestSetHealth() throws Exception {
		Strawberry s = new Strawberry();
		s.setHealth(5);
		assertEquals(s.getHealth(),5);
	}

	@Test
	public void TestgetHealthContainer() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.getHealthContainer(),5);
	}
	@Test
	public void TestsetHealthContainer() throws Exception{
		Strawberry s = new Strawberry();
		s.setHealthContainer(7);
		assertEquals(s.getHealthContainer(),7);
	}
	
	@Test
	public void TestgetCurrentWater() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.getCurrentWater(),2);
	}
	@Test
	public void TestsetCurrentWater() throws Exception{
		Strawberry s = new Strawberry();
		s.setCurrentWater(3);
		assertEquals(s.getCurrentWater(),3);
	}
	
	@Test
	public void TestgetWaterContainer() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.getWaterContainer(),2);
	}
	@Test
	public void TestsetWaterContainer() throws Exception{
		Strawberry s = new Strawberry();
		s.setWaterContainer(7);
		assertEquals(s.getWaterContainer(),7);
	}

	@Test
	public void TestgetAge() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.getAge(),0);
	}
	@Test
	public void TestsetAge() throws Exception{
		Strawberry s = new Strawberry();
		s.setAge(1);
		assertEquals(s.getAge(),1);
	}

	@Test
	public void TestgetLifeCycle() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.getLifeCycle(),5);
	}
	@Test
	public void TestsetLifeCycle() throws Exception{
		Strawberry s = new Strawberry();
		s.setLifeCycle(1);
		assertEquals(s.getLifeCycle(),1);
	}
	
	@Test
	public void Testgettype() throws Exception{
		Strawberry s = new Strawberry();
		assertEquals(s.gettype(),null);
	}
	@Test
	public void Testsettype() throws Exception{
		Strawberry s = new Strawberry();
		s.settype(null);
		assertEquals(s.gettype(),null);
	}	

}
