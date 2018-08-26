package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishListPage extends BasePage {
	
	private By byWishListDelete = By.xpath("//*[@id='block-history']//*[@class='wishlist_delete']");

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
	public void checkWishListDelete() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byWishListDelete));
	}
	

}
