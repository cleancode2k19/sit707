package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillAndSubmitForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bhanupriyajena/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("javascript closure");
		//driver.findElement(By.name("btnK")).click();
		//driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
