package uitests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.PatientPage;
import utils.BaseTest;

public class Add_Unidentified_patient extends BaseTest {

	@Test
	public void unidentified() throws InterruptedException {

		LoginTest lt = new LoginTest();
		lt.loginMethod();

		Thread.sleep(5000);

		PatientPage pp = new PatientPage(driver);

		// click on the patient search
		pp.getPatientSearch().click();
		Reporter.log("Clicked on patient search button ", true);

		Thread.sleep(2000);
		// click on the add patient button
		pp.getAddpatient().click();
		Reporter.log("Clicked on add patient ", true);

		Thread.sleep(2000);
		// click on the unidentified patient
		pp.getUnidentified().click();
		Reporter.log("Clicked on unidentified patient", true);

		Thread.sleep(2000);
		// select gender
		pp.getgender().click();
		Reporter.log("Clicked gender dropdown", true);

		Thread.sleep(2000);
		// enter birth mark 1
		pp.getbirthmark1().sendKeys("A mole on the nose");
		Reporter.log("birth mark 1 entered", true);

		Thread.sleep(2000);
		// enter birth mark 2
		pp.getbirthmark2().sendKeys("a mole on the left hand");
		Reporter.log("birth mark 2 entered", true);

		Thread.sleep(2000);
		// select payment check box
		pp.getpaymentcheckbox().click();
		Reporter.log("Clicked on payment check box", true);

		Thread.sleep(2000);
		// select pay type
		pp.getpaytypedd().click();
		Reporter.log("clicked on paytype dropdown", true);

		Thread.sleep(2000);
		// click on submit button
		pp.getSubmitbtn().click();
		Reporter.log("clicked on submit button", true);

	}

}
