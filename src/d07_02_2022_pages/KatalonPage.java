package d07_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KatalonPage {
	WebDriver driver;
	WebDriverWait wait;

	public KatalonPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean quantity() {
		try {
			driver.findElement(By.xpath("//*[@value='2']"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public WebElement dugme() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));
	}

	public WebElement delete() {
		return driver.findElement(By.xpath("//*[@id='post-8']/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}

	public boolean emptyCart() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("cart-empty")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
