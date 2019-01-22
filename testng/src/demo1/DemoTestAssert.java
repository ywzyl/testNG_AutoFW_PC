package demo1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DemoTestAssert {
	@Test
	public void test() {
		String st="Hello TestNG";
		assertEquals(st, "Junit");
	}
}
