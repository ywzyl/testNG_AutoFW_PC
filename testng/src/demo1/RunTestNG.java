package demo1;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunTestNG {
	public static void main(String[] args) throws InterruptedException {
		TestNG testNG=new TestNG();
		List<String> suites=new ArrayList<String>();
		suites.add(".\\temp-testng-customsuite.xml");
		testNG.setTestSuites(suites);
		testNG.run();
        // 等待执行结束，然后去执行失败用例
		TestNG testNG2=new TestNG();
		List<String> suites2=new ArrayList<>();
		Thread.sleep(4000);
		suites2.add(".\\test-output\\testng-failed.xml");
		testNG2.setTestSuites(suites2);
		testNG2.run();
	}
}
