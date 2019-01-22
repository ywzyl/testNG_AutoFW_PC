package demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyRetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation iTestAnnotation, Class class1, Constructor constructor, Method method) {
		if ("test03".equals(method.getName())) {
			//����test03����������õ��ܴ�����
			iTestAnnotation.setInvocationCount(3);
		}
		}		
	}
	

