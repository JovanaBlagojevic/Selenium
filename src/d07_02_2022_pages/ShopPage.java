package d07_02_2022_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
	WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClick() {
		return driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[5]"));
	}

	public WebElement addToCart1() {
		return driver.findElement(By.xpath("//*[@id='main']/div[2]/ul/li[1]/div/a[1]"));
	}

}
