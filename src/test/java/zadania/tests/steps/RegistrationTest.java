package zadania.tests.steps;

import org.junit.Test;

import zadania.tests.common.BaseTest;
import zadania.tests.pages.MyAccountPage;
import zadania.tests.pages.MyStoreLoginFormPage;
import zadania.tests.pages.MyStoreLoginPage;
import zadania.tests.pages.StartPage;

public class RegistrationTest extends BaseTest {
	
	@Test
	public void accountRegistration() {
		
		String registrationEmail = "testabc1@abc.com";
		
		StartPage startPage = new StartPage(driver);

		MyStoreLoginPage myStoreLoginPage = startPage.clickSignInButton();
		myStoreLoginPage.setCreateAccountEmail(registrationEmail);
		
		MyStoreLoginFormPage myStoreLoginFormPage = myStoreLoginPage.clickSubitCreateButton();
		myStoreLoginFormPage.clickGenderRadioButton();
		myStoreLoginFormPage.setFirstName("Jan");
		myStoreLoginFormPage.setLastName("Kowalsky");
		myStoreLoginFormPage.checkEmail(registrationEmail);
		myStoreLoginFormPage.setPassword("asd123");
		myStoreLoginFormPage.setDaysDropDown();
		myStoreLoginFormPage.setMonthsDropDown();
		myStoreLoginFormPage.setYearsDropDown();
		myStoreLoginFormPage.setStreet("Automatyczna 1");
		myStoreLoginFormPage.setCity("Warsaw");
		myStoreLoginFormPage.setState();
		myStoreLoginFormPage.setPostCode("12345");
		myStoreLoginFormPage.setPhoneMobile("123456789");
		
		MyAccountPage myAccountPage = myStoreLoginFormPage.clickSubmitAccountButton();
		myAccountPage.checkAccountPage();
		
	}

}
