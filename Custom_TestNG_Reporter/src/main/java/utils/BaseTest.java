package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends TestListenerAdapter {
	public static WebDriver driver;

	/*
	 * public static void clickElement(WebElement element){ JavascriptExecutor
	 * js=(JavascriptExecutor)driver; js.executeScript("arguments[0].click();",
	 * element);
	 * 
	 * }
	 */

	@BeforeTest(alwaysRun = true)

	public void setUp() throws Throwable {
		/*
		 * System.setProperty("os", os); System.setProperty("os_version", os_version);
		 * System.setProperty("browser", browser); System.setProperty("browser_version",
		 * browser_version);
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaykiran\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.setBinary("C:\\Users\\udaykiran\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		//option.addArguments("--remote-allow-origins=*");
		//option.addArguments("start-maximized");
		driver = new ChromeDriver(option);
		driver.get(PropertyUtils.getProperty("app.url"));

		driver.manage().window().maximize();

		//Thread.sleep(5000);

		 new WebDriverWait(driver, 50).until(ExpectedConditions.titleContains("Login | Careaxes"));
		CommonLibs clib = new CommonLibs();
		clib.verify(clib.getPageTitle(), PropertyUtils.getProperty("logintitle"), "Login | Careaxes ");
	}

	
	  @AfterTest(alwaysRun = false) public void tearDown()
	  { 
		  driver.close();
		  driver.quit(); 
	  }
	 
	public WebDriver getDriverInstance() {
		return driver;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		onTestFailure(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseTest) currentClass).getDriverInstance();

		if (driver != null) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			try {
				String fileNameToCopy = "target/custom-test-reports/" + result.getTestClass().getName()
						+ "_screenshot.png";
				FileUtils.copyFile(scrFile, new File(fileNameToCopy));
				Reporter.log(
						"[Console Log] Screenshot saved in " + result.getTestClass().getName() + "_screenshot.png");
			} catch (IOException ex) {
				// Log error message
			}
		}

	}
}
