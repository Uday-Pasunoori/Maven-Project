package labmodule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import labpages.CancelLab;
import labpages.LabBilling;
import uitests.LoginTest;

public class Cancel_lab {
	
	
	@Test
	public void cancelMethod(WebDriver driver) throws InterruptedException {
		
		LoginTest lt= new LoginTest();
		lt.loginMethod();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		LabBilling lb=new LabBilling(driver);
		
		lb.getbillingPage().click();
		Thread.sleep(3000);
		
		CancelLab cl=new CancelLab(driver);
		cl.getcanceltab().click();
		Thread.sleep(3000);
		
		cl.getselectbtn().click();
		Thread.sleep(3000);
		
		cl.getcancelbtn().click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();//to click on yes
		
		//al.dismiss();//to click on cancel
		
		
	
	}

}
