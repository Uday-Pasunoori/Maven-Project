package labmodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import labpages.LabBilling;
import uitests.LoginTest;
import utils.BaseTest;

public class Lab_Billing_Direct_Patient extends BaseTest {
	
	@Test
	public void Bookmethod() throws InterruptedException {
		
		LoginTest lt = new LoginTest();
		lt.loginMethod();
		System.out.println("logged in Successfully");
		Thread.sleep(2000);
		
		LabBilling lb = new LabBilling(driver);
		
		WebElement e = lb.getlabmodule();
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(e).perform();
		
		Thread.sleep(5000);
		
		lb.getbillingPage().click();
		System.out.println("clicked on the lab billing page");
		Thread.sleep(2000);
	
		//click on the direct patient tab
	
		driver.findElement(By.xpath("//button[@title='Direct']")).click();
		
		
		
		//enter patient name
		WebElement e2=driver.findElement(By.id("patientName"));
		e2.sendKeys("Swethal");
		System.out.println("Patient name entered");
		
		//enter mobile number
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.id("mobileNumber"));
		e3.sendKeys("2244337744");
		
		//enter age
		WebElement e4=driver.findElement(By.id("age"));
		e4.sendKeys("28");
		
		//select gender
		WebElement e5=driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
				e5.click();

		Reporter.log("Clicked on gender dropdown", true);

		Select sel = new Select(e5);

		List<WebElement> allOptions = sel.getOptions();

		Reporter.log("Available genders " + allOptions.size(), true);
		
		
		  for (int i = 0; i < allOptions.size(); i++)
		  
		  {
		  
		  if (allOptions.get(i).getText().contains("Female"))
		  
		  {
		  
		  allOptions.get(i).click();
		  
		  Reporter.log(allOptions.get(i).getText()+ " is selected ", true);
		  
		  }
		  
		  }
		 		Thread.sleep(2000);

		
		
		//enter doctor name
		lb.getdoctor().click();
		Thread.sleep(2000);
		lb.getdoctor().sendKeys("Bharathi");
		System.out.println("Doctor name entered");
		List<WebElement> doctorlist =driver.findElements(By.xpath("//ng-dropdown-panel//div//div"));
		for (int j = 0; j < doctorlist.size(); j++)
		{
			if (doctorlist.get(j).getText().equalsIgnoreCase("BHARATHI K")) {
				Thread.sleep(3000);
				doctorlist.get(j).click();
				System.out.println("Doctor is selected ");
				break;
			}
		}
		
		Thread.sleep(2000);
		lb.getLabDropdown().click();
		Thread.sleep(2000);
		lb.getLabDropdown().sendKeys("cbc"+Keys.ENTER);
		System.out.println("Lab name entered");
		Thread.sleep(2000);
		
		lb.getsubmitBtn().click();
		System.out.println("clicked on the submit button");
	}
	

}

