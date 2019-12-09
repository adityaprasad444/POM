package com.spicejet.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerHelp implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : " +result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {


		System.out.println("Test Success : " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : " +result.getName());


	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " +result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println("Test Started");
		System.out.println("------------------");

	}

	public void onFinish(ITestContext context) {
		System.out.println("------------------");
		System.out.println("Test Ended");


	}

}
