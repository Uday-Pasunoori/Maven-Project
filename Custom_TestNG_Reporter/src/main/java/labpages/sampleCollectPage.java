package labpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sampleCollectPage {

	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"two-col-menu\"]/div/div/ul/li[3]/a")
	private WebElement Samplecollect;
	
	@FindBy(xpath="//*[@id=\"content-page\"]/ng-component/ng-component/div/div/div/div/div[3]/div/div/table/tbody/tr/td[7]/button[1]") 
	private WebElement selectButton;
	
	@FindBy(xpath="//*[@id=\"sampleCollectCheck0\"]")
	private WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"content-page\"]/ng-component/ng-component/div[2]/div/div/div/div[2]/div/div/button")
	private WebElement finalButtton;
	
	public sampleCollectPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSamplecollect() {
		return Samplecollect;
	}

	public void setSamplecollect() {
		Samplecollect.click();
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public void setSelectButton() {
		selectButton.click();
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public void setCheckBox() {
		checkBox.click();
	}

	public WebElement getFinalButtton() {
		return finalButtton;
	}

	public void setFinalButtton() {
		finalButtton.click();
	}
	
	
	
}
