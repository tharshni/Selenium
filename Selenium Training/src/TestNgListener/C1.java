package TestNgListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class C1 implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Success:" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure:" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished");
		
	}
	  
	
	
	

}
