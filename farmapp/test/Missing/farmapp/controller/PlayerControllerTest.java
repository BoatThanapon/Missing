package Missing.farmapp.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerControllerTest {

	@Test
	public void PlayControllerTest(){
		PlayerController player = new PlayerController();
		assertEquals(player.getName(),"Doraemon");
	}

}
