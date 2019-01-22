package demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyRetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation iTestAnnotation, Class class1, Constructor constructor, Method method) {
		if ("test03".equals(method.getName())) {
			//设置test03这个方法调用的总次数。
			iTestAnnotation.setInvocationCount(3);
		}
		}		
	}
	

