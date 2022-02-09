package d07_02_2022_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022_pages.FormPage;

public class FormTest {

	WebDriver driver;
	private FormPage fp;

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		fp = new FormPage(driver);
		driver.get("file:///C:/Users/Korisnik/Downloads/form.html");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		fp.getFirstName().sendKeys("Jovana Blagojevic");
		Thread.sleep(500);
		fp.getGender("female").click();
		Thread.sleep(500);
		fp.getDateOfBirth().sendKeys("20.10.1996.");
		Thread.sleep(500);
		fp.getEmail().sendKeys("jovanablagojevic996@outlook.com");
		Thread.sleep(500);
		fp.getRole("QA");
		Thread.sleep(500);
		fp.getWays("read_books").click();
		Thread.sleep(500);
		fp.getComment().sendKeys("No comment");
		Thread.sleep(500);
		fp.submit().click();
		Assert.assertEquals(fp.infoIsSaved(), "Didn't save/");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}