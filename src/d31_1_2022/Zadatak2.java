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
		boolean hasState;
		boolean hasCity;

		Select dropdown = new Select(driver.findElement(By.id("countryId")));
		dropdown.selectByVisibleText("Algeria");

		try {
			Select dropdown1 = new Select(driver.findElement(By.id("stateId")));
			dropdown.selectByVisibleText("AK");
			hasState = true;
		} catch (Exception e) {
			hasState = false;
		}
		if (hasState) {
			 Select dropdown1 = new Select(driver.findElement(By.id("stateId")));
			System.out.println("Country has a state.");
		} else {
			System.out.println("Country don't have a state.");
		}

		try {
			Select dropdown2 = new Select(driver.findElement(By.id("cityId")));
			dropdown.selectByVisibleText("Fairbanks");
			hasCity = true;
		} catch (Exception e) {
			hasCity = false;
		}

		if (hasCity) {
			Select dropdown1 = new Select(driver.findElement(By.id("stateId")));
			System.out.println("Country has a city.");
		} else {
			System.out.println("Country don't have a city.");
		}
	}

}
