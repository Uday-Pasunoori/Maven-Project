package uitests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;
import utils.PropertyUtils;

public class LoginTest extends BaseTest {

	@Test
	public void loginMethod() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		lp.getEmail().sendKeys(PropertyUtils.getProperty("app.username"));

		Reporter.log("username is Entered", true);

		Thread.sleep(2000);

		lp.getPasswod().sendKeys(PropertyUtils.getProperty("app.password"));

		Reporter.log("password is Entered", true);

		Thread.sleep(2000);

		WebElement ele = lp.getLocation();

		ele.click();

		Reporter.log("Clicked on Location", true);

		Select sel = new Select(ele);

		List<WebElement> allOptions = sel.getOptions();

		Reporter.log("Hospital branches available in " + allOptions.size() + " Locations", true);
		
		//allOptions.get(4).click();

		
		  for (int i = 0; i < allOptions.size(); i++)
		  
		  {
		  
		  if (allOptions.get(i).getText().contains("Bogulkunta"))
		  
		  {
		  
		  allOptions.get(i).click();
		  
		  Reporter.log(allOptions.get(i).getText()+ " Location is selected ", true);
		  
		  }
		  
		  }
		 		Thread.sleep(2000);

		for (WebElement one : allOptions) {

			Reporter.log(one.getText());
		}
		Thread.sleep(3000);

		lp.clickSigninbtn();

	}

}
