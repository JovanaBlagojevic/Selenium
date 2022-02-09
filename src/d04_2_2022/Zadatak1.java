package d04_2_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {
	WebDriver driver;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void searchTest() throws InterruptedException {

		driver.get("https://www.kupujemprodajem.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("kpBoxCloseButton")));
		driver.findElement(By.className("kpBoxCloseButton")).click();

		driver.findElement(By.name("data[keywords]")).sendKeys("Iphone");
		driver.findElement(By.name("data[keywords]")).sendKeys(Keys.ENTER);

		List<WebElement> brojStrana = driver.findElements(By.className("pagesList"));

		// Assert.assertEquals(brojStrana.size(), 2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'orderSecondSelection\']/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[1]/div[1]/div[1]/form[3]/div[3]/div/div/div[4]/div/div/div/div[10]/div/div[2]/div/div[2]/div/div[1]"))
				.click();
		driver.findElement(By.className("secondarySearchButton")).click();

		List<WebElement> cena = driver.findElements(By.className("adPrice"));
		String[] delovi = new String[30];
		String[] valuta = new String[30];
		double[] price = new double[30];
		for (int i = 0; i < cena.size(); i++) {
			delovi[i] = cena.get(i).getText();

		}

		for (int i = 0; i < delovi.length; i++) {

			delovi[i] = delovi[i].replace(",", ".");
			System.out.println(delovi[i]);
		}

		for (int i = 0; i < delovi.length; i++) {

			String string = delovi[i];
			String[] parts = string.split(" ");
			price[i] = Double.parseDouble(parts[0]);
			valuta[i] = parts[1];
		}

		for (int i = 0; i < valuta.length; i++) {
			if (valuta[i].equals("€")) {
				price[i] = price[i] * 117;
			}
		}
		boolean vece = true;
		for (int i = 0; i < price.length - 1; i++) {
			if (price[i] <= price[i + 1]) {
				vece = true;
			} else {
				vece = false;
			}
			Assert.assertEquals(vece, true, "Greska.");
		}

	}

	@AfterMethod
	public void closeup() {
		driver.quit();
	}

}

