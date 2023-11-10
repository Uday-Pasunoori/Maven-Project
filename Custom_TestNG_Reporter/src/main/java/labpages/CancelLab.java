package labpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelLab {

	public WebDriver driver;

	@FindBy(xpath = "//a[@href='#/app/labs/labs-cancellation']")
	private WebElement Canceltab;

	@FindBy(xpath = "//table[@class='table table-sm']")
	private WebElement Table;

	@FindBy(xpath = "//td//h5")
	private WebElement TableData;

	@FindBy(xpath = "//button[@class='btn mt-1 btn-sm btn-outline-primary']")
	private WebElement SelectButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement CancelBtn;
	
	@FindBy(xpath = "//button[text()='Yes! Confirm']")
	private WebElement Yesbtn;
	
	@FindBy(xpath = "//button[text()='No! Cancel']")
	private WebElement Nobtn;
	
	
	public CancelLab(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcanceltab() {
		return Canceltab;
	}

	public void setcanceltab() {
		Canceltab.click();
		
	}

	public WebElement getTable() {
		return Table;
	}

	public void setTable() {
		Table.click();
	}
	
	public WebElement getTabledata() {
		return TableData;
	}

	

	public WebElement getselectbtn() {
		return SelectButton;
	}

	public void setselectbutton() {
		SelectButton.click();
	}
	
	public WebElement gettable()
	{
		return Table;
	}

	public void settable() {
		Table.click();
	}
	
	public WebElement getcancelbtn()
	{
		return CancelBtn;
	}

	public void setcancelbtn() {
		CancelBtn.click();
	}
	
	
	public WebElement getYesBtn() {
		return Yesbtn;
	}

	

	public WebElement getNoBtn() {
		return Nobtn;
	}

	public void setsNoBtn() {
		Nobtn.click();
	}
	

}
