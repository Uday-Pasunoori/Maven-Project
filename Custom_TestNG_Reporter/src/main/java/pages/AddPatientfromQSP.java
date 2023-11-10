package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


  public class AddPatientfromQSP {
	
 public WebDriver driver;
	
    @FindBy(xpath="//div[text()='Outpatients']") private WebElement Opmodule;
 	
    @FindBy(xpath="//*[@id=\"two-col-menu\"]/div/ul/li[1]/a") private WebElement Qsp;
    
    @FindBy(xpath="//input[@id='searchPatientInquickSchedule']") private WebElement searchfield;
	
	@FindBy(xpath="//button[text()=' Add New Patient ']") private WebElement Addnewptbtn;
	
	@FindBy(xpath="//select[@formcontrolname='salutation']") private WebElement saltndropdown;

	@FindBy(xpath="//input[@placeholder='Enter first name']") private WebElement fstNametxb;
	
	@FindBy(xpath="//input[@placeholder='Enter last name']") private WebElement lastNametxb;

	@FindBy(xpath="//input[@placeholder='AGE']") private WebElement Agetxt;

	@FindBy(xpath="(//input[@placeholder='ENTER MOBILE NUMBER'])[1]") private WebElement Mobtxtb;

	@FindBy(xpath="//input[@formcontrolname='streetAddress']") private WebElement Streettxt;

	@FindBy(xpath="//div[text()='Enter Doctor Name/Specialization']") private WebElement Doctdd;

	@FindBy(xpath="//select[@formcontrolname='visitTypeId']") private WebElement VisitTpdd;

	@FindBy(xpath="//select[@formcontrolname='payTypeId']") private WebElement payMentType;

	@FindBy(xpath="//select[@formcontrolname='paymentStatus']") private WebElement payMentsts;

	@FindBy(xpath="//button[text()='Reset']") private WebElement Resetbtn;

	@FindBy(xpath="//span[@id='submit']") private WebElement Submitbtn;
	
	@FindBy(xpath="//input[@formcontrolname='fatherOrHusband']") private WebElement fatherNM;
	
	@FindBy(xpath="//input[@formcontrolname='patientName']") private WebElement patientNametxtbox;

	@FindBy(xpath="//input[@formcontrolname='umrNo']") private WebElement umrNumber;
	
	@FindBy(xpath="//div[text()='Select']") private WebElement selectBtn;
	
	@FindBy(xpath="//span[text()='05:00 PM']") private WebElement vslot;

	@FindBy(xpath="//select[@formcontrolname='gender']") private WebElement genderDD;
	
	@FindBy(xpath="//select[@formcontrolname='maritalStatus']") private WebElement maritalDD; 
	
	@FindBy(xpath="//select[@formcontrolname='religion']") private WebElement religionDD;

	@FindBy(xpath="//select[@formcontrolname='nationality']") private WebElement nationalityDD;

	@FindBy(xpath="//input[@autocomplete='a42c84d717cb']") private WebElement stateDD;

	@FindBy(xpath="//input[@aria-owns='a20b9426db1e']") private WebElement cityDD;

	@FindBy(xpath="//select[@formcontrolname='hwcPatientId']") private WebElement specialcatyDD;

	@FindBy(xpath="//select[@formcontrolname='idProofId']") private WebElement idproofDD;

	@FindBy(xpath="//input[@formcontrolname='idProofValue']") private WebElement idprooftxb;

	@FindBy(xpath="//ng-select[@formcontrolname='patientReferredById']") private WebElement referrefbyDD;
	
	@FindBy(xpath="//input[@formcontrolname='referredByName']") private WebElement referredbytxb;
	
	@FindBy(xpath="(//i[@class='mdi mdi-plus'])[1]") private WebElement relationplus;
	
	@FindBy(xpath="//input[@formcontrolname='relationName']") private WebElement relativeName;

	@FindBy(xpath="//input[@formcontrolname='relativeMobile']") private WebElement relMobile;
	
	@FindBy(xpath="//select[@formcontrolname='relation']") private WebElement relationDD;
	
	@FindBy(xpath="//input[@formcontrolname='relativeOccupation']") private WebElement relOccupation;

	@FindBy(xpath="//input[@formcontrolname='realtiveEducation']") private WebElement relStudy;
	
	@FindBy(xpath="//select[@formcontrolname='appointmentType']") private WebElement appointmentTypeDD;
	
	@FindBy(xpath="(//i[@class='mdi mdi-plus'])[2]") private WebElement insurenceplus;
	
	@FindBy(xpath="//select[@formcontrolname='insuranceTypeId']") private WebElement insurancetypeDD;

	@FindBy(xpath="//select[@formcontrolname='insuranceCompanyId']") private WebElement insucompanyDD;
	
	@FindBy(xpath="//input[@formcontrolname='cardNo']") private WebElement insuCardno;
	
	@FindBy(xpath="//input[@formcontrolname='validity']") private WebElement validity;
	
	@FindBy(xpath="//td//div//h5") private WebElement patientData;
	
	@FindBy(xpath="//span[@class='mb-0 text-info']") private List<WebElement> activeStatus;
	
	@FindBy(xpath="//input[@formcontrolname='paymentNumber']") private WebElement payNumber;
	
	@FindBy(xpath="//a[@href='#/app/quick-schedule/bookApp']") private WebElement bookAppbtn;
	
	@FindBy(xpath="//input[@type='checkbox']") private WebElement Unidentified;
	
	public AddPatientfromQSP(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getopmodule() {
		return Opmodule;
	}
	
	public void setopmodule() {
		Opmodule.click();
	}


	public WebElement getqsp() {
		return Qsp;
	}
	
	public void setqsp() {
		Qsp.click();
	}
	

	public WebElement getunidentified() {
		return Unidentified;
	}
	
	public void setunidentified() {
		Unidentified.click();
	}
	
	public WebElement getbookaptbtn() {
		return bookAppbtn;
	}
	
	public void setbookaptbtn() {
		bookAppbtn.click();
	}
	
	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getPatientdata() {
		return patientData;
	}

	public void setSearchfield(String details) {
		searchfield.sendKeys(details);;
	}
	
	public List<WebElement> getActiveStatus() {
		return activeStatus;
	}
	
	

	public WebElement getAddnewptbtn() {
		return Addnewptbtn;
	}


	public void setAddnewptbtn(String addnewptbtn) {
		Addnewptbtn.sendKeys(addnewptbtn);;
	}
	
	public WebElement getPatienttxtbox() {
		return patientNametxtbox;
	}


	public void setPatienttxtbox(String patientname) {
		patientNametxtbox.sendKeys(patientname);;
	}
	
	public WebElement getUmrnumber() {
		return umrNumber;
	}


	public void setUmrnumber(String UMR) {
		umrNumber.sendKeys(UMR);;
	}


	public WebElement getSelectbtn() {
		return selectBtn;
	}


	public WebElement getSaltndropdown() {
		return saltndropdown;
	}


	public void clickOnSaltndropdown() {
		saltndropdown.click();
	}


	public WebElement getFstNametxb() {
		return fstNametxb;
	}


	public void setFstNametxb(String fstnametxb) {
		fstNametxb.sendKeys(fstnametxb);
	}


	public WebElement getLastNametxb() {
		return lastNametxb;
	}


	public void setLastNametxb(String lastnametxb) {
		lastNametxb.sendKeys(lastnametxb);
	}


	public WebElement getAgetxt() {
		return Agetxt;
	}


	public void setAgetxt(String agetxt) {
		Agetxt.sendKeys(agetxt);;
	}


	public WebElement getMobtxtb() {
		return Mobtxtb;
	}


	public void setMobtxtb(String mobtxtb) {
		Mobtxtb.sendKeys(mobtxtb);;
	}


	public WebElement getStreettxt() {
		return Streettxt;
	}


	public void setStreettxt(String streettxt) {
		Streettxt.sendKeys(streettxt);;
	}


	public WebElement getDoctdd() {
		return Doctdd;
	}


	public void clickonDoctdd() {
		Doctdd.click();
	}


	public WebElement getVisitTpdd() {
		return VisitTpdd;
	}


	public void clickOnVisitTpdd() {
		VisitTpdd.click();
	}


	public WebElement getPayMentType() {
		return payMentType;
	}


	public void clickOnPayMentType() {
		payMentType.click();
	}


	public WebElement getPayMentsts() {
		return payMentsts;
	}

	public WebElement getPaymentnumber() {
		return payNumber;
	}

	public void setPayMentsts() {
		payMentsts.click();
	}


	public WebElement getResetbtn() {
		return Resetbtn;
	}


	public void clickOnResetbtn() {
		Resetbtn.click();
	}


	public WebElement getSubmitbtn() {
		return Submitbtn;
	}


	public void clickOnSubmitbtn() {
		Submitbtn.click();
	}
	
	public WebElement getFatherName() {
		return fatherNM;
	}
	
	public void setFatherName(String fn) {
		fatherNM.sendKeys(fn);
	}
	
	public WebElement getVslot() {
		return vslot;
	}


	public void clickOnVpmslot() {
		vslot.click();
	}
	
	public WebElement getMaritalDD() {
		return maritalDD;
	}

	public void setMaritalDD() {
		maritalDD.click();
	}

	public WebElement getReligionDD() {
		return religionDD;
	}

	public void setReligionDD() {
		religionDD.click();
	}

	public WebElement getNationalityDD() {
		return nationalityDD;
	}

	public void setNationalityDD() {
		nationalityDD.click();
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public void setStateDD() {
		stateDD.click();
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public void setCityDD() {
		cityDD.click();
	}

	public WebElement getSpecialcatyDD() {
		return specialcatyDD;
	}

	public void setSpecialcatyDD() {
		specialcatyDD.click();
	}

	public WebElement getIdproofDD() {
		return idproofDD;
	}

	public void setIdproofDD() {
		idproofDD.click();
	}

	public WebElement getIdprooftxb() {
		return idprooftxb;
	}

	public void setIdprooftxb(String idproofnum) {
		idprooftxb.sendKeys(idproofnum);
	}

	public WebElement getReferrefbyDD() {
		return referrefbyDD;
	}

	public void setReferrefbyDD() {
		referrefbyDD.click();
	}

	public WebElement getReferredbytxb() {
		return referredbytxb;
	}

	public void setReferredbytxb(String referredbytxt) {
		referredbytxb.sendKeys(referredbytxt);;
	}
	
	public WebElement getRelationplus() {
		return relationplus;
	}

	public void setRelationplus() {
		relationplus.click();
	}


	public WebElement getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String Name) {
		relativeName.sendKeys(Name);
	}

	public WebElement getRelMobile() {
		return relMobile;
	}

	public void setRelMobile(String number) {
		relMobile.sendKeys(number);;
	}

	public WebElement getRelationDD() {
		return relationDD;
	}

	public void setRelationDD() {
		relationDD.click();;
	}

	public WebElement getRelOccupation() {
		return relOccupation;
	}

	public void setRelOccupation(String Occupation) {
		relOccupation.sendKeys(Occupation);;
	}

	public WebElement getRelStudy() {
		return relStudy;
	}

	public void setRelStudy(String relstudy) {
		relStudy.sendKeys(relstudy);;
	}

	public WebElement getAppointmentTypeDD() {
		return appointmentTypeDD;
	}

	public void setAppointmentTypeDD() {
		appointmentTypeDD.click();;
	}

	public WebElement getInsurenceplusbtn() {
		return insurenceplus;
	}

	public void setInsurenceplusbtn() {
		insurenceplus.click();;
	}

	public WebElement getInsurancetypeDD() {
		return insurancetypeDD;
	}

	public void setInsurancetypeDD() {
		insurancetypeDD.click();;
	}

	public WebElement getInsucompanyDD() {
		return insucompanyDD;
	}

	public void setInsucompanyDD() {
		insucompanyDD.click();;
	}

	public WebElement getInsuCardno() {
		return insuCardno;
	}

	public void setInsuCardno(String cardno) {
		insuCardno.sendKeys(cardno);;
	}

	public WebElement getValidity() {
		return validity;
	}

	public void setValidity() {
		validity.click();
	}
	
	public WebElement getGender() {
		return genderDD;
	}

	public void setGender() {
		genderDD.click();
	}
	
	


}
