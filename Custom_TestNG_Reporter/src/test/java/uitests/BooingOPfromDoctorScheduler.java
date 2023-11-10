package uitests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.ProviderSchedulerPage;
import utils.BaseTest;

public class BooingOPfromDoctorScheduler extends BaseTest {
	
	
	@Test
	
	public void Booking() throws InterruptedException {
		
		//Login to app
		
		LoginTest lt = new LoginTest();
		
		 WebDriverWait wait= new WebDriverWait(driver, 20);
			
		lt.loginMethod();
		
		Thread.sleep(2000);
	
		 
		ProviderSchedulerPage psp =new ProviderSchedulerPage(driver);
		
		//click on op module
		psp.getOpmodule().click();
		Reporter.log("Clicked on Outpatient module", true);
		Thread.sleep(2000);
		
		//click on doctor scheduler
		psp.getDoctorschdl().click();
		Reporter.log("Clicked on Doctor scheduler", true);
		Thread.sleep(2000);
		
		//click on Doctor dropdown
				
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ng-select[@formcontrolname='providerId']"))));
		 
//		 psp.getDoctorschdl().click();
		WebElement e=driver.findElement(By.xpath("//ng-select[@formcontrolname='providerId']"));
		e.click();
		
		Reporter.log("Clicked on doctor dropdown", true);
		Thread.sleep(3000);
		
	
//		 JavascriptExecutor jse=(JavascriptExecutor)driver;
//		 jse.executeScript("document.getElementsByClassName(\"ng-dropdown-panel-items\")[0].scroll({\r\n"
//		 		+ " top: 3000, \r\n"
//		 		+ " left: 0, \r\n"
//		 		+ " behavior: 'smooth' \r\n"
//		 		+ "}");
			
			List<WebElement> docdrpdwn = driver.findElements(By.xpath("//ng-dropdown-panel[contains(@class, 'ng-dropdown-panel')]//div[@class='media-body']//h5"));
//			@SuppressWarnings("unchecked")
//			List<WebElement> docdrpdwn = (List<WebElement>) psp.getddlist();
			Reporter.log("Size of dropdown is " +docdrpdwn.size(), true);
			
			// selecting doctor from dropdown 
		for(int i=0;i<docdrpdwn.size();i++) {
			System.out.println("Available doctors are: "+docdrpdwn.get(i).getText());
			if(docdrpdwn.get(i).getText().contains("ASHA"))
			 {
				docdrpdwn.get(i).click();
				Reporter.log("doctor is selected ", true);
				break;
			   }
		     }
		
		
		//to select all options in dropdown
//		 for(int i=0;i<docdrpdwn.size();i++)
//		 {
//			 System.out.println("Available doctors are: "+docdrpdwn.get(i).getText());
//			 docdrpdwn.get(i).click();
//		 }
		
		
		//to select slot 
		List<WebElement> slotbody = driver.findElements(By.xpath("//tbody//tr//td"));
		Reporter.log("available slots are " +slotbody.size(), true);
		for(int j=0;j<slotbody.size();j++)
		{
			System.out.println("Available doctors are: "+slotbody.get(j).getText());
			//Reporter.log("available slots are " +slotbody.get(j).getText(), true);
			if(slotbody.get(j).getText().contains("6:55pm"))
			{
				slotbody.get(j).click();
				Reporter.log("slot is selected", true);
				break;
			}
		}
		
	
	}

}
