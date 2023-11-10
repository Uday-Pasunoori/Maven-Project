package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientPage {

	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Patients']")
	private WebElement Patientsearch;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
	private WebElement AddPatient;

	@FindBy(xpath = "//button[normalize-space()='Add Unidentified Patient']")
	private WebElement UnidentifiedPt;

	@FindBy(xpath = "//select[@class='form-control custom-select text-uppercase ng-touched ng-dirty ng-valid']")
	private WebElement Gender;

	@FindBy(xpath = "//input[@placeholder='Enter Birth Mark 1']")
	private WebElement Birthmark1;

	@FindBy(xpath = "//input[@placeholder='Enter Birth Mark 2']")
	private WebElement Birthmark2;

	@FindBy(xpath = "//input[@id='paying']")
	private WebElement Paymentcheckbox;

	@FindBy(xpath = "//select[@class='form-control ng-dirty ng-valid ng-touched']")
	private WebElement Paytype;

	@FindBy(xpath = "//input[@placeholder='Enter payment number']")
	private WebElement Paymentnumber;

	@FindBy(xpath = "//button[@class='btn btn-light btn-sm mr-1']")
	private WebElement Cancelbtn;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']//span[contains(text(),'Submit')]")
	private WebElement Submitbtn;

	public PatientPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getPatientSearch() {
		return Patientsearch;
	}

	public void setPatientSearch() {
		Patientsearch.click();
		;
	}

	public WebElement getAddpatient() {
		return AddPatient;
	}

	public void setAddpatient() {
		AddPatient.click();
	}

	public WebElement getUnidentified() {
		return UnidentifiedPt;
	}

	public void setUnidentified() {
		UnidentifiedPt.click();
	}

	public WebElement getgender() {
		return Gender;
	}

	public void setgender() {
		Gender.click();
	}

	public WebElement getbirthmark1() {
		return Birthmark1;
	}

	public void setbirthmark1(String text) {
		Birthmark1.sendKeys(text);
	}

	public WebElement getbirthmark2() {
		return Birthmark2;
	}

	public void setbirthmark2(String txt) {
		Birthmark2.sendKeys(txt);
		;
	}

	public WebElement getpaymentcheckbox() {
		return Paymentcheckbox;
	}

	public void setpaymentcheckbox() {
		Paymentcheckbox.click();
	}

	public WebElement getpaytypedd() {
		return Paytype;
	}

	public void setpaytypedd() {
		Paytype.click();
	}

	public WebElement getpaymentnumber() {
		return Paymentnumber;

	}

	public void setpaymentnumber(String text) {
		Paymentnumber.sendKeys(text);
		;
	}

	public WebElement getcancelbtn() {
		return Cancelbtn;

	}

	public void setcancelbtn() {
		Cancelbtn.click();

	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}

	public void setSubmitbtn() {
		Submitbtn.click();
	}

}
