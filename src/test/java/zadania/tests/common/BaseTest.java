package zadania.tests.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//abstract - klasa jest abstrakcyjna - nigdy nie jest inicjalizowana samodzielnie, jest jedynie dziedziczona
public abstract class BaseTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@Before	
	public void beforeEachTest() {
		
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		
		String headlessMode = System.getProperty("headless", "false");
		System.out.println("headlessMode = " + headlessMode);

		if (headlessMode.equals("true")) {
			ChromeOptions options = new ChromeOptions();	// uruchamianie bez interfejsu graficznego - bez rysowania GUI
			options.setHeadless(true);	
			this.driver = new ChromeDriver(options);
		} else {
			this.driver = new ChromeDriver();	// z GUI
		}
		this.wait = new WebDriverWait(this.driver,10);
	}
	
	
	@After
	public void afterEachTest() {
		this.driver.quit();		//.quit zamyka przeglądarkę - .close zamyka okno
	}
	


}
