package demo3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	// ���õ�ǰʧ��ִ�еĴ���
	private int retryCount=1;
	// �������ʧ��ִ�д���
	private static int maxRetryCount=3;
	@Override
	public boolean retry(ITestResult arg0) {
		if (retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
