package week4;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class randomDataTest {
	WebDriver driver;
		public static String randomStringWithNumber(int length) {
			final String data = "0123456789abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();
			StringBuilder sb = new StringBuilder(length);
			for(int i=0;i<length; i++) {
				sb.append(data.charAt(random.nextInt(data.length())));
			}
			return sb.toString();
			
		}
		public static String randomString(int length) {
			final String data = "abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();
			StringBuilder sb = new StringBuilder(length);
			for(int i=0;i<length; i++) {
				sb.append(data.charAt(random.nextInt(data.length())));
			}
			return sb.toString();
			
		}
		public static String randomEmail() {
			int length = 4;
			String name = "0123456789abcdefghijklmnopqrstuvwxyz";
			String firstDomain = "0123456789abcdefghijklmnopqrstuvwxyz";
			String secondDomain = "0123456789abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();
			StringBuilder sb = new StringBuilder(length);
			String email = new String();
			for(int i=0;i<length;i++) {
				sb.append(name.charAt(random.nextInt(name.length())));
			}
			email += sb;
			sb = new StringBuilder(length);
			for(int i=0;i<length;i++) {
				sb.append(firstDomain.charAt(random.nextInt(firstDomain.length())));
			}
			email += "@"+sb;
			sb = new StringBuilder(length);
			for(int i=0;i<length;i++) {
				sb.append(secondDomain.charAt(random.nextInt(secondDomain.length())));
			}
			email += "."+sb;
			return email;
			
		}
		public static int randomNumber(int maxValue) {
			Random random = new Random();
			return 1000+random.nextInt(maxValue);
			
		}
		public static String timeStamp() {
			Date date = new Date();
			return new Timestamp(date.getTime()).toString();
			
		}
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "/Users/bhanupriyajena/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://www.bunnings.com.au/register");
		}
		public void shutDown() {
			driver.close();
		}
		public void shouldBeAbleToSubmitFormWithRandomData() {
			driver.findElement(By.id("body_1_RegistrationDetailsCtrl_firstname")).sendKeys(randomString(10));
			driver.findElement(By.id("body_1_RegistrationDetailsCtrl_lastname")).sendKeys(randomString(10));
			driver.findElement(By.id("body_1_RegistrationDetailsCtrl_postcode")).sendKeys(String.valueOf(randomNumber(5000)));
			driver.findElement(By.id("body_1_RegistrationDetailsCtrl_email")).sendKeys(randomEmail());
			String randomPassword = randomStringWithNumber(8);
			driver.findElement(By.id("body_1_PasswordCtrl_password")).sendKeys(randomPassword);
			driver.findElement(By.id("body_1_PasswordCtrl_confirmpassword")).sendKeys(randomPassword);
			
			WebElement termsCheckBox = driver.findElement(By.id("body_1_tnc"));
			termsCheckBox.click();

			WebElement promotionCheckBox = driver.findElement(By.id("body_1_promotion"));
			promotionCheckBox.click();
			
			driver.findElement(By.id("RegisterButton")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("register"));
		}
			
	}


