package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public OrderPage ClickOnOrder() {
		System.out.println("Home Page: Click on order clicked");
		WebElement element  = driver.findElement(By.cssSelector("a#nav-orders.nav-a.nav-a-2"));
		element.click();
		return new OrderPage(driver);
	}

}
