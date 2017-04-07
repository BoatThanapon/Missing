package farmapp;

import static org.junit.Assert.*;

import org.junit.Test;

import Missing.farmapp.util.MathUtil;

public class MathUtilTest {

	@Test
	public void testAdd() {
		
		 MathUtil mathUtil = new MathUtil();
		   assertEquals(mathUtil.add(5, 4), 9);

		
	}

}
