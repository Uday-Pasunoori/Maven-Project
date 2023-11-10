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

public class AddpatientTest extends BaseTest {
	
	@Test
	
	public void addpatientmethod() throws InterruptedException {
		
		LoginTest lt = new LoginTest();
		
		 WebDriverWait wait= new WebDriverWait(driver, 20);
			
		lt.loginMethod();
		
		Thread.sleep(3000);
		
		AddPatientfromQSP adp =new AddPatientfromQSP(driver);
		
		adp.getopmodule().click();
		
		Reporter.log("Clicked on Outpatient module", true);
		
		Thread.sleep(3000);
		
		adp.getqsp().click();
		
		Reporter.log("Clicked on Quick schedule", true);
		
		Thread.sleep(3000);
		
//		adp.getSearchfield().sendKeys("jayshree");
//		
//		Reporter.log("Patient name is Entered", true);
		
		adp.getAddnewptbtn().click();
		
		Reporter.log("Clicked on Add new Patient Button", true);
		
		Thread.sleep(3000);
		
//		adp.getSaltndropdown().click();
		
		WebElement saltation = adp.getSaltndropdown();
		
		saltation.click();
		
		Reporter.log("Clicked on salutation dropdown", true);
		
		Thread.sleep(3000);
		
		Select sel = new Select(saltation);
		
		List<WebElement> Options =sel.getOptions();
		
		   for(int i = 0; i<Options.size(); i++)
	        	
	        {
	             	             
	            if(Options.get(i).getText().equalsIgnoreCase("Mr."))
	            	
	             {
	            	      
	                Options.get(i).click();
	               
	                
	                Reporter.log("Appointent for Male ", true);
	                
	             }
	            
	         }
	               
	        Thread.sleep(3000);   
	        
	        adp.getFstNametxb().sendKeys("Naresh");
	        
	        Reporter.log("First name is Entered", true);
	        
	        Thread.sleep(3000);
	        
	        adp.getLastNametxb().sendKeys("P");
	        
	        Reporter.log("Last name is Entered", true);
	        
	        Thread.sleep(3000);
	        
	        adp.getFatherName().sendKeys("Narender");
	        
	        Reporter.log("Father name is Entered", true);
	        
	        Thread.sleep(3000);
	        
	        adp.getMobtxtb().sendKeys("1234564485");
	        
	        Reporter.log("Mobile number is Entered", true);
	        
	        Thread.sleep(3000);
	        
	        adp.getAgetxt().sendKeys("35");
	        
	        Reporter.log("Patient Age is Entered", true);
	        
	        Thread.sleep(3000);
	        
	       WebElement marital=adp.getMaritalDD();
	       
	       marital.click();
	       
	       Reporter.log("Clicked on Marital dropdown", true);
	       
	       Select married = new Select(marital);
	       
	       
	       
	       List<WebElement> Opt= married.getOptions();
	       
	       for(int i = 0; i<Opt.size(); i++)
	        	
	        {
	             	             
	            if(Opt.get(i).getText().contains("Married"))
	            	
	             {
	            	      
	                Opt.get(i).click();
	                
	                Reporter.log("Marital Status is selected ", true);
	                
	             }
	            
	         }
	               
	        Thread.sleep(3000);  
	       
	        WebElement religion=adp.getReligionDD();
	       
	        religion.click();
	        
	        Thread.sleep(3000);
	        
	        Select relig = new Select(religion);
	        
	        List<WebElement> Opts= relig.getOptions();
	        
             for(int i = 0; i<Opts.size(); i++)
	        	
	        {
	             	             
	            if(Opts.get(i).getText().equalsIgnoreCase("Hinduism"))
	            	
	             {
	            	      
	                Opts.get(i).click();
	                
	                Reporter.log("Religion is selected ", true);
	                
	             }
	            
	         }
             
             Thread.sleep(3000);
             

 	        WebElement nationality=adp.getNationalityDD();
 	       
 	       nationality.click();
 	        
 	        Thread.sleep(3000);
 	        
 	        Select nation = new Select(nationality);
 	        
 	        List<WebElement> Optns= nation.getOptions();
 	        
              for(int i = 0; i<Optns.size(); i++)
 	        	
 	        {
 	             	             
 	            if(Optns.get(i).getText().equalsIgnoreCase("Indian"))
 	            	
 	             {
 	            	      
 	                Optns.get(i).click();
 	                
 	                Reporter.log("Nationality is selected ", true);
 	                
 	             }
 	            
 	         }
              
              
  	        Thread.sleep(3000);
  	        
  	        adp.getStreettxt().sendKeys("uppal, Hyderabad");
  	        
              
              WebElement splcat=adp.getSpecialcatyDD();
    	       
            		  splcat.click();
    	        
    	        Select splcategory = new Select(splcat);
    	        
    	        List<WebElement> category= splcategory.getOptions();
    	        
                 for(int i = 0; i<category.size(); i++)
    	        	
    	        {
    	             	             
    	            if(category.get(i).getText().equalsIgnoreCase("VIP PERSON"))
    	            	
    	             {
    	            	      
    	            	category.get(i).click();
    	                
    	                Reporter.log("hwc category is selected ", true);
    	                
    	             }
    	            
    	         }
                 
                 Thread.sleep(3000);
                 
                 WebElement id=adp.getIdproofDD();
      	       
       		  id.click();
	        
	        Select idproof = new Select(id);
	        
	        List<WebElement> idopt= idproof.getOptions();
	        
            for(int i = 0; i<idopt.size(); i++)
	        	
	        {
	             	             
	            if(idopt.get(i).getText().equalsIgnoreCase("AADHAR CARD"))
	            	
	             {
	            	      
	            	idopt.get(i).click();
	                
	                Reporter.log("idproof is selected ", true);
	                
	                adp.getIdprooftxb().sendKeys("234412312345");
	             }
	            
	         }
            
            Thread.sleep(3000);
            
            WebElement referred=adp.getReferrefbyDD();
   	       
     		  referred.click();
	        
	        Select refdby = new Select(referred);
	        
	        List<WebElement> rfdOpts= refdby.getOptions();
	        
          for(int i = 0; i<rfdOpts.size(); i++)
	        	
	        {
	             	             
	            if(rfdOpts.get(i).getText().equalsIgnoreCase("Doctor"))
	            	
	             {
	            	      
	            	rfdOpts.get(i).click();
	                
	                Reporter.log("Referred by is selected ", true);
	                
	                adp.getReferredbytxb().sendKeys("Vikas");
	                
	             }
	            
	         }
          
          Thread.sleep(3000);
          

          wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ng-select[@placeholder='SELECT DOCTOR']"))));

          WebElement e= driver.findElement(By.xpath("//ng-select[@placeholder='SELECT DOCTOR']"));
          e.click();
          
	        Select doc = new Select(e);
	        
	        List<WebElement> doctors= doc.getOptions();
	        
        for(int i = 0; i<doctors.size(); i++)
	        	
	        {
	             	             
	            if(doctors.get(i).getText().equalsIgnoreCase("DR FARHANA"))
	            	
	             {
	            	      
	            	doctors.get(i).click();
	                
	                Reporter.log("Doctor is selected ", true);
	                
	             }
	            
	         }
        
        Thread.sleep(3000);
        


          

          
              
              
             
	        
	  
		
	}

}
