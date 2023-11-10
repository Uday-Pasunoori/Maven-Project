package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibs {
	
public String getPageTitle()
	
	{
		String pageTitle =BaseTest.driver.getTitle();
		
		return pageTitle;
		
	}
	public void waitForPageTitle(String title)
	
	{
		
	WebDriverWait wait= new WebDriverWait(BaseTest.driver, 20);
	
	wait.until(ExpectedConditions.titleContains(title));
	
	}
	
	public void selectOption(WebElement element, String text)
	
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	public void selectOption(String value, WebElement element)
	{
		Select sel = new Select(element);
		
		sel.selectByValue(value);
	}
	public void selectOption(WebElement element, int index)
	
	{
		Select sel = new Select(element);
		
		sel.selectByIndex(index);
		
	}
	public void mouseHover(WebElement element)
	
	{
		Actions ac = new Actions(BaseTest.driver);
		
		ac.moveToElement(element).perform();
		
	}	
		public void verify(String actualTitle, String expectedTitle, String page)
		
		{
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				
			{
				
				System.out.println(page+" is Displayed, PASS");
				
			}
			
			else
				
			{
				
				System.out.println(page+" is not Displayed, FAIL");
				
			}
			
		}
			public void rightClick(WebElement element)
			{
				
				Actions ac=new Actions(BaseTest.driver);
				
				ac.contextClick(element).perform();
				
			}
			
			public void switchToFrame(int index) 
			{
				
				BaseTest.driver.switchTo().frame(index);
				
			}
		      public void switchToframe(String value) 
		      {
		    	  
		    	  BaseTest.driver.switchTo().frame(value);
		    	  
		      }
		      
			public void switchToFrame(WebElement element) 
			{
				
				BaseTest.driver.switchTo().frame(element);
				
			}
			
			public void dragAndDrop(WebElement source, WebElement target)
			
			{
				Actions ac=new Actions(BaseTest.driver);
				
				ac.dragAndDrop(source, target).perform();
				
			}

			

	

}
