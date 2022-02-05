package d03_2_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.tagName("body"));
		js.executeScript("arguments[0].style='background:' + arguments[1]", element, "black");
	}
}
