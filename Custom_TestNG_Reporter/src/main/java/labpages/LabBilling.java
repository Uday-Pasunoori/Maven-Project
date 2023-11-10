package labpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabBilling {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='#/app/labs']")
	private WebElement LabModule;

	@FindBy(xpath = "//span[text()='Lab Billing']")
	private WebElement BillPage;

	@FindBy(xpath = "//div[text()='Enter Patient Name/mobile/Umr']")
	private WebElement PatientName;

	@FindBy(xpath = "(//div[@class='ng-input']//input)[1]")
	private WebElement Doctor;

	@FindBy(xpath = "(//div[@class='ng-input']//input)[2]")
	private WebElement LabNames;
	
	@FindBy(xpath = "//label[text()='Is Emergency']")
	private WebElement Emergency;

	@FindBy(xpath = "//select[@formcontrolname='payTypeId']")
	private WebElement Paytype;

	@FindBy(xpath = "(//input[@placeholder='Enter discount percentage'])[1]")
	private WebElement Discount;
	
	@FindBy(xpath = "//button[@id='submitLabBilling']")
	private WebElement SubmitBtn;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement CancelBtn;
	
	public LabBilling(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public WebElement getlabmodule() {
		return LabModule;
	}

	public void setlabmodule() {
		LabModule.click();
		
	}

	public WebElement getbillingPage() {
		return BillPage;
	}

	public void setbillingPage() {
		BillPage.click();
	}

	public WebElement getpatientName() {
		return PatientName;
	}

	public void setpatientName(String name) {
		PatientName.sendKeys(name);
	}

	public WebElement getdoctor() {
		return Doctor;
	}

	public void setdoctor(String doc) {
		Doctor.sendKeys(doc);
	}

	public WebElement getLabDropdown() {
		return LabNames;
	}

	public void setLabDropdown(String text) {
		LabNames.sendKeys(text);
	}

	public WebElement getemegencytoggle() {
		return Emergency;
	}

	public void setemegencytoggle() {
		Emergency.click();
		
	}

	public WebElement getpaytypeDD() {
		return Paytype;
	}

	public void setpaytypeDD() {
		Paytype.click();
	}

	public WebElement getdiscount() {
		return Discount;

	}

	public void setdiscount(String text) {
		Discount.sendKeys(text);
		;
	}

	public WebElement getsubmitBtn() {
		return SubmitBtn;

	}

	public void setsubmitBtn() {
		SubmitBtn.click();

	}

	public WebElement getcancelbtn() {
		return CancelBtn;
	}

	public void setcancelbtn() {
		CancelBtn.click();
	}

}
