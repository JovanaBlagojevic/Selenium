package d01_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		driver.manage().window().maximize();

		driver.findElement(By.className("udlite-btn-white-outline")).click();

		wait.until(ExpectedConditions.attributeContains(By.id("udemy"), "style", "overflow: hidden"));

		System.out.println("Dijalog se prikazao.");
	}

}
