package reexecutiononfailure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner  implements IAnnotationTransformer{

	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2,
			Method arg3) {
		// TODO Auto-generated method stub
		
		Class<? extends IRetryAnalyzer> analyzer = arg0.getRetryAnalyzerClass();
		
		if (analyzer == null)	{
			arg0.setRetryAnalyzer(Retry.class);
		}

	}

}
