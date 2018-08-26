package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

//	LOCATORS
	private By byAccountPage = By.xpath("//h1[.='My account']");
	private By byDressesButton = By.xpath("(//*[@id=\"block_top_menu\"]//a[@title=\"Dresses\"])[2]");
	private By byClickWishButton = By.xpath("//*[@title='My wishlists']");
	
//	CONSTRUCTORS
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
//	METHODS
	public void checkAccountPage () {
		checkPresentedText(byAccountPage);
	}
	
	public DressesPage clickDressesButton() {
		click(byDressesButton);
		checkTitle("Dresses");
		return new DressesPage(driver);
	}
	
	public WishListPage clickWishList() {
		click(byClickWishButton);
		checkTitle("My Store");
		return new WishListPage(driver);
	}
	
}
