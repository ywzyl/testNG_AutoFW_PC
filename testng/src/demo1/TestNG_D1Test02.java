package demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_D1Test02 {

  @Test(priority=4)
  @Parameters({"Browser","Server"})
  public void f(String browser,String server) {
    System.out.println("这次启动浏览器是： "+browser+" 测试服务器地址是： "+server);
  }
  @Test(priority=3)
  public void t1() {
	  System.out.println("t1");
  }
  @Test(priority=2)
  public void t2() {
	  System.out.println("t2");
  }
  @Test(priority=1)
  public void t3() {
	  System.out.println("t3");
  }
}
