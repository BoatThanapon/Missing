package Missing.farmapp.model.Plant;

import static org.junit.Assert.*;
import org.junit.Test;
import Missing.farmapp.model.Plant.Papaya;

public class PapayaTest {
	@Test
	public void TestGetName() throws Exception {
		Papaya p = new Papaya();
		assertEquals(p.getName(),"Papaya");		
	}
	
	@Test
	public void TestSetName() throws Exception {
		Papaya p = new Papaya();
		p.setName("Papaya");
		assertEquals(p.getName(),"Papaya");
	}
	
	@Test
	public void TestGetHealth() throws Exception {
		Papaya p = new Papaya();
		assertEquals(p.getHealth(),5);		
	}
	
	@Test
	public void TestSetHealth() throws Exception {
		Papaya p = new Papaya();
		p.setHealth(5);
		assertEquals(p.getHealth(),5);
	}

	@Test
	public void TestgetWaterContainer() throws Exception{
		Papaya p = new Papaya();
		assertEquals(p.getWaterContainer(),2);
	}
	@Test
	public void TestsetWaterContainer() throws Exception{
		Papaya p = new Papaya();
		p.setWaterContainer(7);
		assertEquals(p.getWaterContainer(),7);
	}

	@Test
	public void TestgetAge() throws Exception{
		Papaya p = new Papaya();
		assertEquals(p.getAge(),0);
	}
	@Test
	public void TestsetAge() throws Exception{
		Papaya p = new Papaya();
		p.setAge(1);
		assertEquals(p.getAge(),1);
	}

	@Test
	public void TestgetLifeCycle() throws Exception{
		Papaya p = new Papaya();
		assertEquals(p.getLifeCycle(),5);
	}
	@Test
	public void TestsetLifeCycle() throws Exception{
		Papaya p = new Papaya();
		p.setLifeCycle(1);
		assertEquals(p.getLifeCycle(),1);
	}
	
	@Test
	public void Testgettype() throws Exception{
		Papaya p = new Papaya();
		assertEquals(p.gettype(),null);
	}
	@Test
	public void Testsettype() throws Exception{
		Papaya p = new Papaya();
		p.settype(null);
		assertEquals(p.gettype(),null);
	}	
}
