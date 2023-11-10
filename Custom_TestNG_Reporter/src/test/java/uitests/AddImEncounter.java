/*package uitests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AddPatientfromQSP;
import utils.BaseTest;

public class AddImEncounter extends BaseTest {
	
	
		@Test
		public void addEnconter() throws InterruptedException {
			
			LoginTest lt =new LoginTest();
			lt.loginMethod();
			
			Thread.sleep(2000);
			AddPatientfromQSP adp =new AddPatientfromQSP(driver);
			
			 WebDriverWait wait= new WebDriverWait(driver, 20);  

			
			adp.getopmodule().click();
			
			Reporter.log("Clicked on Outpatient module", true);
			
			Thread.sleep(3000);
			
			WebElement encbtn=driver.findElement(By.xpath("//div//button[text()=' Add Encounter ']"));
			encbtn.click();
			Reporter.log("Clicked on AddEncounter", true);
			
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			 
			List<WebElement> encdrp = 
					driver.findElements(By.xpath("//div//a[@class='dropdown-item']"));
			System.out.println(encdrp.size());

			for(int i=0;i<encdrp.size();i++)
			{
				System.out.println(encdrp.get(i).getText());
				if(encdrp.get(i).getText().contains("Internal")) 
				{
								
					js.executeScript("arguments[0].click();", encdrp.get(i));
					Reporter.log("Clicked on Internal Medicine Encounter", true);
					break;
				}
			}	
			 List<WebElement> navigation = driver.findElements(By.xpath("//ul//li//a[@class='dropdown-item']"));
			 System.out.println(navigation.size());
			 for(int j=0;j<navigation.size();j++)
			 if(navigation.get(j).getText().equalsIgnoreCase("Documents"))
			 {
				 navigation.get(j).click();
				 Reporter.log("Clicked on Medicine, please add", true);
				 
			 }
			
			
			
	}
}
*/
