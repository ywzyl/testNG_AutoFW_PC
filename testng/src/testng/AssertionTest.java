package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	@Test(enabled=false)
	public void assertTest() {
		Assert.assertEquals(12, 12);
		Assert.assertEquals("ABC", "ABc","not equals");
	}
	@Test(enabled=false)
	public void assertTest1() {
		String[] st1 = {"Anthony", "Tom", "Jhon"};
        String[] st2 = {"Anthony", "Tom", "Jhon"};
		String[] st3=st1;
		Assert.assertTrue(st1==st2, "两者不相同");
	}
	@Test
	public void testSoftAssert() {
		System.out.println("start");
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(12, 13,"两者不相等");
		System.out.println("end");
		System.out.println(3+8);
		assert1.assertAll();
	}
}
