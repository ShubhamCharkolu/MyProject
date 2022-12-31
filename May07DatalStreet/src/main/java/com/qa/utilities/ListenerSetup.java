package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution failed");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
}
