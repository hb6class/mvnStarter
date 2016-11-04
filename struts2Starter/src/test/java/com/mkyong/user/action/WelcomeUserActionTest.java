package com.mkyong.user.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomeUserActionTest {
	WelcomeUserAction ac = new WelcomeUserAction();
	@Test
	public void testGetUsername() {
		ac.setUsername("test");
		assertEquals("test", ac.getUsername());
	}

	@Test
	public void testSetUsername() {
		ac.setUsername("test");
		assertNotNull(ac.getUsername());
	}

}
