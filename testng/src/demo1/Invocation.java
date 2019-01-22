package demo1;

import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=5,invocationTimeOut=4900)
	public void loginTest() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("yw");
	}
}
