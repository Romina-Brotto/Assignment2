package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;

	@Before
	public void setup() {
		user = new User("Romina","Brotto",21);
	}

	@Test
	public void getNameTest() {
		assertEquals("Romina", user.getName());
	}

	@Test
	public void getSurnameTest() {
		assertEquals("Brotto", user.getSurname());
	}

	@Test
	public void getAgeTest() {
		assertEquals(21, user.getAge());
	}

	@Test
	public void invalidAgeTest() {
		boolean b = true;
		if(user.getAge()<0)
			b = false;
		assertEquals(true, b);
	}
} 