package Missing.farmapp.controller;

import static org.junit.Assert.*;
import org.junit.Test;

public class TimeControllerTest {

	@Test
	public void TestgetDay() {
		TimeController tc = new TimeController();
		assertEquals(tc.getDay(),1);
	}
	
	@Test
	public void TestsetDay() {
		TimeController tc = new TimeController();
		tc.setDay(1);
		assertEquals(tc.getDay(),1);
	}

}
