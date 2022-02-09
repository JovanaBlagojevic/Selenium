package d07_02_2022_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022_pages.KatalonPage;
import d07_02_2022_pages.ProductPage;
import d07_02_2022_pages.ShopPage;

public class KatalonTest {
	WebDriver driver;
	WebDriverWait wait;
	private ShopPage sp;
	private ProductPage pp;
	private KatalonPage kp;

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sp = new ShopPage(driver);
		pp = new ProductPage(driver);
		kp = new KatalonPage(driver);
		driver.get("https://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		sp.getClick().click();
		Thread.sleep(500);
		sp.addToCart1().click();
		Thread.sleep(500);
		pp.buttonUp().click();
		Thread.sleep(600);
		pp.cart().click();
		Thread.sleep(500);
		kp.dugme().click();
		Thread.sleep(500);
		Assert.assertTrue(kp.quantity(), "You don't have enough items.");
		kp.delete().click();
		Assert.assertTrue(kp.emptyCart(), "Items are not deleted.");
		Thread.sleep(500);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}