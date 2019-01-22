package testng;

import org.testng.annotations.Test;

public class TestNG_Demo1 {
	  @Test
	  public void f() {
		  System.out.println("t1");
}
	  @Test(dependsOnMethods= {"t4","f"})
	  public void t2() {
		  System.out.println("t2");
	  }
	  @Test
	  public void t3() {
		  System.out.println("t3");
	  }
	  @Test
	  public void t4() {
		  System.out.println("t4");
	  }
	  @Test
	  public void t5() {
		  System.out.println("t5");
	  }
}
