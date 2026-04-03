package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;
import utils.DriverManager;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtil.takeScreenshot(DriverManager.getDriver(), result.getName());
    }

}

