import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testClass {
	private String mobile;
	Mobile obj_mobile;
	
	@BeforeTest()
	public void initialize() {
		mobile=vslues.value();
		System.out.println("mobil value=="+mobile);
		 obj_mobile= new Mobile(mobile);
		
		
	}
	@Test
	public void testmethod() {
		System.out.println("hey i am in TESTNg met");
		obj_mobile.display();
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
