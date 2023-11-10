package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class google_search extends BaseTest {
	WebDriver driver;
	
	public google_search(WebDriver driver){
		this.driver = driver;
	}
	
	private WebElement element;
	
	public void search() {
		element = driver.findElement(By.name("q"));
		//new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("Wells Fargo");
        element.sendKeys(Keys.ENTER);
        		
	}
	
}
