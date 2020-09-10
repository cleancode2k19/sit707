package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import week3.HomePage;

public class AbstractWebDriverTest {
	protected WebDriver driver;
	protected HomePage onHomePage;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/bhanupriyajena/Downloads/chromedriver");
		driver = new ChromeDriver();
		onHomePage = new HomePage(driver);
		System.out.println("Before in abstract");
	}
	@After
	public void shutDown() {
		driver.close();
		System.out.println("After in abstract");
		
	}
	

}
