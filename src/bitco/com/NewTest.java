package bitco.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;
	
	@BeforeTest
	 public void run() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void lunch() {
		driver.get("https://ui.cogmento.com/companies");
		
	}

	
@Test(priority = 2)
public void logIn() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dev.bisht50@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("Test@123");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
}

}
	