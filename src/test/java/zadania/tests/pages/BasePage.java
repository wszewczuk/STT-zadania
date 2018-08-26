package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//	abstract - klasa jest abstrakcyjna - nigdy nie jest inicjalizowana samodzielnie, jest jedynie dziedziczona

public abstract class BasePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
//	na klasach, które extendują BasePage muszą być konstruktury z typem parametru w superklasie)
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	
	
	protected void click(By location) {
		wait.until(ExpectedConditions.elementToBeClickable(location));
		driver.findElement(location).click();
	}
	
	protected void checkTitle (String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	protected void setTextField(By location, String value){
		wait.until(ExpectedConditions.elementToBeClickable(location));
		WebElement field = driver.findElement(location);
		field.clear();
		field.sendKeys(value);
//		field.sendKeys(Keys.RETURN);
	}
	
	protected void checkTextFieldValue(By location, String value){
		driver.findElement(location);
		wait.until(ExpectedConditions.textToBePresentInElementValue(location, value));
	}
	
	protected void checkPresentedText(By location) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(location));
	}
	
	protected void selectFromDropDown(By dropDownLocation, By dropDownValue) {
		click(dropDownLocation);
		click(dropDownValue);
	}
	
	
}
