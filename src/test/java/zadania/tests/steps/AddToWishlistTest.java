package zadania.tests.steps;

import org.junit.Before;
import org.junit.Test;

import zadania.tests.common.BaseTest;
import zadania.tests.pages.DressesPage;
import zadania.tests.pages.MyAccountPage;
import zadania.tests.pages.MyStoreLoginPage;
import zadania.tests.pages.StartPage;
import zadania.tests.pages.WishListPage;

public class AddToWishlistTest extends BaseTest {
	
	@Before
	public void testSetUp() {
		String loginEmail = "testabc@abc.com";
		String loginPassword = "asd123";
		
		StartPage startPage = new StartPage(driver);
		
		MyStoreLoginPage myStoreLoginPage = startPage.clickSignInButton();
		myStoreLoginPage.setLoginEmail(loginEmail);
		myStoreLoginPage.setLoginPassword(loginPassword);
		
		MyAccountPage myAccountPage = myStoreLoginPage.clickLoginButton();
		myAccountPage.checkAccountPage();
	}
	
	@Test
	public void addToWishList() {
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		
		DressesPage dressesPage = myAccountPage.clickDressesButton();
		dressesPage.clickAddFirstDrissToWishlist();
		
		myAccountPage = dressesPage.clickAccountPage();
		WishListPage wishListPage = myAccountPage.clickWishList();
		wishListPage.checkWishListDelete();
	}

}
