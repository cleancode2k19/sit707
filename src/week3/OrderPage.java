package week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends AbstractPage{

	public OrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public OrderPage fillFormWithData() {
		System.out.println("Order Page: fillFormWithData called");
		driver.findElement(By.name("email")).sendKeys("test mail");
		return new OrderPage(driver);
		
	}
	public OrderResultPage submitForm() {
		System.out.println("Order Page: Submit form called");
		driver.findElement(By.id("continue")).click();
		return new OrderResultPage(driver);
		
	}

}
