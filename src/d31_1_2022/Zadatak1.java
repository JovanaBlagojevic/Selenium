package d31_1_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver_lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s.bootsnipp.com/iframe/Dq2X");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		boolean jesteUgaseno;

		for (int i = 5; i > 0; i--) {
			Thread.sleep(2000);
			try {

				driver.findElement(By.className("close")).click();
				jesteUgaseno = true;
			} catch (Exception e) {
				jesteUgaseno = false;
			}
			if (jesteUgaseno) {
				System.out.println("Obrisano je jedno obavestenje.");
			} else {
				System.out.println("Nepostojeci element.");
			}
		}

	}
}
