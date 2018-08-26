package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyStoreLoginPage extends BasePage {
	
	private By byCreateAccountEmailValue = By.id("email_create");
	private By bySubitCreateButton = By.id("SubmitCreate");
	private By byLoginEmail = By.id("email");
	private By byLoginPassword = By.id("passwd");
	private By byLoginButton = By.id("SubmitLogin");
	
	public MyStoreLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void setCreateAccountEmail (String value) {
		setTextField(byCreateAccountEmailValue,value);
	}
	
	public MyStoreLoginFormPage clickSubitCreateButton() {
		click(bySubitCreateButton);
//		checkTitle("My Store");
		return new MyStoreLoginFormPage(driver);
	}
	
	public void setLoginEmail (String value) {
		setTextField(byLoginEmail,value);
	}
	
	public void setLoginPassword (String value) {
		setTextField(byLoginPassword,value);
	}
	
	public MyAccountPage clickLoginButton() {
		click(byLoginButton);
		checkTitle("My account");
		return new MyAccountPage(driver);
	}

}
