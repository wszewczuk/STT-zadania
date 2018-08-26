package zadania.tests.steps;

import org.junit.Test;

import zadania.tests.common.BaseTest;
import zadania.tests.pages.MyAccountPage;
import zadania.tests.pages.MyStoreLoginPage;
import zadania.tests.pages.StartPage;

public class LogInTest extends BaseTest {
	
	@Test
	public void accountVerification() {
		
		String loginEmail = "testabc@abc.com";
		String loginPassword = "asd123";
		
		StartPage startPage = new StartPage(driver);
		
		MyStoreLoginPage myStoreLoginPage = startPage.clickSignInButton();
		myStoreLoginPage.setLoginEmail(loginEmail);
		myStoreLoginPage.setLoginPassword(loginPassword);
		
		MyAccountPage myAccountPage = myStoreLoginPage.clickLoginButton();
		myAccountPage.checkAccountPage();

	}
}
