package labmodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.api.robot.Key;
import org.testng.Reporter;
import org.testng.annotations.Test;

import uitests.LoginTest;
//import pages.google_search;
import utils.BaseTest;

public class Lab_Billing_Existing_Patient extends BaseTest {

	@Test()
	public void LabBilling() throws InterruptedException {

			LoginTest lt = new LoginTest();
			lt.loginMethod();
			System.out.println("logged in Successfully");
			Thread.sleep(5000);
			
			// click on the lab module
			driver.findElement(By.xpath("//a[@href='#/app/labs']")).click();
			System.out.println("clicked on lab module");
			Thread.sleep(5000);

			// click on the lab billing page
			driver.findElement(By.xpath("//span[text()='Lab Billing']")).click();
			System.out.println("click on the lab billing page");
			Thread.sleep(5000);

		
			WebDriverWait wait = new WebDriverWait(driver, 20); //enter patient name
			wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//input[@role='combobox'])[3]"))));
		 
		 	WebElement e1 = driver.findElement(By. xpath("(//input[@role='combobox'])[3]"));

		 	//e.click();
		 	Thread.sleep(6000);
			/*
			 * // System.out.println("clicked on the patient dropdown"); try {
			 * e.sendKeys("889783736"); System.out.println("entered patient number"); }
			 * catch(StaleElementReferenceException e1) {
			 * 
			 * //System.out.println("clicked on dropdown"); driver.findElement(By.
			 * xpath("(//input[@role='combobox'])[3]"));
			 * 
			 * 
			 * e.sendKeys("889783736");
			  } */
			 	
		 
		 		//to search with unique and select
		 		// e1.sendKeys("8897837360");
		 		//e1.click();
		 		//Thread.sleep(2000);
		 		//e1.sendKeys(Keys.ENTER);
		 	 e1.sendKeys("8897837360");
		 	 Thread.sleep(6000);
		
			  List<WebElement> allOptions
			  =driver.findElements(By.xpath("//div[@class='media']//h5"));
			  
			  wait.until(ExpectedConditions.visibilityOfAllElements(allOptions));
			  
			  System.out.println("entered patient name"); 
			  for (int i = 0; i < allOptions.size(); i++)
			  
			  {
			  
			  if (allOptions.get(i).getText().equalsIgnoreCase("uday pasunoori"))
			  
			  {
			  
			   allOptions.get(i).click();
			  
			   System.out.println("Patient is selected");
			  }
			  else{
				  
				  System.out.println("No Patient found, please enter valid patient details");
				  
			  }
			  
			  }
			  
			 		

		    // select doctor
	        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Select Doctor']")));
		    // WebElement link = driver.findElement(By.xpath("//div[text()='Select Doctor']"));
		    // link.sendKeys("anitha");
		 
		    //Thread.sleep(9000);
		 
		 try {
			 WebElement link = driver.findElement(By.xpath("(//div[@class='ng-input']//input)[1]"));
			 link.click();
			 Reporter.log("Enter Doctor name", true);
			 Thread.sleep(5000);
			 link.sendKeys("bharathi");
		 }
		 
		 catch(StaleElementReferenceException e) {
			 
			 
		 }
		 
		 
		
		List<WebElement> doctorlist =driver.findElements(By.xpath("//ng-dropdown-panel//div//div"));
		for (int j = 0; j < doctorlist.size(); j++)
		{
			if (doctorlist.get(j).getText().equalsIgnoreCase("Bharathi k")) {
				Thread.sleep(3000);
				doctorlist.get(j).click();
				System.out.println("Doctor is selected ");
				break;
			}
		}
		
		Thread.sleep(3000);

		// select lab
		WebElement e3=	driver.findElement(By.xpath("(//div[@class='ng-input']//input)[2]"));
		e3.click();
		e3.sendKeys("cbc");
		Thread.sleep(2000);
		e3.click();
		e3.sendKeys(Key.ENTER);
		
		
		Reporter.log("lab" + e3.getText() +" is selected", true);
		Thread.sleep(3000);

		// click on the submit button
		driver.findElement(By.xpath("//button[@id='submitLabBilling']")).click();
		Reporter.log("clicked on the submit button, lab booking is completed", true);
		Thread.sleep(6000);
		
		//driver.switchTo().frame();
		/*WebElement e5=driver.findElement(By.id("amount_tendered"));
		e5.click();
		e5.sendKeys("20");*/

		/*
		 * google_search gs = new google_search(driver); gs.search();
		 * //Assert.assertTrue(driver.getPageSource().contains("Wells Fargo"),
		 * "Expected text not found on page!");
		 */
	}
}
