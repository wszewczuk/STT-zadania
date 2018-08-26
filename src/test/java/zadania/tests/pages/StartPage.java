package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class StartPage extends BasePage {
	
	private By bySignInButton = By.cssSelector("a.login");
	private String pageAddress = "http://automationpractice.com/index.php";
	
	public StartPage(WebDriver driver) {
		super(driver);
		openPage();
	}
			
	public void openPage() {
		driver.get(pageAddress);
		checkTitle("My Store");
	}
	
	public MyStoreLoginPage clickSignInButton() {
		click(bySignInButton);
		checkTitle("My Store");
		return new MyStoreLoginPage(driver);
	}

}
