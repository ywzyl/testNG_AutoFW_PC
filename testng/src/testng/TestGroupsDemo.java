package testng;

import org.testng.annotations.Test;

public class TestGroupsDemo {
	@Test(groups= {"API Test","Function Test"})
	public void t1() {
		System.out.println("API Testing and Function testing");
	}
	@Test(groups= {"API Test"})
	public void t2() {
		System.out.println("API Testing ");
	}
	@Test(groups= {"Function Test"})
	public void t3() {
		System.out.println("Function testing");
	}
	@Test
	public void t4() {
		System.out.println("nothing");
	}
}
