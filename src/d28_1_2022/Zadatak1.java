package d28_1_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s.bootsnipp.com/iframe/WaXlr");
		List<WebElement> stars = driver.findElements(By.className("btnrating"));
		for (int i = 0; i < stars.size(); i++) {
			System.out.println(stars.get(i).getText());
		}
		for (int i = 0; i < stars.size(); i++) {
			stars.get(i).click();
			Thread.sleep(1000);
			stars.get(i).click();
		}
		driver.close();
	}

}
