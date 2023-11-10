package uitests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AddPatientfromQSP;
import utils.BaseTest;

public class Quickscheduletest extends BaseTest {

	@Test
	public void qsMethod() throws InterruptedException {

		LoginTest lt = new LoginTest();
		lt.loginMethod();
		Thread.sleep(5000);

		AddPatientfromQSP qsp = new AddPatientfromQSP(driver);
		Thread.sleep(6000);

//	qsp.getqsp().click();
//	Thread.sleep(3000);
//	qsp.getMobtxtb().sendKeys("1122334455");
//	Thread.sleep(3000);
//	qsp.getAddnewptbtn().click();
//	Thread.sleep(3000);
//	WebElement ddAddr=qsp.getSaltndropdown();
//	Select sel= new Select(ddAddr);
//	List<WebElement> allOptions =sel.getOptions();
//	System.out.println("Total Options in DD are "+allOptions.size());
//	sel.selectByIndex(2);
//	Thread.sleep(3000);
//	qsp.getFstNametxb().sendKeys("pushpa");
//	Thread.sleep(3000);
//	qsp.getLastNametxb().sendKeys("Reddy");
//	Thread.sleep(3000);
//	qsp.getAgetxt().sendKeys("38");
//	Thread.sleep(3000);
//
//qsp.getFatherName().sendKeys("Veera Reddy");
//Thread.sleep(3000);
//qsp.getStreettxt().sendKeys("uppal, hyd");
//Thread.sleep(3000);

		// click on the outpatient module
		qsp.getopmodule().click();
		Thread.sleep(5000);
		// click on the quickschedule
		qsp.getqsp().click();
		Thread.sleep(5000);
//	qsp.getSearchfield().sendKeys("raju");

		// enter first name
		qsp.getFstNametxb().sendKeys("neelima");
		Thread.sleep(5000);

		// enter last name
		qsp.getLastNametxb().sendKeys("j");
		Thread.sleep(5000);

		// enter mobile number
		qsp.getMobtxtb().sendKeys("5555555558");
		Thread.sleep(5000);

		// enter age
		qsp.getAgetxt().sendKeys("30");
		Thread.sleep(5000);

		// select gender
		qsp.getGender().click();
		// WebElement ddAddr = driver.findElement(By.id("novotel"));
		Select sel = new Select(qsp.getGender());// Address of Dropdown
		List<WebElement> allOptions = sel.getOptions();
		System.out.println("Total Options in DD: " + allOptions.size());
		for (int gen = 0; gen < allOptions.size(); gen++) {
			if (allOptions.get(gen).getText().equalsIgnoreCase("FEMALE")) {
				Thread.sleep(3000);
				allOptions.get(gen).click();
				Reporter.log("Gender is selected", true);
				break;
			}
		}
		Thread.sleep(7000);
		// scroll down inside web element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"div[class='scrollableForm']\").scrollTop=1200");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// select location
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("(//input[@role='combobox'])[9]"))));
		WebElement e4 = driver.findElement(By.xpath("(//input[@role='combobox'])[9]"));
		e4.click();

		List<WebElement> contp = driver.findElements(By.xpath("//span[@class='ng-option-label']"));
		for (int j = 0; j < contp.size(); j++) {
			if (contp.get(j).getText().equalsIgnoreCase("Bogulkunta")) {
				Thread.sleep(3000);
				contp.get(j).click();
				Reporter.log("Bogulkunta", true);
				break;
			}
		}
		Thread.sleep(3000);

		// select consultation type
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("(//input[@role='combobox'])[10]"))));
		WebElement e5 = driver.findElement(By.xpath("(//input[@role='combobox'])[10]"));
		e5.click();

		List<WebElement> locs = driver.findElements(By.xpath("//span[@class='ng-option-label']"));
		for (int j = 0; j < locs.size(); j++) {
			if (locs.get(j).getText().equalsIgnoreCase("Physical Consultation")) {
				Thread.sleep(3000);
				locs.get(j).click();
				Reporter.log("Consultation type is selected", true);
				break;
			}
		}

		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("(//input[@role='combobox'])[11]"))));

		// click on the dropdown
		WebElement e = driver.findElement(By.xpath("(//input[@role='combobox'])[11]"));
		e.sendKeys("Manish V");

		// select doctor
