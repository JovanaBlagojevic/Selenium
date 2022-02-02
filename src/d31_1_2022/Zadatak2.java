package d31_1_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://geodata.solutions/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		Select dropdown = new Select(driver.findElement(By.id("countryId")));
		dropdown.selectByVisibleText("Algeria");

		Select dropdown1 = new Select(driver.findElement(By.id("stateId")));
		dropdown1.selectByVisibleText("Biskra");

		Select dropdown2 = new Select(driver.findElement(By.id("cityId")));
		dropdown2.selectByVisibleText("Tolga");

	}

}
