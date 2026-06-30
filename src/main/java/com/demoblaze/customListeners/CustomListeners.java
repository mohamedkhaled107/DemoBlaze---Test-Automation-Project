package com.demoblaze.customListeners;

import com.demoblaze.utils.ScreenShot;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;

public class CustomListeners implements IInvokedMethodListener, ITestListener, IRetryAnalyzer {
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod())
            System.out.println("Before Invocation: " + method.getTestMethod().getMethodName() + " started");
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After Invocation: " + method.getTestMethod().getMethodName()+ " finished");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getMethod().getMethodName() + " passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test " + result.getMethod().getMethodName() + " failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test " + result.getMethod().getMethodName() + " skipped");
    }

    private int retryCount = 0;
    public boolean retry(ITestResult var1) {
        if (var1.getStatus() == ITestResult.FAILURE && retryCount == 0) {
            retryCount++;
            System.out.println("Retrying " + var1.getMethod().getMethodName() + " for the " + retryCount + " time(s)");
            return true;
        }
        return false;
    }
}