//	qsp.getDoctdd().click();
		Thread.sleep(3000);
		System.out.println("clicked on dropdown");
		List<WebElement> doctlist = driver
				.findElements(By.xpath("//div[@class='media-body']//span[@class='d-block font-13']"));
		for (int j = 0; j < doctlist.size(); j++) {
			if (doctlist.get(j).getText().contains("MATERNITY")) {
				Thread.sleep(3000);
				doctlist.get(j).click();
				Reporter.log("Doctor is selected", true);
				break;
			}
		}

		Thread.sleep(5000);

		// js.executeScript("document.querySelector(\"div[class='scrollableForm']\").scrollTop=100");
		// select charge type

		WebElement e3 = driver.findElement(By.xpath("//select[@formcontrolname='paymentStatus']"));
		e3.click();

		Select select = new Select(e3);
		List<WebElement> pmt = select.getOptions();
		// select payment status
		// List<WebElement> payment =
		// driver.findElements(By.xpath("//select[@formcontrolname='paymentStatus']"));

		// Reporter.log(": " +pmt.size() , true);

		for (int i = 0; i < pmt.size(); i++) {

			if (pmt.get(i).getText().equalsIgnoreCase("pay now"))

			{
				pmt.get(i).click();
				Reporter.log("pay now selected", true);
			}

		}
		Thread.sleep(3000);
		// to handle ElementClickInterceptedException
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//select[@formcontrolname='payTypeId']"))));
		WebElement e6 = driver.findElement(By.xpath("//select[@formcontrolname='payTypeId']"));
		e6.click();

		// qsp.getPayMentType().click();
		Select sele = new Select(qsp.getPayMentType());

		List<WebElement> pt = sele.getOptions();

		for (int k = 0; k < pt.size(); k++) {
			if (pt.get(k).getText().contains("Cash")) {
				pt.get(k).click();
				Reporter.log("Pay type Cash is selected", true);
				// qsp.getPaymentnumber().sendKeys("32431");
				// Reporter.log("Payment number is entered please select slot to proceed",
				// true);
			}
		}
		Thread.sleep(5000);

		/*
		 * List<WebElement> tabledata = driver.findElements(By.xpath("//td//div//h5"));
		 * 
		 * Reporter.log("Matching Patients start with the provided are: "
		 * +tabledata.size() , true);
		 * 
		 * for(int i=0;i<tabledata.size();i++) {
		 * 
		 * if(tabledata.get(i).getText().equalsIgnoreCase("raju b"))
		 * 
		 * { Reporter.log("Patient details are: " +tabledata.get(i).getText(), true);
		 * List<WebElement> activeornot = qsp.getActiveStatus();
		 * Reporter.log("Pateint active status is: "+activeornot, true); for(WebElement
		 * status:activeornot) {
		 * 
		 * status.getText().equalsIgnoreCase("No"); status.click(); break;
		 * 
		 * } break; } }
		 */

		/*
		 * Thread.sleep(3000); qsp.getAppointmentTypeDD().click(); Select apt = new
		 * Select(qsp.getAppointmentTypeDD()); List<WebElement> aptype =
		 * apt.getOptions(); for(int l=0;l<aptype.size();l++) {
		 * if(aptype.get(l).getText().contains("New Appointment")) {
		 * aptype.get(l).click(); }
		 * 
		 * 
		 * }
		 */

		// select slot
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@formcontrolname='payTypeId']"))));
		wait.until(ExpectedConditions
				.visibilityOfAllElements(driver.findElements(By.xpath("//i[@class='icon-clock-1']"))));
		List<WebElement> slotsBody = driver.findElements(By.xpath("//i[@class='icon-clock-1']"));

		for (int m = 0; m < slotsBody.size(); m++) {
			if (slotsBody.get(m).getText().contains("04:00 PM")) {
				slotsBody.get(m).click();
				System.out.println("04:00 PM slot is selected");
				break;
			}
		}
		Thread.sleep(5000);
		qsp.getSubmitbtn().click();

//    		       JavascriptExecutor jse=(JavascriptExecutor)driver;
//    		        
//    	           jse.executeScript("window.scrollBy(0, 800)");
//    		       Reporter.log("Window is Scrolled down", true);
//
//    	           Thread.sleep(3000);
//    		        
//    	           jse.executeScript("document.querySelector('.mt-1').scrollTop=600");
//    		       Reporter.log("Slots table is Scrolled down", true);

		// enter amount in the salucro page
		/*
		 * driver.findElement(By.id("amount_tendered")).sendKeys("150");
		 * Thread.sleep(3000); driver.findElement(By.id("totalbutton")).click();
		 * 
		 * 
		 */

	}
}
