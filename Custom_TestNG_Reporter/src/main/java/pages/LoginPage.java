package pages;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
		
	public class LoginPage {
		
		
	 	WebDriver driver;
	 	

		@FindBy(xpath="//input[@placeholder='Enter mobile number or email address']") private WebElement email;
		
		@FindBy(xpath="//input[@placeholder='Enter password']") private WebElement password;
		
		@FindBy(xpath="//select[@class='form-control ng-untouched ng-pristine ng-valid']") private WebElement locationDD;
		
		@FindBy(xpath="//span[text()='Sign In']") private WebElement signinBtn;
		
		@FindBy(xpath="//span[text()='Logout']") WebElement Logout;
		
//		@FindBy(xpath="//img[@alt='Vikas Kuchimanchi']") WebElement Profile;

		
		public LoginPage (WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
				
		public WebElement getEmail() {
			return email;
		}

		public void setEmail(String un) {
			email.sendKeys(un);
		}

		public WebElement getPasswod() {
			return password;
		}

		public void setPassword(String pwd) {
			password.sendKeys(pwd);
		}
		
		public WebElement getLocation() {
			return locationDD;
		}

		public void setLocation() {
			locationDD.click();
		}
		
		
		public void clickSigninbtn()
		{
			signinBtn.click();
		}
		/*
		 * public WebElement getProfile() {
		 *  return Profile;
		 * 
		 * }
		 */
		
		
		public WebElement getLogout() {
			return Logout;
		
		}
		public void LoginToApp(String un, String pwd) {
			email.sendKeys(un);
			password.sendKeys(pwd);
			signinBtn.click();
//			Logout.click();
//			Profile.click();
		}
		

	}



