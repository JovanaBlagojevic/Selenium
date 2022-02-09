package d07_02_2022_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	WebDriverWait wait;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement buttonUp() {
		return driver.findElement(By.className("quantity-up"));
	}

	public WebElement buttonDown() {
		return driver.findElement(By.className("quantity-down"));
	}

	public WebElement cart() {
		return driver.findElement(By.xpath("//*[@id=\"product-54\"]/div[2]/form/button"));
	}

	public void message() {

		wait.until(ExpectedConditions
				.numberOfElementsToBe(By.xpath("//*[contains(text(), 'have been added to your cart']"), 2));
	}

	public WebElement viewCart() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));

	}
}