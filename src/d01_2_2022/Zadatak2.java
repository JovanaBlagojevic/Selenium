package d01_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://videojs.com/city");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='vjs_video_3']/button")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='vjs_video_3']/button")));

		System.out.println("Video je pusten.");

	}

}
