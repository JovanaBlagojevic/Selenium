package d28_1_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		for (int i = 0; i < 5; i++) {

			driver.findElement(By.xpath("//*[@type = 'button']")).click();

			driver.findElement(By.xpath("//*[@name ='name']")).sendKeys("Pera Peric");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name = 'department']")).sendKeys("Administration");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name = 'phone']")).sendKeys("089664583741");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(@class, 'add')][contains(@style, 'inline')]")).click();
		}
	}

}
