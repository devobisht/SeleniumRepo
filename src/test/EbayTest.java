package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayTest {
	
	WebDriver driver;
	@BeforeTest
	public void  lunchEbay() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.ebay.com");
		driver.manage().deleteAllCookies();
	}
	@Test
	public void Tests() throws InterruptedException {
		
	WebElement enter=	driver.findElement(By.xpath("//input[@id='gh-ac']"));
	
	enter.sendKeys("laptops");
	Thread.sleep(3000);
	enter.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//div[@class='x-refine__select__svg']//span//input[@aria-label='Dell']")).click();
	String find=driver.findElement(By.xpath("//span[contains(text(),' (1,492)') and @class='x-refine__multi-select-histogram']")).getAttribute("");
	
	System.out.println(find);
	}
	

}
