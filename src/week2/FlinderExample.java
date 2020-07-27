package week2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FlinderExample {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bhanupriyajena/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtils util = new WebDriverUtils(driver);
		driver.navigate().to("http://map.google.com");
		
		driver.findElement(By.tagName("input")).sendKeys("Flinder street Station");
		driver.findElement(By.cssSelector("button.searchbox-searchbutton")).click();
		Thread.sleep(2000);
		util.takeScreenShot("Flinder St Station");
		
		driver.findElement(By.cssSelector("a.gsst_a")).click();
		driver.findElement(By.tagName("input")).sendKeys("Federation Square");
		driver.findElement(By.cssSelector("button.searchbox-searchbutton")).click();
		Thread.sleep(2000);
		util.takeScreenShot("Federation Square");
		
		driver.findElement(By.cssSelector("a.gsst_a")).click();
		driver.findElement(By.tagName("input")).sendKeys("Great Ocean Road");
		driver.findElement(By.cssSelector("button.searchbox-searchbutton")).click();
		Thread.sleep(2000);
		util.takeScreenShot("Great Ocean Road");
		
	}

}
