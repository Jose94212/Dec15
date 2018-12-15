import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testClass {
	@Test
	public void testmethod() {
		System.out.println("hey i am in TESTNg met");
	}
	@Test
	public void testmethod2() {
		System.out.println("in testmethod 2");
	}
	@Test
	public void testSeleniumDriver() {
		System.setProperty("webdriver.gecko.driver", "/home/jose/Downloads/Selenium/geckodriver-v0.21.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.close();
	}
}
