package week2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class WebAppChkSel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bhanupriyajena/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("div.download-button.webdriver")).click();
		List<WebElement> contents = driver.findElements(By.cssSelector("th"));
		for(int i=0;i<contents.size();i++) {
			WebElement temp=contents.get(i);
			System.out.println("Next to the Tag, we have found:"+temp.getText());
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
