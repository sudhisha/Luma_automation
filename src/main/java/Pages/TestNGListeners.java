package Pages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Luma Automation started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        take screenshots
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Testing Completed");
    }
}
