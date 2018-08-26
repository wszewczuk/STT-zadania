package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressesPage extends BasePage {
	
	private By byFirstDress = By.xpath("//*[@id='center_column']/ul/li[1]");
	private By byFirstIteamWishlist = By.xpath("//*[@id='center_column']/ul/li[1]//a[@class='addToWishlist wishlistProd_3']");
	private By byAccountPage = By.xpath("//*[@id='header']//*[@class='account']");

	public DressesPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickAddFirstDrissToWishlist() {
		WebElement dress = driver.findElement(byFirstDress);
		WebElement whishlist = driver.findElement(byFirstIteamWishlist);
		
		Actions action = new Actions(driver);
		action.moveToElement(dress);
		action.moveToElement(whishlist);
		action.click();
		action.perform();
	}
	
	public MyAccountPage clickAccountPage() {
		click(byAccountPage);
		checkTitle("My account");
		return new MyAccountPage(driver);
	}


}
