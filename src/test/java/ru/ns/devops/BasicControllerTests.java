package ru.ns.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicControllerTests {
	private final BasicController controller;

	public BasicControllerTests() {
		this.controller = new BasicController();
	}

	@Test
	void testHello() {
		String actual = controller.getHello();
		Assertions.assertEquals("HELLO", actual);
	}

	@Test
	void testZeroDivision() {
		Assertions.assertEquals(Double.POSITIVE_INFINITY, controller.divide(1, 0));
	}

	@Test
	void testDivision() {
		Assertions.assertEquals(2.0, controller.divide(4, 2));
	}
}
