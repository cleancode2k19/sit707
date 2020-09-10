package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderResultPage extends AbstractPage{

	public OrderResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getConfirmationPage() {
		return driver.findElement(By.tagName("h4")).getText();
	}

}
