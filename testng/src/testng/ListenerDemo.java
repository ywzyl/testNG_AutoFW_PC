package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerDemo implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Test
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("��������ʧ�ܣ�������ͼ��");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Test
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("����������"+arg0.toString());
		
	}
	@Test
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("����ִ�гɹ���"+arg0.toString());
		
	}

}
