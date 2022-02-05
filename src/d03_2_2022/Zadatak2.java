package d03_2_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.wikipedia.com");

		List<WebElement> lang = driver.findElements(By.xpath("//*[@id='www-wikipedia-org']/div[2]//a"));
		System.out.println(lang.size());
		driver.findElement(By.className("central-featured-lang"));
		for (int i = 0; i < lang.size(); i++) {
			js.executeScript("window.open(arguments[0])", lang.get(i));
		}

	}
}