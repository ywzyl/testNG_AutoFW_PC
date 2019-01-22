package testng;

import org.testng.annotations.Test;

public class TimeoutTest {
	@Test(timeOut=3000)
	public void loginTest() {
		try {
			Thread.sleep(2900);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
