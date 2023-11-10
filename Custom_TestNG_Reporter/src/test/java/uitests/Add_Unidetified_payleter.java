package uitests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AddPatientfromQSP;
import utils.BaseTest;

public class Add_Unidetified_payleter extends BaseTest {

	@Test
	public void addUnidentified() throws InterruptedException {
		LoginTest lt = new LoginTest();
		lt.loginMethod();

		Thread.sleep(3000);
		AddPatientfromQSP adp = new AddPatientfromQSP(driver);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// click on outpatinet
		adp.getopmodule().click();
		Reporter.log("Clicked on Outpatient module", true);

		Thread.sleep(2000);

		// click on quick schedule
		adp.getqsp().click();
		Reporter.log("Clicked on Quickschedule", true);

		Thread.sleep(2000);
		// click on unidentified patient
		adp.getunidentified().click();
		Reporter.log("Clicked on Unidentified patient checkbox", true);

		// select gender from dd list
		Thread.sleep(6000);

		WebElement gender = adp.getGender();

		gender.click();

		// Thread.sleep(3000);

		Select gen = new Select(gender);

		List<WebElement> Opts = gen.getOptions();

		for (int i = 0; i < Opts.size(); i++)

		{

			if (Opts.get(i).getText().contains("Female"))

			{
				Thread.sleep(2000);
				Opts.get(i).click();

				Reporter.log("Gender is selected ", true);

			}

		}

		// select doctor from dd list
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
				By.xpath("//ng-select[@placeholder='Enter Doctor Name/Specialization']//input[@role='combobox']"))));

		WebElement e = driver.findElement(
				By.xpath("//ng-select[@placeholder='Enter Doctor Name/Specialization']//input[@role='combobox']"));
		e.click();

		System.out.println("clicked on doctor dropdown");
		List<WebElement> doctlist = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//h5"));
		for (int j = 0; j < doctlist.size(); j++) {
			if (doctlist.get(j).getText().contains("abhinav")) {
				Thread.sleep(2000);
				doctlist.get(j).click();

				Reporter.log("Doctor" + doctlist.get(j) + "is selected", true);
			}
		}

		// select slot

		// click on submit without payment

		adp.getSubmitbtn();
		Reporter.log("Doctor is selected", true);

	}

}
