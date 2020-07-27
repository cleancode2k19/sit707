package week2;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","/Users/bhanupriyajena/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtils util = new WebDriverUtils(driver);
		driver.navigate().to("https://wikipedia.org");
		util.takeScreenShot("Wikipedia_home_page");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#www-wikipedia-org> p > small:nth-child(2)")).click();
		util.takeScreenShot("WIKI_terms_of_use");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#footer-places-privacy > a")).click();
		util.takeScreenShot("WIKI_privacy");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
}
