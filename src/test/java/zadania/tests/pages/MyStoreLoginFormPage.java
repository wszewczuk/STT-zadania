package zadania.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyStoreLoginFormPage extends BasePage {
	
//	LOCATORS
	private By byGenderRadioButton= By.id("uniform-id_gender1");
	private By byFirstName= By.id("customer_firstname");
	private By byLastName= By.id("customer_lastname");
	
	private By byEmail= By.id("email");
	private By byPassword = By.id("passwd");
	
	private By byDays= By.id("uniform-days");
	private By byDaysValue = By.xpath("//*[@id='days']/option[15]");
	private By byMonths= By.id("uniform-months");
	private By byMonthsValue = By.xpath("//*[@id='months']/option[2]");
	private By byYears= By.id("uniform-years");
	private By byYearsValue = By.xpath("//*[@id='years']/option[30]");
	
	private By byStreet = By.id("address1");
	private By byCity = By.id("city");
	private By byState = By.id("uniform-id_state");
	private By byStateValue = By.xpath("//*[@id='id_state']/option[7]");
	private By byPostCode = By.id("postcode");
	private By byPhoneMobile = By.id("phone_mobile");
	
	private By bySubmitAccountButton = By.id("submitAccount");
	
//	CONSTRUCTORS
	public MyStoreLoginFormPage(WebDriver driver) {
		super(driver);
	}
	
//	METHODS
	public void clickGenderRadioButton() {
		click(byGenderRadioButton);
	}
	public void setFirstName (String value) {
		setTextField(byFirstName,value);
	}
	public void setLastName(String value) {
		setTextField(byLastName,value);
	}
	
	public void checkEmail (String value) {
		checkTextFieldValue(byEmail, value);
	}
	public void setPassword(String value) {
		setTextField(byPassword,value);
	}
	
	public void setDaysDropDown() {
		selectFromDropDown(byDays, byDaysValue);
	}
	public void setMonthsDropDown() {
		selectFromDropDown(byMonths, byMonthsValue);
	}
	public void setYearsDropDown() {
		selectFromDropDown(byYears, byYearsValue);
	}
	
	public void setStreet (String value) {
		setTextField(byStreet,value);
	}
	public void setCity (String value) {
		setTextField(byCity,value);
	}
	public void setState () {
		selectFromDropDown(byState, byStateValue);
	}
	public void setPostCode (String value) {
		setTextField(byPostCode,value);
	}
	public void setPhoneMobile (String value) {
		setTextField(byPhoneMobile,value);
	}


	public MyAccountPage clickSubmitAccountButton() {
		click(bySubmitAccountButton);
		checkTitle("My account");
		return new MyAccountPage(driver);
	}
	
	
}
