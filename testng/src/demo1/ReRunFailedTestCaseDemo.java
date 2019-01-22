package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunFailedTestCaseDemo {
	@Test
	public void test01() {
		System.out.println("test01");
	}
	@Test(dependsOnMethods="test03",alwaysRun=true)
	public void test02() {
		System.out.println("test02");
	}
	@Test
	public void test03() {
		System.out.println("test03");
		Assert.assertEquals(11, 13);
	}
	@Test(dependsOnMethods="test05",alwaysRun=true)
	public void test04() {
		System.out.println("test04");
	}
	@Test
	public void test05() {
		System.out.println("test05");
		Assert.assertTrue(11==15);
	}
}
