package demo1;


import org.testng.annotations.Test;

public class TestDependenceDemo {
	@Test(groups= {"tomcat"})
	public void restartTomcatService() {
		System.out.println("Restart the tomcat server when it is down!");
	}
	@Test(groups= {"tomcat"})
	public void tomcatServiceIsDown() {
		System.out.println("tomcat service is down");
	}
	@Test(groups= {"app"})
	public void  startAppServer() {
		System.out.println("Start App service");
	}
	@Test(groups= {"app"})
	public void shutDownApp() {
		System.out.println("Shutdown App service");
	}
}
