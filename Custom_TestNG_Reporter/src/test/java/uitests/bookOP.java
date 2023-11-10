package uitests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AddPatientfromQSP;

import utils.BaseTest;

public class bookOP extends BaseTest {

	@Test
	public void Booking() throws Throwable {

		// Login to Application
		LoginTest lt = new LoginTest();
		lt.loginMethod();
		System.out.println("logged in Successfully");
		Thread.sleep(2000);

		// Open the Quick schedule module and Appointment
		AddPatientfromQSP qsp = new AddPatientfromQSP(driver);
		qsp.getopmodule().click();
		Thread.sleep(2000);
		qsp.getqsp().click();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		System.out.println("Clicked on QS, QS page is Opened");

		Thread.sleep(3000);
		qsp.getSearchfield().sendKeys("raju");
//        		qsp.getPatienttxtbox().sendKeys("SANDYA");
//        		WebElement e2 = driver.findElement(By.xpath("//p[text()='8897837360']/ancestor::td"));
//        		e2.click();
//        		
//                System.out.println("Patient name is Entered");
//
		Thread.sleep(3000);
//	        	qsp.getSelectbtn().click();
//		    	System.out.println("Patient is Selected");

		List<WebElement> tabledata = driver.findElements(By.xpath("//td//div//h5"));

		Reporter.log("Matching Patients start with the provided are: " + tabledata.size(), true);

		for (int i = 0; i < tabledata.size(); i++) {
			Reporter.log("Patient details are: " + tabledata.get(i).getText(), true);
			if (tabledata.get(i).getText().equalsIgnoreCase("raju b")) {

				List<WebElement> activeornot = qsp.getActiveStatus();
				Reporter.log("Pateint active status is: " + activeornot, true);

				for (WebElement status : activeornot) {

					status.getText().equalsIgnoreCase("No");
					status.click();

				}
			}

			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("//ng-select[@placeholder='SELECT DOCTOR']"))));

			WebElement e = driver.findElement(By.xpath("//ng-select[@placeholder='SELECT DOCTOR']"));
			e.click();

			System.out.println("clicked on dropdown");
			List<WebElement> doctlist = driver
					.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//h5"));
			for (int j = 0; j < doctlist.size(); j++) {
				if (doctlist.get(j).getText().equalsIgnoreCase("PREETHI K")) {
					doctlist.get(j).click();
					Reporter.log("Doctor is selected", true);
				}
			}

//	           
//	           WebElement dd= driver.findElement(By.xpath("//h5[text()='DR DEEPTHI JAIN']"));
//	           Thread.sleep(3000);
//	           dd.click();
//		       System.out.println("doctor is Seleted");
//		       	      
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("window.scrollBy(0,1200)");
			System.out.println("Window is Scrolled down");

			Thread.sleep(3000);

			jse.executeScript("document.querySelector('.simplebar-content-wrapper').scrollTop=600");
			System.out.println("Slots table is Scrolled down");

			Thread.sleep(3000);

			qsp.clickOnVpmslot();
			System.out.println("5pm slot is selected");

			Thread.sleep(3000);

			qsp.clickOnSubmitbtn();
			System.out.println("Clicked on Submit button, Appointment is booked succsessfully");

		}

	}

}
