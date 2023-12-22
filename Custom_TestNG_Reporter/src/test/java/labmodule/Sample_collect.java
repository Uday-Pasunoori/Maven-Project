package labmodule;

import org.testng.annotations.Test;

import labpages.LabBilling;
import labpages.sampleCollectPage;
import uitests.LoginTest;
import utils.BaseTest;

public class Sample_collect extends BaseTest{
	
	@Test
	public void sampleCollect() throws InterruptedException {
		
		LoginTest lt =new LoginTest();
		
		lt.loginMethod();
		System.out.println("logged in Successfully");
		Thread.sleep(2000);
		
		LabBilling lb = new LabBilling(driver);
		lb.getlabmodule().click();
		Thread.sleep(2000);
		
		sampleCollectPage sc=new sampleCollectPage(driver);
		
		sc.getSamplecollect().click();
		Thread.sleep(2000);
		sc.getSelectButton().click();
		Thread.sleep(2000);
		sc.getCheckBox().click();
		Thread.sleep(2000);
		sc.getFinalButtton().click();
		
	}

	
	
}
