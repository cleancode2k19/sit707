package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import week3.OrderPage;
import week3.OrderResultPage;

public class OrderMessageTest extends AbstractWebDriverTest{
	@Before
	public void testSetup() {
		onHomePage.navigateToWebApp();
		System.out.println("before in test");
	}
	@Test
	public void shouldSendOrderMessage() {
		OrderPage onOrderpage = onHomePage.ClickOnOrder();
		OrderResultPage onResultPage = onOrderpage.fillFormWithData().submitForm();
		Assert.assertTrue(onResultPage.getConfirmationPage().contains("There was a problem"));
	}

}
