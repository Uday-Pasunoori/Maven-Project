package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProviderSchedulerPage {
	
	public WebDriver driver;
	


	@FindBy(xpath="//div[text()='Outpatients']") private WebElement Opmodule;
 	
    @FindBy(xpath="//span[text()='Doctor Scheduler']") private WebElement doctorschdl;
    
    @FindBy(xpath="//ng-select[@formcontrolname='providerId']") private WebElement doctorDD;
    
    @FindBy(xpath="//ng-dropdown-panel[contains(@class, 'ng-dropdown-panel')]//div[@class='media-body']//h5") private WebElement ddList;

	
	public ProviderSchedulerPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	

	
		public WebElement getOpmodule() {
		return Opmodule;
	}


	public WebElement getDoctorschdl() {
		return doctorschdl;
	}
	
	public WebElement getddlist() {
		return ddList;
	}



	public void setDoctorschdl() {
		doctorschdl.click();
	}



	public WebElement getDoctorDD() {
		return doctorDD;
	}



	public void setDoctorDD() {
		doctorDD.click();
	}



}
