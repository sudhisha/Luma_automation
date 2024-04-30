package Pages;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Date;

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
